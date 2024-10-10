import java.util.Scanner;

public class Count_lowercase {
    public static void main(String[] args) {
        int lower=0;
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch>='a' && ch<='z'){
                lower++;
            }
        }
        if(lower>0)
        {
            System.out.println(lower);
        }else
        {
            System.out.println("NO");
        }
    }
}
