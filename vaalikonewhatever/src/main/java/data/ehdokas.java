package data;

public class ehdokas {
	private int Ehdokas_ID;
	private String Etunimi;
	private String Sukunimi;
	private String Puolue;
	private String Kotipaikkakunta;
	private int Ika;
	private String Miksi;
	private String Mita;
	private String Ammatti;
	private String Salasana;
	private String Kayttajanimi;
	
	public ehdokas(String Ehdokas_ID, String Sukunimi, String Etunimi, String Puolue, String Kotipaikkakunta, String Ika, String Miksi, String Mita, String Ammatti, String Salasana, String Kayttajanimi) {
		// TODO Auto-generated constructor stub
		setId(Ehdokas_ID);
		this.Etunimi=Etunimi;
		this.setSukunimi(Sukunimi);
		this.setPuolue(Puolue);
		this.setKotipaikkakunta(Kotipaikkakunta);
		this.setIka(Ika);
		this.setMiksi(Miksi);
		this.setMita(Mita);
		this.setAmmatti(Ammatti);
		this.setSalasana(Salasana);
		this.setKayttajanimi(Kayttajanimi);
		
		
	}
	public ehdokas() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Ehdokas_ID;
	}
	public void setId(int Ehdokas_ID) {
		this.Ehdokas_ID = Ehdokas_ID;
	}
	public void setId(String Ehdokas_ID) {
		try {
			this.Ehdokas_ID = Integer.parseInt(Ehdokas_ID);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public String getEtunimi() {
		return Etunimi;
	}
	public void setEtunimi(String Etunimi) {
		this.Etunimi = Etunimi;
	}
	public String getSukunimi() {
		return Sukunimi;
	}
	public void setSukunimi(String sukunimi) {
		Sukunimi = sukunimi;
	}
	public String getPuolue() {
		return Puolue;
	}
	public void setPuolue(String puolue) {
		Puolue = puolue;
	}
	public String getKotipaikkakunta() {
		return Kotipaikkakunta;
	}
	public void setKotipaikkakunta(String kotipaikkakunta) {
		Kotipaikkakunta = kotipaikkakunta;
	}
	public int getIka() {
		return Ika;
	}
	public void setIka(int ika) {
		Ika = ika;
	}
	public void setIka(String Ika) {
		try {
			this.Ika = Integer.parseInt(Ika);
		}
		catch(NumberFormatException | NullPointerException e) {
				//Do nothing - the value of id won't be changed
		}
	}
	public String getMiksi() {
		return Miksi;
	}
	public void setMiksi(String miksi) {
		Miksi = miksi;
	}
	public String getMita() {
		return Mita;
	}
	public void setMita(String mita) {
		Mita = mita;
	}
	public String getAmmatti() {
		return Ammatti;
	}
	public void setAmmatti(String ammatti) {
		Ammatti = ammatti;
	}
	public String getSalasana() {
		return Salasana;
	}
	public void setSalasana(String salasana) {
		Salasana = salasana;
	}
	public String getKayttajanimi() {
		return Kayttajanimi;
	}
	public void setKayttajanimi(String kayttajanimi) {
		Kayttajanimi = kayttajanimi;
	}
}
