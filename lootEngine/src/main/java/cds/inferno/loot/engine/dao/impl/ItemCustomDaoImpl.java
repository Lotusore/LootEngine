package cds.inferno.loot.engine.dao.impl;

import cds.inferno.loot.engine.dao.ItemCustomDao;
import cds.inferno.loot.engine.model.Item;
import cds.inferno.loot.engine.model.Item_;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCustomDaoImpl implements ItemCustomDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Item> findSpecificItems(Item item) {
        CriteriaQuery<Item> query = buildFindSpecificItemQuery(item);
        return entityManager.createQuery(query)
                .getResultList();
    }

    private CriteriaQuery<Item> buildFindSpecificItemQuery(Item item) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Item> query = builder.createQuery(Item.class);
        Root<Item> root = query.from(Item.class);
        List<Predicate> conditions = new ArrayList<>();
        boolean firstConditionDone = false;
        if(null != item){
            if(null != item.getId()){
                Predicate id = builder.equal(root.get(Item_.id),item.getId());
                conditions.add(id);
                firstConditionDone = true;
            }
            if(StringUtils.isNotBlank(item.getName())){
                Predicate name;
                if(firstConditionDone){
                    name = builder.and(builder.like(root.get(Item_.name),"%"+item.getName()+"%"));
                }else{
                    name = builder.like(root.get(Item_.name),"%"+item.getName()+"%");
                    firstConditionDone = true;
                }
                conditions.add(name);
            }
            if(null != item.getAgility()){
                Predicate agility;
                if(firstConditionDone){
                    agility = builder.and(builder.equal(root.get(Item_.agility),item.getAgility()));
                }else{
                    agility = builder.equal(root.get(Item_.agility),item.getAgility());
                    firstConditionDone = true;
                }
                conditions.add(agility);
            }
            if(null != item.getForce()){
                Predicate force;
                if(firstConditionDone){
                    force = builder.and(builder.equal(root.get(Item_.force),item.getForce()));
                }else{
                    force = builder.equal(root.get(Item_.force),item.getForce());
                    firstConditionDone = true;
                }
                conditions.add(force);
            }
            if(null != item.getIntellect()){
                Predicate intellect;
                if(firstConditionDone){
                    intellect = builder.and(builder.equal(root.get(Item_.intellect),item.getIntellect()));
                }else{
                    intellect = builder.equal(root.get(Item_.intellect),item.getIntellect());
                    firstConditionDone = true;
                }
                conditions.add(intellect);
            }
            if(null != item.getSpirit()){
                Predicate spirit;
                if(firstConditionDone){
                    spirit = builder.and(builder.equal(root.get(Item_.spirit),item.getSpirit()));
                }else{
                    spirit = builder.equal(root.get(Item_.spirit),item.getSpirit());
                    firstConditionDone = true;
                }
                conditions.add(spirit);
            }
            if(null != item.getStamina()){
                Predicate stamina;
                if(firstConditionDone){
                    stamina = builder.and(builder.equal(root.get(Item_.stamina),item.getStamina()));
                }else{
                    stamina = builder.equal(root.get(Item_.stamina),item.getStamina());
                    firstConditionDone = true;
                }
                conditions.add(stamina);
            }
            if(StringUtils.isNotBlank(item.getComment())){
                Predicate comment;
                if(firstConditionDone){
                    comment = builder.and(builder.like(root.get(Item_.comment),"%"+item.getComment()+"%"));
                }else{
                    comment = builder.like(root.get(Item_.comment),"%"+item.getComment()+"%");
                    firstConditionDone = true;
                }
                conditions.add(comment);
            }
        }
        query.where(conditions.toArray(new Predicate[conditions.size()]));
        return query;
    }
}
