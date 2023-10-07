class Var{
    int battery;
    long costScreen;

    public Var(int battery, long costScreen) {
        this.battery = battery;
        this.costScreen = costScreen;
    }

void operate(){
        System.out.println();
    }
}

class Smartwatch extends Var{
    int prize;
    String name;
    public Smartwatch(int battery, long costScreen, int prize, String name) {
        super(battery, costScreen);
        this.prize = prize;
        this.name = name;
    }

    @Override
    void operate() {
        super.operate();
    }
}

class SmartPhone extends Smartwatch{
    String colour;
    String resolution;

    public SmartPhone(int battery, long costScreen, int prize, String name, String colour, String resolution) {
        super(battery, costScreen, prize, name);
        this.colour = colour;
        this.resolution = resolution;
    }
   // void update_status(){
      //  super.operate();

    //}
}

public class Superclass {
}
