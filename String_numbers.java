import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class String_numbers {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};

        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        StringBuilder alphabets =new StringBuilder();
        StringBuilder numbers=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(Character.isLetter(ch))
            {
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                numbers.append(ch);
            }

        }
        List<Object> result = new ArrayList<>();
        int num=Integer.parseInt(numbers.toString());
        result.add(alphabets);
        result.add(num);
        System.out.println(Arrays.toString(number));
        System.out.println(result.get(0));
        System.out.println(result.get(1));
        System.out.println(result);





    }

}
