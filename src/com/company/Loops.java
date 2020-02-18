package com.company;

import animal.Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Loops");

        System.out.println("while");
        //while	Повторяет оператор или группу операторов, пока заданное условие является true. Цикл проверяет условие до выполнения тела цикла.

        int x = 10;
        while (x < 15) {
            System.out.println("Значение x: " + x);
            x++;
        }

        System.out.println("for");
        //for Выполняет последовательность операторов несколько раз и сокращает код, которым управляет переменная цикла.

        for (int z = 10; z < 15; z++) {
            System.out.print("Значение z: " + z);
            System.out.print("\n");
        }

        System.out.println("Улучшенный цикл for ");
        //улучшенный for Выполняет последовательность операторов несколько раз и сокращает код, которым управляет переменная цикла.
        Integer[] numbers = {10, 20, 30, 40, 50, 17, 25, 40, 28, 57};

        for (int f : numbers) {
            System.out.print(f);
            System.out.print(",");
        }
        System.out.print("\n");

        String[] names = {"Олег", "Иван", "Дима", "Юля"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
        System.out.print("\n");
        System.out.println("----------------------------------------");

/*        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(18);
        arrayList.addAll(Arrays.asList(numbers));
        arrayList.remove(Integer.valueOf(10));

        long count = arrayList.stream()
                .filter(integer -> integer < 20)
                .count();

        System.out.println("count = " + count);

        Arrays.stream(numbers)
                .filter(i -> i > 20)
                .filter(i -> i%2 == 1)
                .forEach(i -> System.out.print("" + i + ", "));

        System.out.println("");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");

        Arrays.stream(numbers)
                .filter(i -> i > 20)
                .filter(i -> i%2 == 1)
                .map(i -> new Animal("animal "+i, Integer.valueOf("" + i), "new breed"))
                .map(Animal::getName)
                .forEach(a -> System.out.println(a));
*/
        System.out.println("do...while ");
        //do...while Выполняется цикл while, за исключением того, что он проверяет условия в конце тела цикла.
        //цикл do...while гарантированно выполнится, по крайней мере один раз.

        int p = 10;

        do{
            System.out.print("Значение p: " + p );
            p++;
            System.out.print("\n");
        } while( p < 15 );

        System.out.println("  ");
        System.out.println("----------------------------------------");

        System.out.println("Операторы цикла");
        //break	Завершает работу цикла или оператора switch, и передаёт выполнение следующему, который находится сразу же после цикла или оператора switch.

        int [] newNumbers = {10, 20, 30, 40, 50};

        for(int l : newNumbers ) {
            if( l == 30 ) {
                break;
            }
            System.out.print( l );
            System.out.print("\n");
        }

        System.out.println("----------------------------------------");

        //continue	Заставляет цикл, пропустить оставшуюся часть его тела и сразу перепроверить вновь его состояние сначала.

        int [] secondNumbers = {10, 20, 30, 40, 50};

        for(int m : secondNumbers ) {
            if( m == 30 ) {
                continue;
            }
            System.out.print( m );
            System.out.print("\n");
        }

    }
}
