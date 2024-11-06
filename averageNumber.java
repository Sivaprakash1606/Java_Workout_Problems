import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i< a.length;i++){
            a[i]=sc.nextInt();
        }
        int limit1=sc.nextInt();
        int limit2=sc.nextInt();
        int ans=0;
        int count=0;
        for(int l=limit1;l<=limit2;l++){
            if(l<a.length){
                ans=ans+a[l];
                count++;
            }else{
                break;
            }
        }

        int result=ans/count;
        System.out.println(result);
    }
}
