import java.util.Scanner;

public class Homework21 {

    public static void main(String[] args) {
        inputFloat();
    }

    public static float inputFloat() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите дробное число, разделитель ',' (например: 56,436): ");
        while (!in.hasNextFloat()) {
            System.out.print("Не верный ввод повторите попытку: ");
            in.next();
        }
        return in.nextFloat();
    }
}
