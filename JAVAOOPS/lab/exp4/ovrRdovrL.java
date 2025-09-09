//11. WAP to implement the concept of method overloading and method overriding. And Abstract Class.

package lab.exp4;

public abstract class ovrRdovrL {
        abstract void abs();
    public static void main(String[] args) {
        /*language lang=new language();
        ide id=new ide();
        lang.abs();
        id.abs();*/
        pc myhp=new hp();
        pc mylv =new lenovo();
        myhp.company();
        myhp.cpu();
        mylv.company();
        mylv.cpu();

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
interface pc{
    void company();
    void cpu();
}
class hp implements pc
{
    public void company() {
        System.out.println("HP");
    }
    public void cpu(){
        System.out.println("Intel I9");
    }
}
class lenovo implements pc
{
    public void company() {
        System.out.println("Lenovo");
    }
    public void cpu(){
        System.out.println("AMD Ryzen 5000");
    }
}
