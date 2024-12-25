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
        return a + b >= 10 && a + b <= 20;
    }

    public static void numMoreLess(int a) {
        if (a < 0)
            System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
    }

    public static boolean boolNumMoreLess(int a) {
        return a < 0;
    }

    public static void copyString(String str, int copy) {
        for (int i = 0; i < copy; i++)
            System.out.println(str);
    }

    public static boolean isLeapYear() {
        int year = 2000;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        else return false;
    }

    public static void rotateZeroOne() {
        int[] arr = {1, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1) {
                arr[i] = 0;
                System.out.println(arr[i]); }
            else {
                arr[i] = 1;
                System.out.println(arr[i]); }

        }

    }


}
