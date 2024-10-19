import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
//        String s=Integer.toString(input);
//        char ch[]=s.toCharArray();
//        int result=0;
//        for (int i=0;i<ch.length;i++){
//            result+=ch[i];
//        }if(result%3==0){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
        int result=0;
        while (input!=0){
            int last=input%10;
            input=input/10;
            result=result+last;


        }if(result%3==0) System.out.println(true);
        else System.out.println(false);

    }
}
