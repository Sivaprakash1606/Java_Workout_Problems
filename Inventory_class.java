import java.util.Arrays;
import java.util.Scanner;

class Inventory{
    private String inventoryId;
    private  int maximumQuantity;
    private int currentQuantity;
    private int threshold;
    public Inventory(String inventoryId,int maximumQuantity,int currentQuantity,int threshold){
        this.inventoryId=inventoryId;
        this.maximumQuantity=maximumQuantity;
        this.currentQuantity=currentQuantity;
        this.threshold=threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public int getThreshold() {
        return threshold;
    }
}
public class Inventory_class {
    public static void main(String[] args) {
        Inventory[] Inventory_objects=new Inventory[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<Inventory_objects.length;i++){
            String inventoryId=sc.nextLine();
            int maximumQuantity=sc.nextInt();
            sc.nextLine();
            int currentQuantity=sc.nextInt();
            sc.nextLine();
            int threshold=sc.nextInt();
            sc.nextLine();
            Inventory_objects[i]=new Inventory(inventoryId,maximumQuantity,currentQuantity,threshold);
        }
        int limit=sc.nextInt();
        sc.close();
        Inventory[] result=replenish(Inventory_objects,limit);
        for(int i=0;i<result.length;i++){
            if(result[i].getThreshold()>=75){
                System.out.println(result[i].getInventoryId()+"Critical Filling");
            }else if(result[i].getThreshold()>=50 && result[i].getThreshold()<=74){
                System.out.println(result[i].getThreshold()+"Moderate Filling");
            }else{
                System.out.println(result[i].getInventoryId()+"Non-Critical Filling");
            }
        }
    }
    public static Inventory[] replenish(Inventory[] Inventory_objects,int limit){
        Inventory[] refined=new Inventory[0];
        for(int i=0;i<Inventory_objects.length;i++){
            if(Inventory_objects[i].getThreshold()<=limit){
                refined= Arrays.copyOf(refined,refined.length+1);
                refined[refined.length-1]=Inventory_objects[i];
            }
        }return refined;
    }
}

