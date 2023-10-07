class Student{
    private int id;
    private String name;
    public Student(int myId,String myNam){
        id =myId;
        name=myNam;
    }
    public Student (int salary){
        id=salary;
    }
    public int getSalary(){
        return id;
    }
    public int getId(){
        return id ;
    }
    public String getName(){
        return name;
    }
}
public class Constructor {
    public static void main(String [] arr){
        Student obj=new Student(41,"Jawad Ali");
        Student obj2=new Student(10000);
        System.out.println(obj.getName());
        System.out.println(obj2.getSalary());
        System.out.println(obj.getId());

    }
}
