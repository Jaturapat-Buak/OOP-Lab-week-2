import java.util.*;
public class kor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money: ");
        int money = sc.nextInt();
        sc.nextLine();
        System.out.print("Input your account type (Please type A, B, C, or X in uppercase): ");
        String type = sc.nextLine();
        double ans = 0;

        if (type.equals("A")) {
            ans = money + ((money * 1.5)/100);
        } else if (type.equals("B")) {
            ans = money + ((money * 2.0)/100);
        } else if (type.equals("C")) {
            ans = money + ((money * 1.5)/100);
        } else if (type.equals("X")) {
            ans = money + ((money * 5.0)/100);
        } else {
            System.out.println("Invalid account type!");
            sc.close();
            return;
        }
        System.out.println("Your total money in one year = " + Math.round(ans));
    }
}
