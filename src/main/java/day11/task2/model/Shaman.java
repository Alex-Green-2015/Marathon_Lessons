package day11.task2.model;

import day11.task2.model.ability.Healer;
import day11.task2.model.ability.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    public static final double PHYSICAL_DEFENSE = 0.2;
    public static final double MAGICAL_DEFENSE = 0.2;
    public static final int PHYSICAL_ATTACK = 10;
    public static final int MAGICAL_ATTACK = 15;
    public static final int HEAL_HIMSELF_POINTS = 50;
    public static final int HEAL_TEAMMATE_POINTS = 30;

    private int magicAtt;

    public Shaman() {
        super(PHYSICAL_DEFENSE, MAGICAL_DEFENSE, PHYSICAL_ATTACK);
        this.magicAtt = MAGICAL_ATTACK;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int magicalAttackScore = (int) Math.round(magicAtt * (1 - hero.getMagicDef()));
        hero.reduceHealthPointsBy(magicalAttackScore);
    }

    @Override
    public void healHimself() {
        increaseHealthPointsBy(HEAL_HIMSELF_POINTS);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.increaseHealthPointsBy(HEAL_TEAMMATE_POINTS);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
