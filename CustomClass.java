//// In the Java Program only one class which becomes public
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
    System.out.print("My name is "+name);
    System.out.println(" and id is "+id);
}
public int getSalary(){
    System.out.println("My salary is "+salary);
        return salary;
}
}

public class CustomClass {
public static void main(String[] args) {
Employee e=new Employee();
Employee e1=new Employee();
e.id=19;
e.name="Jawad";
e1.salary=350000;
int salary=e1.getSalary();
e.printDetails();
         // System.out.println(e.id);
        //System.out.println(e.name);
    }
}