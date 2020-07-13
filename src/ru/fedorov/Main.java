package ru.fedorov;

public class Main {

    public static void main(String[] args) {

        System.out.println(Task1.sequenceNumber(new int[]{1,2,3,1,4,2,7,8,3,5,9,1,24,4,6,4,2,1,4,6,8,2,1}));

        System.out.println(Task2.checkPattern("([][[]()])"));
        System.out.println(Task2.checkPattern("([][]()])"));

        System.out.println(Task3.moveOne(8));
        System.out.println(Task3.moveOne(7));
        System.out.println(Task3.moveOne(5));


    }
}
