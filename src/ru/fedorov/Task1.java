package ru.fedorov;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
имеется массив чисел, получить список вида {число, количество вхождений числа в массив},
список должен быть отсортирован по количеству вхождений, внутри по возрастания числа.
Использовать можно любой алгоритмический язык.
 */

public class Task1 {

    public TreeMap<Integer, Integer> sequenceNumber(int[] number)  {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : number) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return new TreeMap<>(map);
    }

}
