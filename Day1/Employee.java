public class Employee{
          int empId;
          String name;
          String department;
          double salary;
          Employee (int empId, String name,String department,double salary){
                 this.empId=empId;
                 this.name=name;
                 this.department=department;
                 this.salary=salary;
          }
     public static void main(String[] args){
        Employee obj=new Employee(1234,"Divya","Developer",30000);
        obj.display();
         
     }
     void display(){
         System.out.println("Employment ID:"+empId );
         System.out.println("Name:"+name);
         System.out.println("Department:"+department);
         System.out.println("Salary:"+salary);
     }
}
