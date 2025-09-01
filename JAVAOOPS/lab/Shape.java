package lab;

public class Shape {
    public static void main(String[] args) {

        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Square square = new Square();
        circle.setPara(3.14d);
        triangle.setPara(3,2,5);
        square.setPara(5);
    }
}


class Circle {
    double radius;
    void setPara(double r) {
        radius=r;
        peri();
    }

    void peri() {
        System.out.println("Circle: "+(3.14*radius*2));
    }
}


class Triangle{
    int s1,s2,s3;
    void setPara(int a,int b,int c)
    {
        s1=a;
        s2=b;
        s3=c;
        peri();
    }
    void peri()
    {
        System.out.println("triangle: "+(s1+s2+s3));

    }

}


class Square{
    int s;
    void setPara(int a)
    {
    s=a;
    peri();
    }
    void peri()
    {
        System.out.println("Square: "+(s*4));

}

}