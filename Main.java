//Java program to find the number of occurrences of a character in a string without using a loop.
import java.util.Scanner;
public class Main {
    public static void duplicateCharacterOccurences(String str, char ch) {
        String removedCharaterStr=str.replace(ch+"", "");
        System.out.println(ch +" occured: "+(str.length()-removedCharaterStr.length()));
    }
    public static void main(String[] args) {
        System.out.println("Compile by Shubham Singh Rawat");
        Scanner s = null;
        
        try {
            s= new Scanner(System.in);
            System.out.print("\nEnter a String: ");
            String str = s.nextLine();
            System.out.print("\nEnter the character you want to find occurence: ");
            char ch = s.nextLine().charAt(0);
            duplicateCharacterOccurences(str,ch);
        } finally{
            if(s!=null){
                s.close();
            }
        }
    }
}
