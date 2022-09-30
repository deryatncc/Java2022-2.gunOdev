package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla(ogretmenKrediManager);
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		tarimKrediManager.Hesapla(tarimKrediManager);
		AskerKrediManager askerKrediManager = new AskerKrediManager();
		askerKrediManager.Hesapla(askerKrediManager);
	}

}
