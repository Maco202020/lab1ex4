package exercitiul4;
import java.util.Random;
public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(31);
        int num2 = random.nextInt(31);

        System.out.println("Numere generate: " + num1 + ", " + num2);
        System.out.println("cmmdc: " + cmmdc(num1, num2));
    }

    public static int cmmdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
