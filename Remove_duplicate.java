import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Remove_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//        StringBuilder word=new StringBuilder();
        String word="";
//        Map<Character,Integer> dup = new HashMap<>();
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(!dup.containsKey(ch)){
//                dup.put(ch,1);
////                word.append(ch);
//                word+=ch;
//            }
//        }
//        System.out.println(word);
        for(int i=0;i<str.length();i++){
            if(word.indexOf(str.charAt(i))==-1){
                word+=str.charAt(i);
            }
        }
        System.out.println(word);
    }
}
