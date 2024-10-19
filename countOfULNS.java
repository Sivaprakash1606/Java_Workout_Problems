import java.util.Scanner;

public class countOfULNS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int U=0,L=0,N=0,S=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' ') continue;
            else if(ch>='A' && ch<='Z') U++;
            else if(ch>='a' && ch<='z') L++;
            else if (ch>='0' && ch<='9') N++;
            else S++;
        }
        System.out.println(U);
        System.out.println(L);
        System.out.println(N);
        System.out.println(S);
    }
}
