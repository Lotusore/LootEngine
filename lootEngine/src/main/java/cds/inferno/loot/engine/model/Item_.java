package cds.inferno.loot.engine.model;

import cds.inferno.loot.engine.raid.Raid;

import javax.persistence.metamodel.SingularAttribute;

public class Item_ {

    public static volatile SingularAttribute<Item, Long> id;
    public static volatile SingularAttribute<Item, String> name;
    public static volatile SingularAttribute<Item, Integer> armor;
    public static volatile SingularAttribute<Item, Integer> stamina;
    public static volatile SingularAttribute<Item, Integer> intellect;
    public static volatile SingularAttribute<Item, Integer> spirit;
    public static volatile SingularAttribute<Item, Integer> agility;
    public static volatile SingularAttribute<Item, Integer> force;
    public static volatile SingularAttribute<Item, String> comment;
    public static volatile SingularAttribute<Item, Boolean> redGems;
    public static volatile SingularAttribute<Item, Boolean> yellowGems;
    public static volatile SingularAttribute<Item, Boolean> blueGems;
    public static volatile SingularAttribute<Item, Boolean> metaGems;
}
