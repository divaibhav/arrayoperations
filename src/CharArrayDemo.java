import java.util.Scanner;

public class CharArrayDemo {
    public static void main(String[] args) {
        char[] name = {'R', 'a', 'm', 'e', 's', 'h', 'A'};
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
            char currentChar = name[i];
            // if
            // switch
            switch (currentChar){
                case 'A', 'a', 'E', 'e', 'i', 'I', 'u', 'U', 'o', 'O':
                    count ++;
            }
        }
        System.out.println("vowel count = " + count);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
         char givenCharacter = scanner.next().charAt(0);
         boolean flag = false;
        for (int i = 0; i < name.length; i++) {
            if(givenCharacter == name[i]){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Character is  present");
        } else{
            System.out.println("Character is  not present");
        }
        System.out.println("Enter another character");
        givenCharacter = scanner.next().charAt(0);
        int givenCharacterCount = 0;
        for (int i = 0; i < name.length; i++) {
            if(givenCharacter == name[i]){
                givenCharacterCount ++;
            }
        }
        System.out.println("givenCharacterCount = " + givenCharacterCount);
    }
}
// count all the vowels in it
// find whether the given character is present in your name like if user input "k" you say not present
// count the number of occurrence of given letter
