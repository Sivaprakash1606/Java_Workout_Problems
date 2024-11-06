import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        int sum=0;
        for(int i=0;i<input;i++){
            if(input%2==0){
                sum=sum+i;
                if(sum==input || sum>input) break;
            }
        }
        if(sum==input){
            System.out.println("Perfect Number");
        }else System.out.println("Not perfect number");
    }
}
