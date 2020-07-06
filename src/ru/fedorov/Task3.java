package ru.fedorov;


/*
написать алгоритм, как в целом числе самый правый ноль
превратить в единицу не используя циклы и рекурсию.
 */

public class Task3 {

    public static Integer moveOne(int number)  {
        if ((number & 1) == 0)
            number = number | 1;
        return number;
    }
}
