import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ C: ");
        double c = sc.nextDouble();
        double f = c * 1.8 + 32;
        System.out.println("Nhiệt độ F: " + f);
        sc.close();
    }
}
