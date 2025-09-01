/*11. WAP to implement the concept of method overloading and method overriding. And Abstract Class.*/
package lab.exp4;

public abstract class ovrRdovrL {
        abstract void abs();
    public static void main(String[] args) {
        language lang=new language();
        ide id=new ide();
        lang.abs();
        id.abs();

    }
}
class language extends ovrRdovrL
{
    public static void main(String[] args) {
        language obj = new language();
        obj.version(5);
        obj.version("version of Lang:",5);
    }
    void abs(){
        System.out.println("java");
    }
    void version(int x)
    {
        System.out.println(x+"th");
    }
    void version(String x,int y)
    {
        System.out.println(x+" "+y);
    }
}
class ide extends ovrRdovrL
{
    public static void main(String[] args) {
        language obj = new language();
        obj.version(5);
        obj.version("version of IDE:",5);
    }
    void abs(){
        System.out.println("IntelliJ");
    }
    void version(int x)
    {
        System.out.println(x+"th");
    }
    void version(String x,int y)
    {
        System.out.println(x+" "+y);
    }
}
class pc{
    void company();
    void cpu();
}
class hp implements
{

}
