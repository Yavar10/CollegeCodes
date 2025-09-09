package lab.exp4;

public class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

  public Employee(int no,String na,int bs)
    {
        empNo=no;
        empName=na;
        empBasic=bs;
    }
   public int getNo()
    {
         return empNo;
    }
   public String getName()
    {
         return empName;
    }
    public int getBs()
    {
         return empBasic;
    }
    public void setNo(int x)
    {
         empNo=x;
    }
   public void setName(String h)
    {
         empName=h;
    }
    public void setBs(int bs)
    {
         empBasic=bs;
    }
    public static void main(String[] args) {
        System.out.println("SET");
    }
}

class get{
    public static void main(String[] args) {
        Employee obj = new Employee(123, "David", 5000);
        System.out.println("BEFORE SETTING");
        System.out.println(obj.getNo());
        System.out.println(obj.getName());
        System.out.println(obj.getBs());
        obj.setNo(55);
        obj.setName("Goliath");
        obj.setBs(1000);
        System.out.println("AFTER SETTING");
        System.out.println(obj.getNo());
        System.out.println(obj.getName());
        System.out.println(obj.getBs());
    }
}
