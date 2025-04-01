public class classProgram1 {
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println("Name of class:"+ c1.getClass().getName());
        c1.name = "Sedan";
        c1.price = 1000000;
        System.out.println(c1.name);
        System.out.println(c1.price);
        String color_req = c1.mixed_color("Red","White");
        System.out.println("The new mixedColor is : "+ color_req);
        c1.Lock();
        c1.Unlock();
        c1.Drive();


        Car c2 = new Car();
        c2.color = "Black";
        System.out.println(c2.color);
    }
}
class Car{
    String name; //= "MatchBack";
    String color; //= "Red";
    int price; //= 100000;

    void Drive(){
        System.out.println("ZOOM ZOOM ZOOM");
    }
    void Lock(){
        System.out.println("Car is Locked!");
    }
    void Unlock(){
        System.out.println("Car is unlocked!");
    }
    String mixed_color(String a, String b){
        return a+b;
    }
}
