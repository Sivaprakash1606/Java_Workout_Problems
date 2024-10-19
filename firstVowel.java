import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class firstVowel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String[] st=str.split(" ");
        Map<Character,Integer> vow=new HashMap<>();
        vow.put('a',1);
        vow.put('e',1);
        vow.put('i',1);
        vow.put('o',1);
        vow.put('u',1);
        vow.put('A',1);
        vow.put('E',1);
        vow.put('I',1);
        vow.put('O',1);
        vow.put('U',1);

        for(String word:st){
            char ch=word.charAt(0);
            if(vow.containsKey(ch)){
                System.out.print(Character.toString(ch));
            }
        }

    }
}
