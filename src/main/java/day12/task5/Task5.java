package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Slick", 35));
        members1.add(new MusicArtist("Marty Balin", 28));
        members1.add(new MusicArtist("Paul Kantner", 33));
        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Ringo Starr", 40));
        members2.add(new MusicArtist("John Lennon", 39));
        members2.add(new MusicArtist("Paul McCartney", 38));
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        System.out.println("Изменения в первой группе:");
        band1.printMembers();
        band1.addMember(new MusicArtist("Bob John", 50));
        band1.printMembers();
        band1.addMember(new MusicArtist("Bob John", 50));
        band1.printMembers();

        System.out.println("\nИзменения во второй группе:");
        band2.printMembers();
        // Удалим участника Ringo Starr по существующему указателю
        band2.removeMember(band2.getMembers().get(0));
        band2.printMembers();
        band2.removeMember(new MusicArtist("Ivan Petrov", 112)); // нет такого участника
        band2.printMembers();
        // проверка работы метода MusicArtist.equals()
        band2.removeMember(new MusicArtist("Paul McCartney", 38));
        band2.printMembers();

        System.out.println("\nГруппы после слияния");
        MusicBand.transferMembers(band2, band1);
        band2.printMembers();
        band1.printMembers();
    }
}
