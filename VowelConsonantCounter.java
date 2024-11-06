import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        int vowelsCount=0;
        int consonantsCount = 0;
        input=input.toLowerCase();
        for(char ch:input.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelsCount++;
            }else{
                consonantsCount++;
            }
        }
        System.out.println(vowelsCount);
        System.out.println(consonantsCount);
        sc.close();
    }
}
