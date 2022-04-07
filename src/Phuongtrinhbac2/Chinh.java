package Phuongtrinhbac2;
import java.util.Scanner;
public class Chinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();
        Phu qe = new Phu(a, b, c);
        int delta = qe.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no roots");
        }
        else if (delta > 0) {
            System.out.println("Nghiệm 1 phương trình:" + qe.getRoot1());
            System.out.println("Nghiệm 2 phương trình:" + qe.getRoot2());
        }
        else {
            System.out.println("Nghiệm phương trình:" + qe.getRoot());
        }
    }
}
