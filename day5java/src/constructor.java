

public class constructor {
    public static void main(String[] args){
        Demo d1 = new Demo();
        Demo d = new Demo("PG-DAI",200,1000);
        Demo demoObj = new Demo("HPC",20,40);

        System.out.println(d.getName());
        System.out.println(d.getPrice());
        System.out.println(demoObj.getName());
        System.out.println(demoObj.getPrice());
    }
}
class Demo{
    String name;
    int price;
    int value;

    Demo(){
        System.out.println("Inside constructor");
    }
    Demo(String l, int p, int v){
        name = l;
        price = p;
        setPrice(v);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}