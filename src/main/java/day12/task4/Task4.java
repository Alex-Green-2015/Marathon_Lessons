package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balin");
        members1.add("Paul Kantner");
        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("John Lennon");
        members2.add("Paul McCartney");
        members2.add("Ringo Starr");
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        System.out.println("Изменения в первой группе:");
        band1.printMembers();
        band1.addMember("Bob John");
        band1.printMembers();

        System.out.println("\nИзменения во второй группе:");
        band2.printMembers();
        band2.removeMember("Ringo Starr");
        band2.removeMember("Ivan Petrov"); // нет такого участника
        band2.printMembers();

        System.out.println("\nГруппы после слияния");
        MusicBand.transferMembers(band2, band1);
        band2.printMembers();
        band1.printMembers();
    }
}
