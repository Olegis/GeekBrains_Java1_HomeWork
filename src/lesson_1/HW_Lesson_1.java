package lesson_1;

public class HW_Lesson_1 {

//  1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

    public static void main(String[] args) {

        System.out.println(calculate(1, 2, 3, 4));

        System.out.println(task10and20(5, 9));

        isPositiveOrNegative(-5);
        isPositiveOrNegative(10);

        System.out.println(isNegative(-1));
        System.out.println(isNegative(5));

        greetings("Олег");

    }
//  2. Создать переменные всех пройденных типов данных и инициализировать их значения.

    byte by = 1;
    short sh = 2;
    int in = 3;
    long lo = 4L;

    char ch = '#';

    float fl = 1.11f;
    double doub = 2.22;

    boolean bool = true;

//  Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//  где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static int calculate(int a, int b, int c, int d) {
        if (d == 0) return 0;
        return a * (b + (c / d));
    }

    //  Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//  в противном случае – false.

    public static boolean task10and20(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

//  Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали
//  или отрицательное. Замечание: ноль считаем положительным числом.

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

//  Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.

    public static boolean isNegative (int x) {
        return x < 0;
    }

//  Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void greetings(String name){
        System.out.println("Привет, " + name + "!");
    }

//  *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.


}
