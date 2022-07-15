import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        double km, age = 0, total, type, cond = 1, typeCond = 1, priceKm = 0.10;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM Türünden Giriniz: ");
        km = input.nextInt();
        if (km < 0) {
            System.out.println("Hatalı Giriş!");
        } else {
            System.out.print("Yaşınızı Giriniz: ");
            age = input.nextInt();
            if (age < 0) {
                System.out.println("Hatalı Giriş");
            } else {
                System.out.println("Yolculuk Tipini Giriniz \n 1 => Tek Yön , 2=> Gidiş Dönüş: ");
                type = input.nextInt();
                if (!(type == 1 || type == 2)) {
                    System.out.println("Hatalı Giriş!");
                }
                if (age < 12) {
                    cond = 0.50;
                } else if (age >= 12 && age <= 24) {
                    cond = 0.9;
                } else if (age > 65) {
                    cond = 0.7;
                }
                if (type == 2) {
                    typeCond = 0.8;
                }
                total = (((km * priceKm) * cond) * typeCond);
                if (km >= 0 && age >= 0 && (1 == typeCond || typeCond == 2)) {
                    System.out.println("Program Bitti.");
                } else {
                    System.out.println("Bilet Tutarınız: " + total);


                }
            }


        }
    }
}