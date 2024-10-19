import java.util.Scanner;

public class noOfSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] st=str.split(" ");
        if(st.length -1 >=3){
            System.out.println(st.length-1);
        }else{
            System.out.println("NA");
        }
    }


}
