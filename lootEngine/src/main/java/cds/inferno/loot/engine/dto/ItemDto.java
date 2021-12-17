package cds.inferno.loot.engine.dto;

import cds.inferno.loot.engine.raid.Raid;

public class ItemDto {

    private Long id;
    private String name;
    private Integer armor;
    private Integer stamina;
    private Integer intellect;
    private Integer spirit;
    private Integer agility;
    private Integer force;
    private String comment;
    private boolean redGems;
    private boolean yellowGems;
    private boolean blueGems;
    private boolean metaGems;
    private Raid raid;

    public ItemDto() {
    }

    public ItemDto(String name, Integer armor, Integer stamina, Integer intellect, Integer spirit, Integer agility, Integer force, String comment, boolean redGems, boolean yellowGems, boolean blueGems, boolean metaGems, Raid raid) {
        this.name = name;
        this.armor = armor;
        this.stamina = stamina;
        this.intellect = intellect;
        this.spirit = spirit;
        this.agility = agility;
        this.force = force;
        this.comment = comment;
        this.redGems = redGems;
        this.yellowGems = yellowGems;
        this.blueGems = blueGems;
        this.metaGems = metaGems;
        this.raid = raid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public Integer getSpirit() {
        return spirit;
    }

    public void setSpirit(Integer spirit) {
        this.spirit = spirit;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getForce() {
        return force;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isRedGems() {
        return redGems;
    }

    public void setRedGems(boolean redGems) {
        this.redGems = redGems;
    }

    public boolean isYellowGems() {
        return yellowGems;
    }

    public void setYellowGems(boolean yellowGems) {
        this.yellowGems = yellowGems;
    }

    public boolean isBlueGems() {
        return blueGems;
    }

    public void setBlueGems(boolean blueGems) {
        this.blueGems = blueGems;
    }

    public boolean isMetaGems() {
        return metaGems;
    }

    public void setMetaGems(boolean metaGems) {
        this.metaGems = metaGems;
    }

    public Raid getRaid() {
        return raid;
    }

    public void setRaid(Raid raid) {
        this.raid = raid;
    }
}
