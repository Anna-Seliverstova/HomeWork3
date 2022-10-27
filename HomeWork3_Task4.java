import java.util.Scanner;

public class HomeWork3_Task4 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter seconds:");
        int secs = scanner.nextInt();
        int hr = secs / 3600;
        int min = secs % 3600 / 60;
        int sec = secs % 60;

        if (secs >= 0 && secs >= 3600) {
            System.out.println(hr + " " + "hr" + " " + min + " " + "min" + " " + sec + " " + "sec");
        } else if (secs >= 0 && secs <= 3600) {
            System.out.println(min + " " + "min" + " " + sec + " " + "sec");
        } else {
            System.out.println("error");
        }

        scanner.close();
    }

}
