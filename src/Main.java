import java.time.LocalDate;

public class Main {

    private static void printYearType(int year) {
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {System.out.println (year + " является високосным");}
        else {System.out.println (year + " не является високосным");}
    }

    public static void decideTypeOfApplication(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке.");
        if (clientOS == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке.");
        if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        if (clientOS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
    }

    public static int calculateTimeOfDelivery (int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <20 ) deliveryDays =1;
        if (deliveryDistance >= 20 && deliveryDistance <60 ) deliveryDays =2;
        if (deliveryDistance >= 60 && deliveryDistance <100 ) deliveryDays =3;
        return deliveryDays;
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
        printYearType(2100);

        System.out.println("\nЗадание 2");
        int currentYear = LocalDate.now().getYear();
        decideTypeOfApplication(1,currentYear);

        System.out.println("\nЗадание 3");
        System.out.println("Потребуется дней: " + calculateTimeOfDelivery(25));

        System.out.println("\nЗадание 4");
        String testString = "aabccddefgghiijjkk.";

        for (int i = 0; i < testString.length()-1; i++) {
            if (testString.charAt(i) == testString.charAt(i+1)){
                System.out.println("Имеется дубль - символ '" +testString.charAt(i+1) + "' в позиции " + (i+1));
                break;
            }
        }


    }


}