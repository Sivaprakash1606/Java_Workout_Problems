import java.util.Arrays;
import java.util.Scanner;

public class medicineSolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Medicine[] medicineObjects=new Medicine[4];
        for(int i=0;i<medicineObjects.length;i++){
            String MedicineName=sc.nextLine();
            String batch=sc.nextLine();
            String disease=sc.nextLine();
            int price= sc.nextInt();
            sc.nextLine();
            medicineObjects[i]=new Medicine(MedicineName,batch,disease,price);
        }
        String pD=sc.nextLine();
        sc.close();
        Integer[] result=getPriceByDisease(medicineObjects,pD);
        for(Integer i:result) System.out.println(i);
    }
    public static Integer[] getPriceByDisease(Medicine[] mO,String disease){
        Integer[] result=new Integer[0];
        for(Medicine m:mO){
            if(m.getDisease().equalsIgnoreCase(disease)){
            result= Arrays.copyOf(result,result.length+1);
            result[result.length-1]=m.getPrice();}
        }Arrays.sort(result);
        return result;
    }
}
class Medicine{
    String MedicineName;
    String batch;
    String disease;
    int price;
    public Medicine(String MedicineName,String batch,String disease,int price){
        this.MedicineName=MedicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getDisease() {
        return disease;
    }
}
