package com.infoshare.java8.class1;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {

        String str = "isa";
        Optional<String> optionalS = Optional.of(str);

        System.out.println(optionalS.isEmpty());
    }
}
