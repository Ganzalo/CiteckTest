package ru.fedorov;

/*
написать алгоритм проверки корректности регулярного выражения, которое включает [,],(,)
т.е., например ([][[]()]) - правильно, ([][]()]) – неправильно
 */

import java.util.Stack;

public class Task2 {

    public static boolean checkPattern(String input) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char chx = stack.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
                                || (ch == ')' && chx != '('))
                            return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }

}
