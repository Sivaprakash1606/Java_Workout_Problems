import java.util.Scanner;

public class Character_At_Odd_Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();
        char[] result=input.toCharArray();
        for(int i=1;i<result.length;i=i+2){
            System.out.print(result[i]);
        }
    }
}
