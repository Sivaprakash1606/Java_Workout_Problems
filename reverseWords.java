import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        StringBuilder result=new StringBuilder();
//        for(int i=s.length-1;i>=0;i--){
//            result.append(new StringBuilder(s[i]).reverse().toString());
//            if(i!=0) result.append(" ");
//        }
//        System.out.println(result.toString());
//        sc.close();
        for(int i=s.length-1;i>=0;i--){
            result.append(new StringBuilder(s[i]));

        }System.out.println(result.toString());
    }
}
