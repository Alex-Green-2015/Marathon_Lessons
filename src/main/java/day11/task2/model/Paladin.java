package day11.task2.model;

import day11.task2.model.ability.Healer;

public class Paladin extends Hero implements Healer {
    public static final double PHYSICAL_DEFENSE = 0.5;
    public static final double MAGICAL_DEFENSE = 0.2;
    public static final int PHYSICAL_ATTACK = 15;
    public static final int HEAL_HIMSELF_POINTS  = 25;
    public static final int HEAL_TEAMMATE_POINTS  = 10;

    public Paladin() {
        super(PHYSICAL_DEFENSE, MAGICAL_DEFENSE, PHYSICAL_ATTACK);
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
        return "Paladin{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                '}';
    }
}
