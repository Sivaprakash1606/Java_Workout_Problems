import java.util.Scanner;

public class Headset_Solution {
    public static void main(String[] args) {
        HeadSets[] hs=new HeadSets[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<hs.length;i++){
            String headsetName= sc.nextLine();
            String brand=sc.nextLine();
            int price=sc.nextInt();
            boolean available=sc.nextBoolean();
            sc.nextLine();
            hs[i]=new HeadSets(headsetName,brand,price,available);
        }
        String new_brand= sc.nextLine();
        int sum = findTotalPriceForGivenBrand(hs, new_brand);

        if(sum>0){
            System.out.println(sum);
        }else{
            System.out.println("No Headsets available with the given brand");
        }
        HeadSets h=findAvailableHeadsetWithSecondMinPrice(hs);
        if(h!=null){
            System.out.println(h.getHeadsetName());
            System.out.println(h.getPrice());
        }else{
            System.out.println("No headset");
        }

    }
    public static int findTotalPriceForGivenBrand(HeadSets[] hs,String brand){
        int sum=0;
        for(HeadSets h:hs){
            if(h.getBrand().equalsIgnoreCase(brand)){
                sum=sum+h.getPrice();
            }
        }return sum;
    }
    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] hs){
        HeadSets fmin=null;
        HeadSets smin=null;
        for(HeadSets h:hs){
            if(h.isAvailable()) {
                if (fmin == null || h.getPrice() < fmin.getPrice()) {
                    smin = fmin;
                    fmin = h;
                } else if (smin == null || h.getPrice() < smin.getPrice()) {
                    smin = h;
                }
            }
        }return smin;
    }
}
class HeadSets{
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;
    public HeadSets(String headsetName,String brand,int price,boolean available){
        this.headsetName=headsetName;
        this.brand=brand;
        this.price=price;
        this.available=available;
    }

    public String getHeadsetName(){
        return headsetName;
    }

    public void setHeadsetName(String headsetName) {
        this.headsetName = headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
