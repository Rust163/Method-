public class Main {

    public static void theOnsetOfaLeapYear(int years) {
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println(years + " год является високосным");
        } else System.out.println(years + "год не является високосным");
    }

    private static void installingTheApp(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите облегченную версию приложения iOS");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOs == 1) {
            System.out.println("Установите облегченную версию приложения Android");
        }
    }

    public static void deliverBankingProduct(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает сутки.");
        } else if (deliveryDistance <= 60) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает двое суток.");
        } else if (deliveryDistance <= 100) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает  трое суток.");
        }
    }




    public static void main (String[]args) {
        int years = 2025;
        theOnsetOfaLeapYear(years);

        int clientOs = 0;
        int clientDeviceYear = 2016;
        installingTheApp(clientOs, clientDeviceYear);

        int deliveryDistance = 90;
        deliverBankingProduct(deliveryDistance);
    }
    }
