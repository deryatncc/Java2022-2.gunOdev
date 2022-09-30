package inheritanceDemo;

public class BaseKrediManager {
	public void Hesapla(OgretmenKrediManager ogretmen) {
		System.out.println("Ogretmenlerimiz icin ayricaliklar iceren Krediniz hesaplandı!\n");
	}

	public void Hesapla(TarimKrediManager tarim) {
		System.out.println("Emekci ciftcilerimiz icin ayricaliklar iceren krediniz hesaplandi!\n");
	}

	public void Hesapla(AskerKrediManager asker) {
		System.out.println("Kahraman Askerlerimiz icin ayricaliklar iceren krediniz hesaplandi!\n");
	}
}