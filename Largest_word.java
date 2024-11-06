import java.util.Scanner;

public class Largest_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        String result="";
        for(String word:s){
            if(word.length()>result.length()){
                result=word;
            }
        }
        System.out.println(result);
    }
}
