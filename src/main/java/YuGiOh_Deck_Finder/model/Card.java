package YuGiOh_Deck_Finder.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "card_table")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String desc;
    private int level;
    private String type;
    private int atk;
    private int def;
    private String race;
    private String attribute;
    private String frameType;
    private int codeLab;
    private String rarity;

    @ManyToMany(mappedBy = "cards")
    private List<Deck> decks = new ArrayList<>();

    public Card() {
    }

    public Card(Long id, List<Deck> decks, String rarity, int codeLab, String frameType, String attribute, String race, int def, int atk, String type, int level, String desc, String name) {
        this.id = id;
        this.decks = decks;
        this.rarity = rarity;
        this.codeLab = codeLab;
        this.frameType = frameType;
        this.attribute = attribute;
        this.race = race;
        this.def = def;
        this.atk = atk;
        this.type = type;
        this.level = level;
        this.desc = desc;
        this.name = name;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public int getCodeLab() {
        return codeLab;
    }

    public void setCodeLab(int codeLab) {
        this.codeLab = codeLab;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}
