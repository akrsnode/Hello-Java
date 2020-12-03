package com.infoshare.java8.class1;

public class Klasa {

    public static void main(String[] args) {

        new ImplInt();

        new IntFunc() {
            @Override
            public void doSmt() {

            }
        };

        //Klasa anonimowa
        IsEven isEven = new IsEven() {

            @Override
            public boolean isEven(int num) {
                return num % 2 == 0;
            }
        };

        boolean result = isEven.isEven(4);

        //Klasyczne
        IsEven isEven1 = new IsEvenImpl();
        isEven1.isEven(4);

        //Lambda
        //Interface funkcyjny to IsEven i ConnectStrings

        IsEven isEven2 = x -> x % 2 == 0;
        result = isEven2.isEven(3);

        ConnectStrings stringMerging = text -> text + text;
        String mergedString = stringMerging.merge("Adrian ");

        AddNum addNum = (num1, num2) -> num1 + num2;
        int sumNum = addNum.addNum(1, 2);

        //Testing
        System.out.println(result);
        System.out.println(mergedString);
        System.out.println(sumNum);

    }
}
