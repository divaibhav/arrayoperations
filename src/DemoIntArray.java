import java.util.Scanner;

// new java class, count the odd integer on even indexes, take user input to create array, and print count
public class DemoIntArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter an integer");
            numbers[i] = scanner.nextInt();
        }
        // count the odd integers on even index
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(i % 2 == 0){
                //even index
                if(numbers[i] % 2 != 0){
                    // odd number
                    count ++;
                }
            }
        }
        System.out.println("number of odd integers on even indexes = " + count);
    }
}
