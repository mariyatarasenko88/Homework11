public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkTheYears(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }


    public static void task1() {
        System.out.println("Задача 1");
        int year1 = 1987;
        checkTheYears(year1);
    }

    public static void loadSystem(int system, int year) {
        if (system == 0) {
            if (year > 2022) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (year > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int OS = 0;
        int deviceYear = 2005;
        loadSystem(OS, deviceYear);
    }

    public static int checkDelivery(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется 1 день");
            return 1;
        }
        if (distance > 100) {
            System.out.println("Доставки нет");
            return 0;
        }
        if (distance > 20 || distance <= 60) {
            System.out.println("Потребуется для доставки " + 2 + " дня");
            return 2;
        }
        if (distance > 60 || distance <= 100) {
            System.out.println("Потребуется для доставки " + 3 + " дня");
            return 3;
        }
        return distance;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 21;
        checkDelivery(deliveryDistance);
    }
}