package day11.task2.model;

import day11.task2.model.ability.PhysAttack;

public abstract class Hero implements PhysAttack {
    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;
    protected int health;
    protected int physAtt;
    protected double physDef;
    protected double magicDef;

    protected Hero(double physDef, double magicDef, int physAtt) {
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.health = MAX_HEALTH;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int physicalAttackScore = (int) Math.round((physAtt * (1 - hero.getPhysDef())));
        hero.reduceHealthPointsBy(physicalAttackScore);
    }

    protected void increaseHealthPointsBy(int healthPoints) {
        health += healthPoints;
        if (health > MAX_HEALTH) health = MAX_HEALTH;
        if (health < MIN_HEALTH) health = MIN_HEALTH;
    }

    protected void reduceHealthPointsBy(int healthPoints) {
        increaseHealthPointsBy(-1 * healthPoints);
    }

    public void showHealthStatus() {
        System.out.println(this.getClass().getSimpleName() + "{health=" + health + '}');
    }
}
