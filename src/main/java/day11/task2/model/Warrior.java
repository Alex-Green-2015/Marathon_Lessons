package day11.task2.model;

public class Warrior extends Hero {
    public static final double PHYSICAL_DEFENSE = 0.8;
    public static final double MAGICAL_DEFENSE = 0;
    public static final int PHYSICAL_ATTACK = 30;

    public Warrior() {
        super(PHYSICAL_DEFENSE, MAGICAL_DEFENSE, PHYSICAL_ATTACK);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                '}';
    }
}
