import java.util.Scanner;

public class Reverse_sequence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=0;
        while(num!=0)
        {
            int digit=num%10;
            res=res*10+digit;
            num/=10;
        }
        System.out.println(res);

    }
}
