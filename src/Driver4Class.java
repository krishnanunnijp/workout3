import java.util.Scanner;

public class Driver4Class {
    public static void main(String[] args) {
        String pancardno =new String();
        String name=new String();
        System.out.println("Enter the name of the pan card holder:");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.println("Enter the pan card number:");
        pancardno = sc.next();
        panCardValidity pancardvalidity=new panCardValidity(pancardno,name);
        pancardvalidity.checkValid();
    }
}
