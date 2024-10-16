import java.util.Scanner;

public class Last_char_words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        String[] strs=str.split(" ");
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char ch=word.charAt(word.length()-1);
            if(Character.isDigit(ch)){
                continue;
            }else {
                result+=word.charAt(word.length()-1);

            }
        }
        System.out.println(result);
    }
}
