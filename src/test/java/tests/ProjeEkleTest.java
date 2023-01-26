package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.KullaniciGirisi;
import pages.ProjeEkle;
import pages.SolMenu;
import utilities.ConfigReader;
import utilities.Driver;

public class ProjeEkleTest {

    @Test
    public void projeEkle() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        KullaniciGirisi kullaniciGirisSayfasi = new KullaniciGirisi();
        SolMenu solMenuListesi = new SolMenu();
        ProjeEkle projeEklemeElement = new ProjeEkle();


        kullaniciGirisSayfasi.kullaniciAdiInput.sendKeys(ConfigReader.getProperty("kullanici_adi"));
        kullaniciGirisSayfasi.sifreInput.sendKeys(ConfigReader.getProperty("sifre"));
        kullaniciGirisSayfasi.guvenlikKoduInput.sendKeys(kullaniciGirisSayfasi.manuelVeriGirisi());
        kullaniciGirisSayfasi.girisYapButonu.click();
        solMenuListesi.projeIslemleriButton.click();
        solMenuListesi.projeEkleButton.click();
        projeEklemeElement.bekle();

        // 1.ADIM PROJE GENEL BİLGİLERİ
        projeEklemeElement.dagitimTuruSecme(1);
        projeEklemeElement.bekle();

        projeEklemeElement.dagitimSirketiSecme(1);
        projeEklemeElement.bekle();

        projeEklemeElement.projeAdiInput.sendKeys(ConfigReader.getProperty("proje_adi"));
        projeEklemeElement.bekle();

        projeEklemeElement.projeKategoriSecme(1);
        projeEklemeElement.bekle();

        projeEklemeElement.projeTuruSecme(1);
        projeEklemeElement.bekle();

        projeEklemeElement.projeSorumlusuSecme(1);
        projeEklemeElement.bekle();

        for (int bolgeindex =0; bolgeindex < 22; bolgeindex++)
        {
            projeEklemeElement.projeBolgesiSecimi(bolgeindex);
        }
        projeEklemeElement.bolgeSecimButton.click();
        projeEklemeElement.bekle();

        for (int ortakindex = 0; ortakindex < 21; ortakindex++)
        {
            projeEklemeElement.projeOrtakSecme(ortakindex);
        }
        projeEklemeElement.ortakSecimButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.projeSuresiInput.sendKeys(ConfigReader.getProperty("proje_suresi"));
        projeEklemeElement.takvimButton.clear();
        projeEklemeElement.takvimButton.click();
        projeEklemeElement.baslangicAySecme(1);
        projeEklemeElement.baslangicYilSecme(97);
        projeEklemeElement.tahminiBaslangicTarihiCalender.click();
        projeEklemeElement.projeDonemiInput.sendKeys(ConfigReader.getProperty("proje_donemi_Ay"));
        projeEklemeElement.projeDonemiInput.sendKeys(Keys.ARROW_RIGHT);
        projeEklemeElement.projeDonemiInput.sendKeys(ConfigReader.getProperty("proje_donemi_Yil"));
        projeEklemeElement.adim1KaydetButton.click();
        projeEklemeElement.tamam4Tikla.click();

        System.out.println("1.Adim Proje Genel Bilgileri Dolduruldu.");

        // 2. ADIM PROJE AMACI

        projeEklemeElement.projeOzetiMetinEditoru.sendKeys(ConfigReader.getProperty("proje_ozeti"));
        projeEklemeElement.bekle();

        projeEklemeElement.projeAmaciTabi.click();
        projeEklemeElement.bekle();

        projeEklemeElement.projeAmaciMetinEditoru.sendKeys(ConfigReader.getProperty("proje_amaci"));
        projeEklemeElement.bekle();

        projeEklemeElement.adim2KaydetButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.tamam2Tikla.click();

        System.out.println("2.Adim Proje Amaci Dolduruldu.");

        // 3. ADIM PROJEDEN BEKLENEN SONUÇ

        projeEklemeElement.projedenBeklenenSonucMetinEditoru.sendKeys(ConfigReader.getProperty("projeden_beklenen_sonuc"));
        projeEklemeElement.bekle();

        projeEklemeElement.adim3KaydetButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.tamam2Tikla.click();
        projeEklemeElement.bekle();

        System.out.println("3.Adim Projeden Beklenen Sonuc Dolduruldu.");

        // 4. ADIM PROJEDEN ETKİLENENLER

        projeEklemeElement.projedenEtkilenenlerEkleButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.etkilenenKurumInput.sendKeys(ConfigReader.getProperty("etkilenen_kurum"));
        projeEklemeElement.bekle();

        projeEklemeElement.etkilenenAktifPasifStatus.click();
        projeEklemeElement.bekle();

        projeEklemeElement.etkilenenKaydetButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.tamam2Tikla.click();
        projeEklemeElement.bekle();

        System.out.println("4.Adim Projeden Etkilenenler Dolduruldu.");

