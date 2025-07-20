/*Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.*/
public class Employee{
    String employeeName;
    int employeeID;
    String designation;
    int salary;
    public static void main(String [] args){
        Employee emp1=new Employee();
        Employee emp2=new Employee("John",34,"Developer",35000);
        Employee emp3=new Employee("Tamil",20,"Manager",50000);
        System.out.println(emp1.employeeName+","+emp1.employeeID+","+emp1.designation+","+emp1.salary);
        System.out.println(emp2.employeeName+","+emp2.employeeID+","+emp2.designation+","+emp2.salary);
        System.out.println(emp3.employeeName+","+emp3.employeeID+","+emp3.designation+","+emp3.salary);
        
          
    }
    Employee(){
        System.out.println("object has been created, and sets default values for all the fields.");
        employeeName = "Victor";
        employeeID = 23;
        designation = "Manager";
        salary = 80000;
    }
    Employee( String employeeName,int employeeID,String designation,int salary){
        this.employeeName=employeeName;
        this.employeeID=employeeID;
        this.designation=designation;
        this.salary=salary;
    }
     Employee(Employee other) {
        this.employeeName = other.employeeName;
        this.employeeID = other.employeeID;
        this.designation = other.designation;
        this.salary = other.salary;
    }
}



