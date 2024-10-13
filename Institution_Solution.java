import java.util.Arrays;
import java.util.Scanner;

class Institution{
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;
    public Institution(int institutionId,String institutionName,int noOfStudentsPlaced,int noOfStudentsCleared, String location){
        this.institutionId=institutionId;
        this.institutionName=institutionName;
        this.noOfStudentsPlaced=noOfStudentsPlaced;
        this.noOfStudentsCleared=noOfStudentsCleared;
        this.location=location;
    }

    public String getLocation() {
        return location;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
public class Institution_Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Institution[] ins=new Institution[4];
        for(int i=0;i<ins.length;i++){
            int institutionId= sc.nextInt();
            sc.nextLine();
            String institutionName=sc.nextLine();
            int noOfStudentsPlaced= sc.nextInt();
            int noOfStudentsCleared= sc.nextInt();
            sc.nextLine();
            String location=sc.nextLine();
            ins[i]=new Institution(institutionId,institutionName,noOfStudentsPlaced,noOfStudentsCleared,location);
        }
        String Location=sc.nextLine();
        String insName=sc.nextLine();
        int sum=findNumClearancedByLoc(ins,Location);
        if(sum>0){
            System.out.println(sum);
        }else{
            System.out.println("There are no cleared students in this particular location");
        }
        Institution in=updateInstitutionGrade(ins,insName);
        if(in != null){
            System.out.println(in.getInstitutionName()+"::"+in.getGrade());
        }else{
            System.out.println("No Institute is available with the specified name");
        }
        sc.close();

    }
    public static int findNumClearancedByLoc(Institution[] ins,String location){
        int sum=0;
        for(Institution in:ins){
            if(in.getLocation().equalsIgnoreCase(location)){
                sum=sum+in.getNoOfStudentsCleared();
            }
        }return sum;
    }
    public static Institution updateInstitutionGrade(Institution[] ins,String insName){
        int rating=0;
        for(Institution in:ins){
            if(in.getInstitutionName().equalsIgnoreCase(insName) && in.getNoOfStudentsPlaced()<in.getNoOfStudentsCleared()) {
                rating = (in.getNoOfStudentsPlaced() * 100) / in.getNoOfStudentsCleared();

                if (rating >= 80) {
                    in.setGrade("A");
                } else {
                    in.setGrade("B");
                }
                return in;
            }
        }return null;

    }
}
