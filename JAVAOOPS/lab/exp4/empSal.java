/*10.     WAP to create a class Employee with a method called calculateSalary()
. Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method
to calculate and return the salary based on their specific roles.*/
package lab.exp4;

public abstract class empSal {
     abstract void calcsalary();

    public static void main(String[] args) {
        Manager man=new Manager();
        Programmer prog =new Programmer();
        man.calcsalary();
        prog.calcsalary();
    }

}
class Manager extends empSal
{
void calcsalary(){
    System.out.println("Manager");
}
}
class Programmer extends empSal
{
    void calcsalary(){
        System.out.println("Programmer");
    }
}
