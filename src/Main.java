public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        task1();
        //Задача 2
        System.out.println("Задача 2");
        task2();
        //Задача 3
        System.out.println("Задача 3");
        task3();
    }

    private static void task3() {
        int deliveryDistance = 95;
        int deliveryTime = deliveryTime(deliveryDistance);
        if (deliveryTime == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    private static int deliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime++;
        } else if (deliveryDistance > 60) {
            deliveryTime += 2;
        } else if (deliveryDistance > 100) {
            deliveryTime = -1;
        }
        return deliveryTime;
    }
    private static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2020;
        versionSelections(clientOS, clientDeviceYear);
    }

    private static void versionSelections(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (iosAnaAndroidAge(clientDeviceYear)) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (iosAnaAndroidAge(clientDeviceYear)) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    private static boolean iosAnaAndroidAge(int clientDeviceYear) {
        return clientDeviceYear < 2015;
    }

    private static void task1() {
        int year = 2024;
        printYear(year);
    }

    private static void printYear(int year) {
        if (isaBoolean(year)) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год является не високосным");
        }
    }

    private static boolean isaBoolean(int year) {
        return year % 4 == 0 && year % 100 != 0 && year > 1584 || year % 400 == 0;
    }

}