        // 5.ADIM PROJENIN OZGUNLUGU

        projeEklemeElement.projeninOzgunluguAdimi.click();
        projeEklemeElement.bekle();

        projeEklemeElement.projeninOzgunluguMetinEditoru.sendKeys(ConfigReader.getProperty("projenin_ozgunlugu"));
        projeEklemeElement.bekle();

        projeEklemeElement.projeninBeklenenKatmaDegeriTabi.click();
        projeEklemeElement.bekle();

        projeEklemeElement.projeninBeklenenKatmaDegeriMetinEditoru.sendKeys(ConfigReader.getProperty("projenin_beklenen_katma_degeri"));
        projeEklemeElement.bekle();

        projeEklemeElement.adim5KaydetButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.tamam2Tikla.click();
        projeEklemeElement.bekle();

        System.out.println("5.Adim Projenin Ozgunlugu Dolduruldu.");

        // 6. ADIM PAYDASLAR VE TEKNIK YETERLILIK

        projeEklemeElement.paydasEkleButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.paydasTuruSecme(1); //Proje Yurutucusu
        projeEklemeElement.bekle();

        projeEklemeElement.projeYurutucusuAdiInput.sendKeys(ConfigReader.getProperty("proje_Yurutucusu"));
        projeEklemeElement.bekle();

        projeEklemeElement.paydasAktifPasifStatus.click();
        projeEklemeElement.bekle();

        projeEklemeElement.paydasKaydetButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.tamam2Tikla.click();
        projeEklemeElement.bekle();




        projeEklemeElement.paydasEkleButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.paydasTuruSecme(2); //Proje Ortaklari

        for (int paydasortak =0; paydasortak < 21; paydasortak++)
        {
            projeEklemeElement.paydasProjeOrtakSecme(paydasortak);
        }
        projeEklemeElement.paydasOrtakSecmeButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.paydasAktifPasifStatus.click();
        projeEklemeElement.bekle();

        projeEklemeElement.paydasKaydetButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.tamam2Tikla.click();
        projeEklemeElement.bekle();

        projeEklemeElement.paydasEkleButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.paydasTuruSecme(3); //Danisman
        projeEklemeElement.bekle();

        projeEklemeElement.danismanAdiInput.sendKeys(ConfigReader.getProperty("danisman"));
        projeEklemeElement.bekle();

        projeEklemeElement.paydasAktifPasifStatus.click();
        projeEklemeElement.bekle();

        projeEklemeElement.paydasKaydetButton.click();
        projeEklemeElement.bekle();

        projeEklemeElement.tamam2Tikla.click();
        projeEklemeElement.bekle();

        System.out.println("5.Adim Paydaslar ve Teknik Yeterlilik Dolduruldu.");


        // 7. ADIM PROJE ALANI

        projeEklemeElement.projeAlaniAdimi.click();
        projeEklemeElement.bekle();

        projeEklemeElement.sektorSecimIletisimTeknolojisiStatus.click();
        projeEklemeElement.bekle();

        projeEklemeElement.popupUyariMesajiOnayla.click();
        projeEklemeElement.bekle();

        projeEklemeElement.tamam2Tikla.click();
        projeEklemeElement.bekle();

        System.out.println("7.Adim Proje Alani Dolduruldu.");


        // 8. ADIM PROJE KAPSAMİ

        projeEklemeElement.projeKapsamiAdimi.click();

        for (int sayi = 1; sayi < 10; sayi++)
        {
            projeEklemeElement.bekle();
            projeEklemeElement.kelimeEkleButton.click();
            projeEklemeElement.kelimeAdiInput.sendKeys(ConfigReader.getProperty("anahtar_kelime") + " " + sayi);
            projeEklemeElement.bekle();
            projeEklemeElement.kelimeKaydetButton.click();
            projeEklemeElement.tamam2Tikla.click();
        }

        projeEklemeElement.projeKapsamiTabi.click();
        projeEklemeElement.projeKapsamiMetinEditoru.sendKeys(ConfigReader.getProperty("proje_kapsami"));

        projeEklemeElement.faydalanilanKaynaklarTabi.click();
        projeEklemeElement.faydalanilanKaynaklarMetinEditoru.sendKeys(ConfigReader.getProperty("faydalanilan_kaynaklar"));

        projeEklemeElement.projeTeknikAciklamasiTabi.click();
        projeEklemeElement.projeTeknikAciklamasiMetinEditoru.sendKeys(ConfigReader.getProperty("proje_teknik_aciklamasi"));

        projeEklemeElement.projedenBeklenenVerilerTabi.click();
        projeEklemeElement.projedenBeklenenVerilerMetinEditoru.sendKeys(ConfigReader.getProperty("projeden_beklenen_veriler"));

        projeEklemeElement.adim8KaydetButton.click();
        projeEklemeElement.tamam2Tikla.click();

    }


}