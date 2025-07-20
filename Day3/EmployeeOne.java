 /* Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/
public class EmployeeOne {
    String name;
    int yearOfJoining;
    double salary;
    String address;


    EmployeeOne(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    
    public static void main(String[] args) {
        // Create 3 employee objects
        EmployeeOne e1 = new EmployeeOne("Robert", 1994, 50000, "64C- WallsStreat");
        EmployeeOne e2 = new EmployeeOne("Sam", 2000, 60000, "68D- WallsStreat");
        EmployeeOne e3 = new EmployeeOne("John", 1999, 55000, "26B- WallsStreat");

        
        System.out.format("%-10s %-15s %s\n", "Name", "Year of joining", "Address");

        
        System.out.format("%-10s %-15d %s\n", e1.name, e1.yearOfJoining, e1.address);
        System.out.format("%-10s %-15d %s\n", e2.name, e2.yearOfJoining, e2.address);
        System.out.format("%-10s %-15d %s\n", e3.name, e3.yearOfJoining, e3.address);
    }
}
