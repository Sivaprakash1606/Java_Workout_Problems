import java.util.Scanner;

public class MyProjectorClass {
    public static void main(String[] args) {
        Projector[] proj=new Projector[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<proj.length;i++){
            int projectorId=sc.nextInt();
            sc.nextLine();
            String projectorName=sc.nextLine();
            int price=sc.nextInt();
            sc.nextLine();
            int rating=sc.nextInt();
            sc.nextLine();
            String availableIn=sc.nextLine();
            proj[i]=new Projector(projectorId,projectorName,price,rating,availableIn);
        }
        int givenRating=sc.nextInt();
        Projector max=findMaximumPriceByRating(proj,givenRating);
        if(max!=null){
            System.out.println(max.getProjectorId());
        }else{
            System.out.println("No such Projector");
        }
        sc.close();
    }

    public static Projector findMaximumPriceByRating(Projector[] proj,int givenRating){
        Projector maxx=null;
        int max=Integer.MIN_VALUE;
        for(Projector p:proj){
            if((p.getRating()>givenRating)&&(p.getAvailableIn().equalsIgnoreCase("TataCliq"))){
                if(p.getRating()>max){
                    max=p.getPrice();
                    maxx=p;
                }
            }
        }
        return maxx ;
    }
}
class Projector{
    private int projectorId;
    private String projectorName;
    private int price;
    private int rating;
    private String availableIn;

    public int getProjectorId() {
        return projectorId;
    }

    public String getProjectorName() {
        return projectorName;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getAvailableIn() {
        return availableIn;
    }

    public void setProjectorId(int projectorId) {
        this.projectorId = projectorId;
    }

    public void setProjectorName(String projectorName) {
        this.projectorName = projectorName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAvailableIn(String availableIn) {
        this.availableIn = availableIn;
    }
    public Projector(int projectorId,String projectorName,int price,int rating,String availableIn){
        this.projectorId=projectorId;
        this.projectorName=projectorName;
        this.price=price;
        this.rating=rating;
        this.availableIn=availableIn;
    }
}
//1001
//Epson
//30000
//TataCliq
//1002
//BenQ
//40000
//Amazon
//1003
//Sony
//80000
//TataCliq
//1004
//Optomo
//7000
//Flipkart
//3
