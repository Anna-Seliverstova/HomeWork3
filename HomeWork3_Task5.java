import java.util.Scanner;

public class HomeWork3_Task5 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter day:");
        int day = scanner.nextInt();
        System.out.println("enter month:");
        int month = scanner.nextInt();
        System.out.println("enter year:");
        int year = scanner.nextInt();
        if (day == 28 && month == 2 && year % 4 == 0 && year > 0) {
            System.out.println("tomorrow's date: " + (day + 1) + "." + month + "." + year);
        } else if (day == 28 && month == 2 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 31 && month == 1 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 31 && month == 3 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 30 && month == 4 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 31 && month == 5 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 30 && month == 6 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 31 && month == 7 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 31 && month == 8 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 30 && month == 9 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 31 && month == 10 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 30 && month == 11 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month + 1) + "." + year);
        } else if (day == 31 && month == 12 && year > 0) {
            System.out.println("tomorrow's date: 1" + "." + (month - 11) + "." + (year + 1));
        } else if ((day >= 1 && day <= 29) && (month == 4 || month == 6 || month == 9 || month == 11) && year > 0) {
            System.out.println("tomorrow's date: " + (day + 1) + "." + month + "." + year);
        } else if ((day >= 1 && day <= 30) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && year > 0) {
            System.out.println("tomorrow's date: " + (day + 1) + "." + month + "." + year);
        } else if ((day >= 1 && day <= 27) && month == 2 && year > 0) {
            System.out.println("tomorrow's date: " + (day + 1) + "." + month + "." + year);
        } else {
            System.out.println("no such date exists");
        }
        scanner.close();
    }

}
