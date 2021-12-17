package cds.inferno.loot.engine.dao;

import cds.inferno.loot.engine.model.Item;

import java.util.List;

public interface ItemCustomDao {

    List<Item> findSpecificItems(Item item);

}
