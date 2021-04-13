package data;	

public class vastaus implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private transient String Kayttajanimi;
	private transient int kysymys_id;
	private transient int vastaus;
	private transient String Kommentti;
	
	public vastaus(String Kayttajanimi, String kysymys_id, int vastaus, String Kommentti) {
		this.setKysymys_id(kysymys_id);
		this.setKayttajanimi(Kayttajanimi);
		this.setVastaus(vastaus);
		this.setKommentti(Kommentti);
		
	}
	public vastaus() {
		
	}
	public int getKysymys_id() {
		return kysymys_id;
	}
	public void setKysymys_id(int kysymys_id) {
		this.kysymys_id = kysymys_id;
	}
	public void setKysymys_id(String kysymys_id) {
		try {
			this.kysymys_id = Integer.parseInt(kysymys_id);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public String getKayttajanimi() {
		return Kayttajanimi;
	}
	public void setKayttajanimi(String kayttajanimi) {
		Kayttajanimi = kayttajanimi;
	}
	public int getVastaus() {
		return vastaus;
	}
	public void setVastaus(int vastaus) {
		this.vastaus = vastaus;
	}
	public void setVastaus(String vastaus) {
		try {
			this.vastaus = Integer.parseInt(vastaus);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public String getKommentti() {
		return Kommentti;
	}
	public void setKommentti(String kommentti) {
		Kommentti = kommentti;
	}
	
	
	
	
}