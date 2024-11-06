import java.util.Scanner;

public class noOfWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        System.out.println(s.length);
    }
}
