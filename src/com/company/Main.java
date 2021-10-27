package com.company;

import ibadts.Collection;

import static ibio.Helpers.*;

public class Main {

    public static void main(String[] args) {
        homework_1();
        homework_2();
        homework_3();

    }

    static void homework_1() {
        Collection<String> NAMES = new Collection<>();
        NAMES.add(new String[]{"John", "Marie"});
        for (int i = 0; i <= 2; i++) {
            NAMES.resetNext();
            while (NAMES.hasNext()) {
                System.out.print(NAMES.getNext() + " ");
            }
            System.out.println();
        }
    }

    static void homework_2() {
        Collection<Integer> numbers = new Collection<>();

        boolean flag = true;
        int t = 0;
        while (flag) {
            int number = inputInt("Enter an integer: ");
            if (number <= 0)
                flag = false;
            else {
                numbers.addItem(number);
                t = number;
            }
        }
        while (numbers.hasNext()) {
            int number = numbers.getNext();
            if (number > t)
                output(number);
        }
    }

    static void homework_3() {
        Collection<Integer> numbers = new Collection<>();
        int sum = 0;
        int count = 0;

        boolean flag = true;
        while (flag) {
            int number = inputInt("Enter an integer: ");
            if (number <= 0)
                flag = false;
            else {
                numbers.addItem(number);
                sum += number;
                count++;
            }
        }
        double average = (double) sum / count;

        while (numbers.hasNext()) {
            int one_number = numbers.getNext();
            if (Math.abs((average - one_number) / ((average + one_number) / 2)) > 0.5)
                System.out.println(one_number);
        }

    }
}
