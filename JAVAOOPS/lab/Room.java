package lab;

import java.util.Scanner;

public class Room {
    int roomno;
    String roomtype;
    int roomarea;
    boolean ACmachine;
    void setData(){
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        System.out.print("RoomNo= ");
        roomno=sc.nextInt();
        System.out.print("RoomType= ");
        roomtype =sca.nextLine();
        System.out.print("RoomArea= ");
        roomarea=sc.nextInt();
        System.out.print("ACmachine= ");
        ACmachine=sc.nextBoolean();
    }
    void displayData(){
        System.out.println("RoomNo= "+roomno);
        System.out.println("RoomType= "+roomtype);
        System.out.println("RoomArea= "+roomarea);
        System.out.println("ACmachine= "+ACmachine);
    }

    public static void main(String[] args) {
        Room obj = new Room();
        obj.setData();
        obj.displayData();
    }
}
