import java.util.Scanner;

public class Odd_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i=i+2){
            char ch=str.charAt(i);
            System.out.println(ch);
        }
    }
}
