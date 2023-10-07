class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
  double pi=3.14;
  double area(int radius) {
      Operation op = new Operation();
      double n = op.square(5);
      return pi * n;
  }}


public class HasRelation {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println(c.area(5));


    }

}
