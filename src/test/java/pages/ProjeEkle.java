package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;



public class ProjeEkle {

    public ProjeEkle() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public Thread bekle() throws InterruptedException {
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("beklemeSuresi")));
        return null;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
    public WebElement tamam4Tikla;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
    public WebElement tamam2Tikla;

    @FindBy (xpath = "/html/body/div[2]/div/div[3]/button[1]")
    public WebElement popupUyariMesajiOnayla;


    // PROJE EKLEME ADIMLARI

    @FindBy (id = "newProjectForm-t-0")
    public WebElement projeGenelBilgileriAdimi;

    @FindBy (id = "newProjectForm-t-1")
    public WebElement projeAmaciAdimi;

    @FindBy (id = "newProjectForm-t-2")
    public WebElement projedenBeklenenSonucAdimi;

    @FindBy (id = "newProjectForm-t-3")
    public WebElement projedenEtkilenenlerAdimi;

    @FindBy (id = "newProjectForm-t-4")
    public WebElement projeninOzgunluguAdimi;

    @FindBy (id = "newProjectForm-t-5")
    public WebElement paydaslarVeTeknikYeterlilikAdimi;

    @FindBy (id = "newProjectForm-t-6")
    public WebElement projeAlaniAdimi;

    @FindBy (id = "newProjectForm-t-7")
    public WebElement projeKapsamiAdimi;

    @FindBy (id = "newProjectForm-t-8")
    public WebElement digerAlanlarAdimi;

    @FindBy (id = "newProjectForm-t-9")
    public WebElement projeKapsamindaBeklenenRisklerAdimi;

    @FindBy (id = "newProjectForm-t-10")
    public WebElement isPlaniAdimi;

    @FindBy (id = "newProjectForm-t-11")
    public WebElement butceVeFinansmanKaynaklarAdimi;

    @FindBy (id = "newProjectForm-t-12")
    public WebElement projeHareketKayitlariAdimi;

    @FindBy (id = "newProjectForm-t-13")
    public WebElement yetkiliFirmalarAdimi;

    @FindBy (id = "newProjectForm-t-14")
    public WebElement projeEkDosyalarAdimi;


    // 1.ADIM PROJE GENEL BİLGİLERİ
    @FindBy(id = "company_kind")
    public WebElement dagitimSirketiTuruSelect;

    @FindBy(id = "company_id")
    public WebElement dagitimSirketiSelect;

    @FindBy(id = "name")
    public WebElement projeAdiInput;

    @FindBy(id = "project_category_id")
    public WebElement projeKategoriSelect;

    @FindBy(id = "project_kind_id")
    public WebElement projeTuruSelect;

    @FindBy(id = "project_responsible_id")
    public WebElement projeSorumlusuSelect;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/section[1]/form/div/div[3]/div[1]/div/div/div[1]/select")
    public WebElement projeBolgesiSelect;
    //*[@id="project_partner"]/div/div/div[1]/div/button[2]
    @FindBy(xpath = "//*[@id=\"projectGeneralInformationForm\"]/div/div[3]/div[1]/div/div/div[1]/div/button[2]")
    public WebElement bolgeSecimButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/section[1]/form/div/div[3]/div[2]/div/div/div[1]/select")
    public WebElement projeOrtaklariSelect;

    @FindBy(xpath = "//*[@id=\"project_partner\"]/div/div/div[1]/div/button[2]")
    public WebElement ortakSecimButton;

    @FindBy(id = "time")
    public WebElement projeSuresiInput;

    @FindBy(id = "start_date")
    public WebElement takvimButton;

    @FindBy(className = "monthselect")
    public WebElement takvimAySecim;

    @FindBy(className = "yearselect")
    public WebElement takvimYilSecim;

    @FindBy(css = "body > div.daterangepicker.ltr.auto-apply.single.opensright.show-calendar > div.drp-calendar.left.single > div.calendar-table > table > tbody > tr:nth-child(3) > td:nth-child(4)")
    public WebElement tahminiBaslangicTarihiCalender;

    @FindBy(id = "project_period")
    public WebElement projeDonemiInput;

    @FindBy(id = "end_date")
    public WebElement bitisTarihiCalender;

    public void dagitimTuruSecme(int index) {
        new Select(dagitimSirketiTuruSelect).selectByIndex(index);
    }

    public void dagitimSirketiSecme(int index) {
        new Select(dagitimSirketiSelect).selectByIndex(index);
    }

    public void projeKategoriSecme(int index) {
        new Select(projeKategoriSelect).selectByIndex(index);
    }

    public void projeTuruSecme(int index) {
        new Select(projeTuruSelect).selectByIndex(index);
    }

    public void projeSorumlusuSecme(int index) {
        new Select(projeSorumlusuSelect).selectByIndex(index);
    }

    public void projeBolgesiSecimi(int index) {
        new Select(projeBolgesiSelect).selectByIndex(index);
    }

    public void projeOrtakSecme(int index) { new Select(projeOrtaklariSelect).selectByIndex(index); }

    public void baslangicAySecme(int index) { new Select(takvimAySecim).selectByIndex(index); }

    public void baslangicYilSecme(int index) { new Select(takvimYilSecim).selectByIndex(index); }

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/section[1]/form/div/div[5]/div[2]/button")
    public WebElement adim1KaydetButton;


    // 2.ADIM PROJE AMACI

    @FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[2]/form/div/div/div/div[3]/div[1]/div[1]/div[3]/div[2]")
    public WebElement projeOzetiMetinEditoru;

    @FindBy (id = "projectPurpose-tab")
    public WebElement projeAmaciTabi;

    @FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[2]/form/div/div/div/div[3]/div[2]/div[1]/div[3]/div[2]")
    public WebElement projeAmaciMetinEditoru;

    @FindBy (id = "projectInfoSector-tab")
    public WebElement sektorTabi;

    @FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[2]/form/div/div/div/div[3]/div[2]/div[2]/div[2]/button")
    public WebElement adim2KaydetButton;


    // 3.ADIM PROJEDEN BEKLENEN SONUC

    @FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[3]/form/div/div/div/div[2]/div[1]/div[1]/div[3]/div[2]")
    public WebElement projedenBeklenenSonucMetinEditoru;

    @FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[3]/form/div/div/div/div[2]/div[1]/div[2]/div[2]/button")
    public WebElement adim3KaydetButton;


    // 4. ADIM PROJEDEN ETKİLENENLER

    @FindBy (xpath = "//*[@id=\"projectAffected\"]/div/div/div/button")
    public WebElement projedenEtkilenenlerEkleButton;

    @FindBy (id = "stakeholder_name")
    public WebElement etkilenenKurumInput;

    @FindBy(className = "custom-control-label")
    public WebElement etkilenenAktifPasifStatus;

    @FindBy (id = "project_affected_save_btn")
    public WebElement etkilenenKaydetButton;


    // 5. ADIM PROJENIN OZGUNLUGU

    @FindBy (id = "innovativeAspect-tab")
    public WebElement projeninOzgunluguTabi;

    @FindBy (xpath = "//*[@id=\"innovativeAspectTab\"]/div[1]/div[3]/div[2]")
    public WebElement projeninOzgunluguMetinEditoru;

    @FindBy (id = "addedValue-tab")
    public WebElement projeninBeklenenKatmaDegeriTabi;

    @FindBy (xpath = "//*[@id=\"addedValueTab\"]/div[1]/div[3]/div[2]")
    public WebElement projeninBeklenenKatmaDegeriMetinEditoru;

    @FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[5]/form/div/div/div/div[2]/div[2]/div[2]/div[2]/button")
    public WebElement adim5KaydetButton;


    // 6. ADIM PAYDASLAR VE TEKNIK YETERLILIK

    @FindBy (xpath = "//*[@id=\"projectStakeholders\"]/div/div/div/button")
    public WebElement paydasEkleButton;

    @FindBy (id = "stakeholder_id")
    public WebElement paydasTuruSelect;
    public void paydasTuruSecme(int index) { new Select(paydasTuruSelect).selectByIndex(index); }

    @FindBy (id = "stakeholder_title")
    public WebElement projeYurutucusuAdiInput;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/section[6]/div/div/div/div[2]/form/div[2]/div/div[1]/select")
    public WebElement paydasProjeOrtakSelect;
    public void paydasProjeOrtakSecme(int index) { new Select(paydasProjeOrtakSelect).selectByIndex(index); }

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/section[6]/div/div/div/div[2]/form/div[2]/div/div[1]/div/button[2]")
    public WebElement paydasOrtakSecmeButton;

    @FindBy (id = "person_in_charge")
    public WebElement danismanAdiInput;

    @FindBy (id = "project_stakeholder_save_btn")
    public WebElement paydasKaydetButton;
    @FindBy (className = "custom-control-label")
    public WebElement paydasAktifPasifStatus;


    // 7. ADIM PROJE ALANI

    @FindBy (xpath = "//*[@id=\"projectInfoSectorTable\"]/tbody/tr[3]/td[2]/div/label[2]")
    public WebElement sektorSecimIletisimTeknolojisiStatus;


    // 8. ADIM PROJE KAPSAMI

    @FindBy (xpath = "//*[@id=\"keywordsTab\"]/button")
    public WebElement kelimeEkleButton;

    @FindBy (id = "keyword_title")
    public WebElement kelimeAdiInput;

    @FindBy (id = "project_keyword_save_btn")
    public WebElement kelimeKaydetButton;


    @FindBy (id = "projectDetail-tab")
    public WebElement projeKapsamiTabi;

    @FindBy (xpath = "//*[@id=\"projectDetailTab\"]/div[1]/div[3]/div[2]")
    public WebElement projeKapsamiMetinEditoru;


    @FindBy (id = "projectInspiredBySource-tab")
    public WebElement faydalanilanKaynaklarTabi;

    @FindBy (xpath = "//*[@id=\"projectInspiredBySourceTab\"]/div[1]/div[3]/div[2]")
    public WebElement faydalanilanKaynaklarMetinEditoru;


    @FindBy (id = "projectTechnicalDetail-tab")
    public WebElement projeTeknikAciklamasiTabi;

    @FindBy (xpath = "//*[@id=\"projectTechnicalDetailTab\"]/div[1]/div[3]/div[2]")
    public WebElement projeTeknikAciklamasiMetinEditoru;


    @FindBy (id = "projectExpectedData-tab")
    public WebElement projedenBeklenenVerilerTabi;

    @FindBy (xpath = "//*[@id=\"projectExpectedDataTab\"]/div[1]/div[3]/div[2]")
    public WebElement projedenBeklenenVerilerMetinEditoru;

    @FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[8]/form/div/div/div/div[3]/div[4]/div[2]/div[2]/button")
    public WebElement adim8KaydetButton;



}