import java.util.*;

public class kor12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert number your body weight : ");
        double weight = sc.nextDouble();
        double salary = 0 , bonus = 0;
        if ((age > 21) & (age <= 30)) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        }
        else if ((age > 31) & (age <= 40)) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        }
        else if ((age > 40) & (age <= 50)) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        }
        else if ((age > 50) & (age <= 60)) {
            salary = (numDay1 * 3000);
        }

        if ((weight >= 10) & (weight < 61)) {
            bonus = salary + 5000;
        }
        else if ((weight >= 61) & (weight < 91)) {
            bonus = salary + (5000 - ((weight-60) * 10));
        }
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + bonus + " Baht");
    }
}
