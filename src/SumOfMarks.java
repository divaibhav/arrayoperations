import java.util.Scanner;

// operations on array
// sum of all elements in array
// WAP to accept marks of 5 subjects from user and print the total marks
// and average
public class SumOfMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter subject marks");
            marks[i] = scanner.nextInt();
        }
        double totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks = totalMarks + marks[i];
        }
        System.out.println("totalMarks = " + totalMarks);
        //calculate the average
        double averageMarks = totalMarks / marks.length;
        System.out.println("averageMarks = " + averageMarks);
        //count in how many subject student score 50 or more
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] >= 50){
                count ++;
            }
        }
        System.out.println("you scored 50 or more in " + count + " subjects");
    }
}
