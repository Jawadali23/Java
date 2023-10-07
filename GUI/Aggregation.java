class Employee{
    String name="Hello boy";
    int id=150;
    int salary=152054;
}
class Company{
    Employee e=new Employee();
    String companyName= "Apply";
    public void display(){
        System.out.println(e.name+" "+companyName);
        System.out.println(e.id+" "+companyName);
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Company c=new Company();
        c.display();
    }
}
