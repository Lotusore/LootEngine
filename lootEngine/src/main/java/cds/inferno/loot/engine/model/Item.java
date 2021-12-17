package cds.inferno.loot.engine.model;

import cds.inferno.loot.engine.raid.Raid;

import javax.persistence.*;

@Entity
@Table(
        name = "ITEM"
)
public class Item {

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

    public Item(){}

    @Id
    @Column(name = "ID")
    @GeneratedValue
    public Long getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @Column(name = "AMOR")
    public Integer getArmor() {
        return armor;
    }

    @Column(name = "STAMINA")
    public Integer getStamina() {
        return stamina;
    }

    @Column(name = "INTELLECT")
    public Integer getIntellect() {
        return intellect;
    }

    @Column(name ="SPIRIT")
    public Integer getSpirit() {
        return spirit;
    }

    @Column(name = "AGILITY")
    public Integer getAgility() {
        return agility;
    }

    @Column(name = "FORCE")
    public Integer getForce() {
        return force;
    }

    @Column(name = "COMMENT")
    public String getComment() {
        return comment;
    }

    @Column(name = "REDGEMS")
    public boolean isRedGems() {
        return redGems;
    }

    @Column(name = "YELLOWGEMS")
    public boolean isYellowGems() {
        return yellowGems;
    }

    @Column(name = "BLUEGEMS")
    public boolean isBlueGems() {
        return blueGems;
    }

    @Column(name = "META")
    public boolean isMetaGems() {
        return metaGems;
    }

    @Column(name = "RAID")
    public Raid getRaid() {
        return raid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public void setSpirit(Integer spirit) {
        this.spirit = spirit;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRedGems(boolean redGems) {
        this.redGems = redGems;
    }

    public void setYellowGems(boolean yellowGems) {
        this.yellowGems = yellowGems;
    }

    public void setBlueGems(boolean blueGems) {
        this.blueGems = blueGems;
    }

    public void setMetaGems(boolean metaGems) {
        this.metaGems = metaGems;
    }

    public void setRaid(Raid raid) {
        this.raid = raid;
    }
}
