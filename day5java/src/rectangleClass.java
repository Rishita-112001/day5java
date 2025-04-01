public class rectangleClass {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        System.out.println(r.Area(12,13));
        System.out.println(r.Perimeter(12,13));
        Circle c = new Circle();
        c.AreaCircle(12);
        c.Circumference(12);
    }
}
class Rectangle{
    int width;
    int height;

    int Area(int width, int height){
        return width*height;
    }
    int Perimeter(int width, int height){
        return 2*(width+height);
    }
}
class Circle{
    float radius;

    void AreaCircle(float radius){
        System.out.println(3.14*radius*radius);
    }
    void Circumference(float radius){
        System.out.println(2*3.14*radius);
    }
}