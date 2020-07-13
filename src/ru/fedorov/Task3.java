package ru.fedorov;


/*
написать алгоритм, как в целом числе самый правый ноль
превратить в единицу не используя циклы и рекурсию.
 */

public class Task3 {

    public static Integer moveOne(int number)  {
        return number | number + 1;
    }
}
