public class BasicArrays {
    public static void main(String[] args) {
        int[] marks = new int[5];
        boolean[] isUsersActive = new boolean[5];

        //System.out.println("marks = " + marks);
        System.out.println(marks[0]);
        System.out.println(isUsersActive[0]);

        // initialize an index
        marks[0] = 100;

        // printing array elements using for loop
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + ", " );
        }
        System.out.println();
        int[] mathMarks = {78, 56, 75, 98, 46};
        // array have a property called length, that will store the number of elements
        // in an array, or you can say size of array

        // arrayName.propertyName
        // mathMarks.length
        System.out.println(mathMarks.length);
        for (int i = 0; i < mathMarks.length; i++) {
            System.out.println(mathMarks[i]);
        }



    }
}
