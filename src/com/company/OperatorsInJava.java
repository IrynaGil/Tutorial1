package com.company;

public class OperatorsInJava {
    public static void main(String[] args) {
        System.out.println("The Arithmetic Operators");
        System.out.println("1) + (Addition)");
        // m += 7;  это всё равно, что m = m+7;
        // Adds values on either side of the operator.
        int k = 70;
        int p = 10;
        int f = 5;
        int m = k + p;
        System.out.println(m);

        System.out.println("2) - (Subtraction)");
        // m -= 7 ; это всё равно, что m = m-7;
        // Subtracts right-hand operand from left-hand operand.
        m = m - 30;
        System.out.println(m);

        System.out.println("3) * (Multiplication)");
        // m*= 7; это всё равно, что m = m*7;
        // Multiplies values on either side of the operator.
        int s = m * f;
        System.out.println(s);

        System.out.println("4) / (Division)");
        //m/= 7;  это всё равно, что m = m/7;
        // Divides left-hand operand by right-hand operand.
        s = s / f;
        System.out.println(s);

        System.out.println("5) % (Modulus)");
        // mod - оператор деление по модулю. Даёт остаток от деления
        // Divides left-hand operand by right-hand operand and returns remainder.
        // Результат получает знак первого числа(делимого): -9 % 4 = -1, 9 % - 4 = 1, -9 % -4 = -1
        int x = 9;
        int y = 4;
        int z = x % y;
        System.out.println(z);
        double g = 7.6;
        double h = 2.9;
        double i = g % h;
        System.out.println(i);
        int q = -9;
        int w = -4;
        int e = q % w;
        System.out.println(e);

        System.out.println("6) ++ (Increment)");
        // Increases the value of operand by 1
        /* постфиксная форма инкремента (n++) - сначала используется старое значение в вычислениях
        далее в последующих вычислениях используется уже новое значение. Инкремент и декремент
        применяются только к переменной. Например, выражения типа 8++ или ++8 считаются недопустимыми. */
        int u = 2;
        u++;
        System.out.println(u);
        // префиксная форма инкремента (++n) - сразу используется новое значение в вычислениях
        int a = 2;
        int d = 2;
        int o = 2 * a++; //теперь значение o равно 4, а a равно 3
        int v = 2 * ++d; //теперь значение v равно 6, а d равно 3
        System.out.println(o);
        System.out.println(a);
        System.out.println(v);
        System.out.println(d);

        System.out.println("7) -- (Decrement)");
        // Decreases the value of operand by 1
        int t = 2;
        int c = 2;
        int j = 2 * t--; //теперь значение j равно 4, а t равно 1
        int b = 2 * --c; //теперь значение b равно 2, а c равно 1
        System.out.println(j);
        System.out.println(t);
        System.out.println(b);
        System.out.println(c);
    }

}
