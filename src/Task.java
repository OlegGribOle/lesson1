public class Task {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательнная");
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");

    }

    public static boolean betweenNumbers(int a, int b) {
        if (a + b >= 10 && a + b <= 20)
            return true;
        else return false;
    }

    public static void numMoreLess(int a) {
        if (a < 0)
            System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
    }

    public static boolean boolNumMoreLess(int a) {
        if (a < 0)
            return true;
        else return false;
    }



}
