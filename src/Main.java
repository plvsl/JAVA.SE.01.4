import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //----------------------------Entering data
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arraySize = input.nextInt();
        int numbers[] = new int[arraySize];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = input.nextInt();
        }

        double max = numbers[0] + numbers[numbers.length - 1];

        //----------------------------Counting
        for (int i = 1; i <= (numbers.length / 2) ; i++) {
            double sum = numbers[i] + numbers[numbers.length - i - 1];
            if (sum > max)
                max = sum;
        }

        System.out.println(max);
    }
}
