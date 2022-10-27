import java.util.Scanner;

public class HomeWork3_Task3 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number from 1 to 5:");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("First finger of the hand");
                break;
            case 2:
                System.out.println("Second finger of the hand");
                break;
            case 3:
                System.out.println("Third finger of the hand");
                break;
            case 4:
                System.out.println("Fourth finger of the hand");
                break;
            case 5:
                System.out.println("Fifth finger of the hand");
                break;
            default:
                System.out.println("This finger doesn't exist");
        }
        scanner.close();
    }

}
