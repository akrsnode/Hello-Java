package com.infoshare.java8.task17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ChooseGame {

    public static void main(String[] args) {
        BoardGame boardGame1 = new BoardGame("Jenga", 26, 2600, 1, 10);
        BoardGame boardGame2 = new BoardGame("Scrabble", 96, 10000, 2, 4);
        BoardGame boardGame3 = new BoardGame("Monopoly", 100, 9999, 2, 6);
        BoardGame boardGame4 = new BoardGame("Chess", 99, 5500, 2,2);
        BoardGame boardGame5 = new BoardGame("PartyTime", 68, 5750, 4, 12);
        BoardGame boardGame6 = new BoardGame("Minecraft", 32, 14900, 2, 4);
        BoardGame boardGame7 = new BoardGame("Tajniacy", 51, 7520, 4, 8);

        List<BoardGame> games = new ArrayList<>();
        games.add(boardGame1);
        games.add(boardGame2);
        games.add(boardGame3);
        games.add(boardGame4);
        games.add(boardGame5);
        games.add(boardGame6);;
        games.add(boardGame7);

        List<String> sortOptions = games.stream()
                .filter(i -> i.maxPlayerAmount > 4
                        && i.rating > 80
                        && i.price < 15000)
                .map(BoardGame::getName)
                .map(String::toUpperCase)
                .collect(toList());

        System.out.println(sortOptions);

        Integer getAveragePrice = games.stream()
                .map(BoardGame::getPrice)
                .reduce(0, (acc, val) -> (acc + val) / 2);

        System.out.println(getAveragePrice);

        BoardGame getCheapestGame = games.stream()
                //Sorting using Comparator
//                .sorted(new Comparator<BoardGame>() {
//                    @Override
//                    public int compare(BoardGame o1, BoardGame o2) {
//                        return o1.price - o2.price;
//                }})
                .sorted((cur, nxt) -> cur.price - nxt.price)
                .limit(1)
                .findAny().get();

        System.out.println(getCheapestGame.getName());
    }
}
