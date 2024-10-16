import java.util.Scanner;

public class No_Of_Space_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int s_count=0;
        int c_count=0;
//        String[] ch=str.split(" ");
//        int no=str.length()-ch.length+1;
//        System.out.println(ch.length+","+no);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                s_count++;
            }else if(ch>='a'|| ch<='z' || ch>='A' || ch<='Z'){
                c_count=c_count+1;
            }
        }
        System.out.println(s_count+" "+c_count);
    }
}
