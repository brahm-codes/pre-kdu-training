import java.util.Scanner;

public class Java_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter first string");
        s1 = s.nextLine();
        System.out.println("Enter second string");
        s2 = s.nextLine();
        System.out.println("The length of the first string is " + s1.length());
        System.out.println("The length of the second string is " + s2.length());
        if(s1.length()==s2.length()){
            System.out.println("The lengths of the two strings are the same");
        }
        else{
            System.out.println("The lengths of the two strings are not the same");
        }
        if(s1.equals(s2)){
            System.out.println("Two strings are equal");
        }
        else{
            System.out.println("Two strings are not equal");
        }
    }
}
