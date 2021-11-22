package day11.task2;

import day11.task2.model.*;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        // Воин атакует Паладина
        warrior.physicalAttack(paladin);
        paladin.showHealthStatus();

        // Паладин атакует Мага
        paladin.physicalAttack(magician);
        magician.showHealthStatus();

        // Шаман лечит Мага
        shaman.healTeammate(magician);
        magician.showHealthStatus();

        // Маг атакует Паладина, тип атаки М
        magician.magicalAttack(paladin);
        paladin.showHealthStatus();

        // Шаман атакует Воина, тип атаки Ф
        shaman.physicalAttack(warrior);
        warrior.showHealthStatus();

        // Паладин лечит себя
        paladin.healHimself();
        paladin.showHealthStatus();

        // Воин атакует Мага 5 раз
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            magician.showHealthStatus();
        }
    }
}
