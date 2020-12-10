package com.infoshare.java8.class1;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {

        String str = null;
        str = "r";

        Optional<String> optionalS = Optional.ofNullable(str);
        System.out.println(optionalS.isEmpty());
    }
}
