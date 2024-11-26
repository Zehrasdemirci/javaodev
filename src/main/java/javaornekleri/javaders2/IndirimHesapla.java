
package javaornekleri.javaders2;

/**
 * @author Fatma Zehra Demirci
 */
public class IndirimHesapla {/*
ALGORITHM IndirimHesapla
1. START
    
2. // Buraya pseudo kodunuzu yazın
    
    Degişken tanımlanır.
    Degişkenlere deger atanır.
    Hesaplama İşlermleri yapılır.
    Sonuç ekrana yazdırılır.
    
3. END
*/

    public static void main(String[] args) {

// Değişkenleri tanımlama
        String urununAdi;
        long urununNormalFiyati;
        long urununIndirimliFiyati;
        long urununIndirimTutarı;
        double urununIndirimYuzdesi;


        // Değer atamaları

        urununAdi = "Bilgisayar";
        urununNormalFiyati = 25000;
        urununIndirimliFiyati = 23000;


        // Hesaplamalar

        urununIndirimTutarı = urununNormalFiyati - urununIndirimliFiyati;
        urununIndirimYuzdesi = (((urununNormalFiyati - urununIndirimliFiyati) / ((double) urununNormalFiyati)) * 100);

        // Ekrana yazdırma


        System.out.println("Ürünün ismi: " + urununAdi);
        System.out.println("Ürünün Normal Fiyatı:" + urununNormalFiyati);
        System.out.println("Ürünün İndirimli Fiyatı: " + urununIndirimliFiyati);
        System.out.println("Ürünün İndirim Tutarı: " + urununIndirimTutarı);
        System.out.println("Ürünün İndirim Yüzdesi: " + "%" + (long) urununIndirimYuzdesi);

    }
}

    

