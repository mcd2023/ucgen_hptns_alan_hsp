import java.util.Scanner;

class Ucgen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;
        double h, alan;

        System.out.print("a ve b kenar değerlerini giriniz: ");
        a = input.nextInt();
        b = input.nextInt();

        h = Math.sqrt((a * a) + (b * b));
        alan = (a * b) / 2.0;

        System.out.println("Hipotenüs: " + h);
        System.out.println("Üçgenin Alanı: " + alan);

        input.close();
    }
}
