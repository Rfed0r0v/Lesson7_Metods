public class Main {

    private static void printYearType(int year) {
        if (year % 400 == 0 ||(year % 100!=0 && year % 4 ==0)) {System.out.println (year + " является високосным");}
        else {System.out.println (year + " не является високосным");}
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
        printYearType(2100);

        System.out.println("Задание 2");



    }


}