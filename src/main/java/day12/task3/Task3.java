package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        List<MusicBand> bandsOriginal = new ArrayList<>();
        List<MusicBand> bandsAfter2000 = new ArrayList<>();

        for (int i = 0; i <= 12; i++) {
            // добавляем символ из ASCII таблицы к имени
            String name = "Band-" + (char) (65 + i); // '65' это 'A'

            // создаем случайный год из диапозона 1990 - 2009
            int year = 1990 + random.nextInt(20);

            bandsOriginal.add(new MusicBand(name, year));
        }

        Collections.shuffle(bandsOriginal);

        bandsAfter2000 = groupsAfter2000(bandsOriginal);

        System.out.println(bandsOriginal + "\n" );
        System.out.println(bandsAfter2000);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }

}
