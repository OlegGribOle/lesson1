public class Task {

    public static void printThreeWords() {
        System.out.println("Задание 1:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        System.out.println();
        System.out.println("Задание 2:");
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательнная");
    }

    public static void printColor(int value) {
        System.out.println();
        System.out.println("Задание 3:");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        System.out.println();
        System.out.println("Задание 4:");
        int a = 5;
        int b = 3;
        if (a >= b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");

    }

    public static boolean betweenNumbers(int a, int b) {
        System.out.println();
        System.out.println("Задание 5:");
        return a + b >= 10 && a + b <= 20;
    }

    public static void numMoreLess(int a) {
        System.out.println();
        System.out.println("Задание 6:");
        if (a < 0)
            System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
    }

    public static boolean boolNumMoreLess(int a) {
        System.out.println();
        System.out.println("Задание 7:");
        return a < 0;
    }

    public static void copyString(String str, int copy) {
        System.out.println();
        System.out.println("Задание 8:");
        for (int i = 0; i < copy; i++)
            System.out.println(str);
    }

    public static boolean isLeapYear() {
        System.out.println();
        System.out.println("Задание 9:");
        int year = 2000;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        else return false;
    }

    public static void rotateZeroOne() {
        System.out.println();
        System.out.println("Задание 10:");
        int[] arr = {1, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                System.out.println(arr[i]);
            } else {
                arr[i] = 1;
                System.out.println(arr[i]);
            }
        }

    }

    public static void writeInArray() {
        System.out.println();
        System.out.println("Задание 11:");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void doubleLessSix() {
        System.out.println();
        System.out.println("Задание 12:");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " ");
            } else System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void xSqadArray() {System.out.println();
        System.out.println("Задание 13:");
        int[][] arr1 = new int[4][4];
        for (int i = 0; i < arr1.length; i++) {
            int[] arr2 = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (i == j || (i+j == (arr2.length -1)))
                    arr2[j] = 1;
                System.out.print(arr2[j] + " ");
            }
            System.out.println();
        }



    }

    public static void createArray(int len, int initialValue) {
        System.out.println();
        System.out.println("Задание 14:");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
