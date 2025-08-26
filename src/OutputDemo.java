public class OutputDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Numbers: \t");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " \t");
        }
        System.out.println();
        System.out.print("Index: \t\t");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " \t");
        }
        System.out.println();
    }
}
