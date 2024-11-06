import java.util.Scanner;

public class removeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String letter=sc.nextLine();
        char l=letter.charAt(0);
        String result=input.replace(letter,"");
        System.out.println(result);
        System.out.println();
//        String result="";
//        for(int i=0;i<input.length();i++){
//            char ch=input.charAt(i);
//            if(ch!=l){
//                result=result+Character.toString(ch);
//            }
//        }
//        System.out.println(result);
    }
}
