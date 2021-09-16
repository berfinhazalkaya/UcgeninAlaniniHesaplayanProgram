import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int a, b, c, cevre;
        double alan;
        int u;


        //Kullanıcıdan kenar uzunluklarını alıcaz

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        a=input.nextInt();

        System.out.print("2.Kenar Uzunluğunu Giriniz: ");
        b=input.nextInt();

        System.out.print("3.Kenar Uzunluğunu Giriniz: ");
        c=input.nextInt();

        //Üçgenin Çevresini Hesaplıyoruz
        cevre = a + b + c;
        System.out.println("Üçgenin Çevresi : " + cevre);

        //Üçgenin alanını hesaplıyoruz
        u = (a+ b+ c) / 2;
        alan= Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin Alanı : " + alan);
    }
}
