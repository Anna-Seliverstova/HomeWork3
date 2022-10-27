import java.util.Scanner;

public class HomeWork3_Task1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first > second && first < third || first < second && first > third) {
            System.out.println("Average: " + first);
        } else if (second > first && second < third || second < first && second > third) {
            System.out.println("Average: " + second);
        } else {
            System.out.println("Average: " + third);
        }

        scanner.close();
    }

}