import java.util.Scanner;

public class noOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int count=0;
        String str=Integer.toString(input);

//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch%2==0) count++;
//        }
        while (input!=0){
            int last=input%10;
            if(last%2==0) count++;
            input=input/10;
        }

        if(count>2) System.out.println(true);
        else System.out.println(false);
    }
}
