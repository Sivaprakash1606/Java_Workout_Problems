import java.util.Scanner;

public class firstLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        result=result+str.charAt(0);
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                result=result+str.charAt(i+1);

            }
        }
        System.out.println(result);

    }
}
