class Structor{
private  String name;
private  int id;
public Structor(){
    name="Javed ";
    id=152;
}
public Structor(String n,int id){
    name=n;
    this.id=id;
}
public String getName(){
    return name;
}
public int getId(){
    return  id;
}
}


public class Constructor {
    public static void main(String[] args) {
    Structor c=new Structor();
    Structor c1=new Structor("Alpha ",2021);
        System.out.println(c.getId());
        System.out.println(c.getName());
    }
}
