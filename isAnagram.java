import java.util.Arrays;
import java.util.Scanner;

//import java.util.HashMap;
//import java.util.Scanner;
//public class isAnagram {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str1=sc.nextLine();
//        String str2=sc.nextLine();
//
//        if(str1.length()!=str2.length()){
//            System.out.println(false);
//            return;
//        }
//
//        HashMap<Character,Integer> map =new HashMap<>();
//        for(int i=0;i<str1.length();i++){
//            char ch=str1.charAt(i);
//            map.put(ch,map.getOrDefault(ch,0)+1);
////            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
////            else map.put(ch,1);
//        }
//
////        boolean find=false;
//        for(int j=0;j<str2.length();j++){
//            char s=str2.charAt(j);
//            if(map.containsKey(s) & map.get(s)>0){
//                map.put(s,map.get(s)-1);
////                find=true;
//            }else{
//                System.out.println(false);
//                return;
////                find=false;
////                break;
//            }
//        }
//        System.out.println(true);
////        if(find){
////            System.out.println(true);
////        }else System.out.println(false);
//    }
//}
class isAnagram{
    public static boolean iAnagram(String s1,String s2){
        if (s1.length()!=s2.length()) return false;
        char[] ch1= s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean result=iAnagram(s1,s2);
        if (result) System.out.println("The strings are Anagrams");
        else System.out.println("The strings are not Anagram");
    }

}