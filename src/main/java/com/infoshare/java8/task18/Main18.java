package com.infoshare.java8.task18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main18 {

    public static void main(String[] args) {
        List<Pracownik> pracownicy = Arrays.asList(
                new Pracownik("Karol", "Wierzbicki", 24, 19, Stanowisko.KIEROWNIK),
                new Pracownik("Oliwier", "Kaczmarek", 4, 25, Stanowisko.DYREKTOR),
                new Pracownik("Zuzanna", "Wawrzyniak", 8, 26, Stanowisko.KIEROWNIK),
                new Pracownik("Adam", "Mikołajczyk", 1, 27, Stanowisko.PRACOWNIK)
        );

        //Podział wg. stażu
        pracownicy.stream()
//                .sorted((acc, cur) -> cur.getStaz() - acc.getStaz())
                .sorted(Comparator.comparing(Pracownik::getStaz).reversed())
                .limit(3)
                .forEach(System.out::println);

        //Podział wg. stanowiska
        Map<Stanowisko, List<Pracownik>> stanowiskoListMap = pracownicy.stream()
                .collect(Collectors.groupingBy(Pracownik::getStanowisko, Collectors.toList()));

        System.out.println(stanowiskoListMap);

        pracownicy.stream()
                .filter(x -> x.getWiek() < 10)
                .forEach(System.out::println);

        //lazy loading (leniwe) - jest wyliczane kiedy jest potrzebne

        //eager loading (zachłanne) - wyliczane jest od razu

    }
}
