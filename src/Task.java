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
}
