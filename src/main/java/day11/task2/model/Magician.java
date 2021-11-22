package day11.task2.model;

import day11.task2.model.ability.MagicAttack;

public class Magician extends Hero implements MagicAttack {
    public static final double PHYSICAL_DEFENSE = 0;
    public static final double MAGICAL_DEFENSE = 0.8;
    public static final int PHYSICAL_ATTACK = 5;
    public static final int MAGICAL_ATTACK = 20;

    private int magicAtt;

    public Magician() {
        super(PHYSICAL_DEFENSE, MAGICAL_DEFENSE, PHYSICAL_ATTACK);
        this.magicAtt = MAGICAL_ATTACK;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int magicalAttackScore = (int) Math.round(magicAtt * (1 - hero.getMagicDef()));
        hero.reduceHealthPointsBy(magicalAttackScore);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
