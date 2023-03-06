import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz: ");
        double fiyat= scanner.nextDouble();
        boolean fiyatSinirAlti= fiyat<=1000;
        double kdv= fiyatSinirAlti? 18: 8;
        double satisFiyat=(fiyat*kdv/100)+fiyat;
        double kdvTutar= fiyat*kdv/100;
        System.out.println("Ürünün vergisiz fiyatı: "+fiyat);
        System.out.println("Ürünün satış fiyatı: "+satisFiyat);
        System.out.println("Ürünün kdv tutarı: "+kdvTutar);
    }
}