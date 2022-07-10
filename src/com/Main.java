package com;

public class Main {

    static boolean checkPositive(int number) {
        return (number > 0);
    }

    static void switchStation(String station) {
        String stationValue;

        switch(station) {
            case "Autumn":
                stationValue = "Autumn";
                break;
            case "Spring":
                stationValue = "Spring";
                break;
            case "Summer":
                stationValue = "Summer";
                break;
            case "Winter":
            default:
                stationValue = "Snowman";
                break;
        }
        System.out.println(stationValue);
    }

    public static void main(String[] args) {
        System.out.println("1, should be true");
        System.out.println(checkPositive(1));

        System.out.println("-1, should be false");
        System.out.println(checkPositive(-1));

        int numberWhile = 0;

        System.out.println("While");
        while (numberWhile < 3) {
            System.out.println(numberWhile);
            numberWhile += 1;
        }

        System.out.println("Do While");
        int numberDoWhile = 2;

        do {
            System.out.println(numberDoWhile);
            numberDoWhile += 1;
        }while (numberDoWhile < 3);

        System.out.println("For");
        for (int numberFor=0; numberFor < 3; numberFor++) {
            System.out.println(numberFor);
        }

        System.out.println("Switch");
        switchStation("Autumn");
        switchStation("Winter");
        switchStation("Summer");
        switchStation("Spring");
        switchStation("S");
    }
}
