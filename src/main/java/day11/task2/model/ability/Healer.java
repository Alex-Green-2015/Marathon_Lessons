package day11.task2.model.ability;

import day11.task2.model.Hero;

public interface Healer {
    void healHimself();
    void healTeammate(Hero hero);
}
