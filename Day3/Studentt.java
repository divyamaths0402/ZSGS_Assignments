/* Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.*/



public class Studentt{
    String name;
    int roll_no;
    long phone_no;
    String address;
    public static void main(String []args){
            Studentt stu1=new Studentt("Sam",123,2454534232L,"Tenkasi");
            Studentt stu2=new Studentt("John",124,9054534232L,"Chennai");
       System.out.println("Student 1: " + stu1.name + ", " + stu1.roll_no + ", " + stu1.phone_no + ", " + stu1.address);
       System.out.println("Student 2: " + stu2.name + ", " + stu2.roll_no + ", " + stu2.phone_no + ", " + stu2.address);
        
    }
    Studentt(String name,int roll_no,long phone_no,String address){
        this.name=name;
        this.roll_no=roll_no;
        this.phone_no=phone_no;
        this.address=address;
    }
}