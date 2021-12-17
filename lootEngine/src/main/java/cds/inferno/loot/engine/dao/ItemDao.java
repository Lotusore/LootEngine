package cds.inferno.loot.engine.dao;

import cds.inferno.loot.engine.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends CrudRepository<Item, Long>, ItemCustomDao {
}
