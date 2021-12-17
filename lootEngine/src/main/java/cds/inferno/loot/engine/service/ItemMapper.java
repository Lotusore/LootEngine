package cds.inferno.loot.engine.service;

import cds.inferno.loot.engine.dto.ItemDto;
import cds.inferno.loot.engine.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemMapper {

    public Item fromDto(ItemDto itemDto){
        Item item = new Item();
        item.setAgility(itemDto.getAgility());
        item.setArmor(itemDto.getArmor());
        item.setBlueGems(itemDto.isBlueGems());
        item.setComment(itemDto.getComment());
        item.setForce(itemDto.getForce());
        item.setId(itemDto.getId());
        item.setIntellect(itemDto.getIntellect());
        item.setMetaGems(itemDto.isMetaGems());
        item.setName(itemDto.getName());
        item.setRaid(itemDto.getRaid());
        item.setRedGems(itemDto.isRedGems());
        item.setSpirit(itemDto.getSpirit());
        item.setStamina(itemDto.getStamina());
        item.setYellowGems(itemDto.isYellowGems());
        return item;
    }

    public ItemDto fromEntity(Item item){
        ItemDto itemDto = new ItemDto();
        itemDto.setAgility(item.getAgility());
        itemDto.setArmor(item.getArmor());
        itemDto.setBlueGems(item.isBlueGems());
        itemDto.setComment(item.getComment());
        itemDto.setForce(item.getForce());
        itemDto.setId(item.getId());
        itemDto.setIntellect(item.getIntellect());
        itemDto.setMetaGems(item.isMetaGems());
        itemDto.setName(item.getName());
        itemDto.setRaid(item.getRaid());
        itemDto.setRedGems(item.isRedGems());
        itemDto.setSpirit(item.getSpirit());
        itemDto.setStamina(item.getStamina());
        itemDto.setYellowGems(item.isYellowGems());
        return itemDto;
    }

}
