package com.infoshare.java8;

import java.util.Optional;
import java.util.stream.Collectors;

public class Zadanie00 {

    public static void main(String[] args) {
        System.out.println(Optional.of("a").stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
