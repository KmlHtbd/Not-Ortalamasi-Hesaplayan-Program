import java.util.Scanner;
public class notHesaplama {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;
        Scanner input = new Scanner (System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fiz = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kim = input.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz:");
        tur = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tar = input.nextInt();

        System.out.println("Müzik Notunuzu Giriniz:");
        muz = input.nextInt();

        double ortalama = (mat + fiz + kim + tur + tar + muz) / 6.0;
        System.out.println("Ortalama:"+ ortalama);
        String mesaj = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Sonuç:" + mesaj);
    }
}