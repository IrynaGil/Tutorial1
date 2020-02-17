package com.company;

public class MoreOperators {
    public static void main(String[] args) {
        System.out.println("Equality and Relational Operators - Операторы сравнения");
        // == 	equal to 	5 == 3 is evaluated to false
        // != 	not equal to 	5 != 3 is evaluated to true
        // > 	greater than 	5 > 3 is evaluated to true
        // < 	less than 	5 < 3 is evaluated to false
        // >= 	greater than or equal to 	5 >= 5 is evaluated to true
        // <= 	less then or equal to 	5 <= 5 is evaluated to true
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        System.out.println("Logical Operators - Логические операторы");
        // ||  conditional-OR; true if either of the boolean expression is true 	false || true is evaluated to true
        // &&  conditional-AND; true if all boolean expressions are true 	false && true is evaluated to false
        // ! - логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
        boolean c = true;
        boolean d = false;

        System.out.println("с && d = " + (c&&d));

        System.out.println("c || d = " + (c||d) );

        System.out.println("!(c && d) = " + !(c && d));

        System.out.println("Assignment Operators - Операторы присваивания");
        //=	Простой оператор присваивания, присваивает значения из правой стороны операндов к левому операнду		C = A + B, присвоит значение A + B в C
        //+= ОП «Добавления», он присваивает левому операнду значения правого		C += A, эквивалентно C = C + A
        //-= ОП «Вычитания», он вычитает из правого операнда левый операнд 	C -= A, эквивалентно C = C - A
        //*= ОП «Умножение», он умножает правый операнд на левый операнд		C * = A эквивалентно C = C * A
        ///= ОП «Деление», он делит левый операнд на правый операнд 	C /= A эквивалентно C = C / A
        //%= ОП «Модуль», он принимает модуль, с помощью двух операндов и присваивает его результат левому операнду		C %= A, эквивалентно C = C % A
        //<<= ОП «Сдвиг влево»		C << = 2, это как C = C << 2
        //>>= ОП «Сдвиг вправо»		C >>= 2, это как C = C >> 2
        //&= ОП побитового «И» («AND»)		C &= 2, это как C = C & 2
        //^= ОП побитового исключающего «ИЛИ» («XOR»)		C ^= 2, это как C = C ^ 2
        //|= ОП побитового «ИЛИ» («OR»)		C |= 2, это как C = C | 2

        int aa = 10;
        int bb = 20;
        int cc = 0;

        cc = aa + bb;
        System.out.println("cc = aa + bb = " + cc );

        cc += aa ;
        System.out.println("cc += aa  = " + cc );

        cc -= aa ;
        System.out.println("cc -= aa = " + cc );

        cc *= aa ;
        System.out.println("cc *= aa = " + cc );

        aa = 10;
        cc = 15;
        cc /= aa ;
        System.out.println("cc /= aa = " + cc );

        aa = 10;
        cc = 15;
        cc %= aa ;
        System.out.println("cc %= aa  = " + cc );

        cc <<= 2 ;
        System.out.println("cc <<= 2 = " + cc );

        cc >>= 2 ;
        System.out.println("cc >>= 2 = " + cc );

        cc >>= 2 ;
        System.out.println("cc >>= aa = " + cc );

        cc &= aa ;
        System.out.println("cc &= 2  = " + cc );

        cc ^= aa ;
        System.out.println("cc ^= aa   = " + cc );

        cc |= aa ;
        System.out.println("cc |= aa   = " + cc );

    }
}
