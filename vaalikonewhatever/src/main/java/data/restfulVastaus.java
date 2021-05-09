package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vastaukset")
public class restfulVastaus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String kayttajanimi;
	private int kysymys_id;
	private int vastaus;
	private String Kommentti;
	
	public restfulVastaus() {
		
	}
	public restfulVastaus(int kysymys_id, int vastaus) {
		this.setKysymys_id(kysymys_id);
		this.vastaus=vastaus;
	}
	public restfulVastaus(String kayttajanimi, String Kommentti, int vastaus) {
		this.kayttajanimi=kayttajanimi;
		this.Kommentti=Kommentti;
		this.vastaus=vastaus;
	}
	public restfulVastaus(String Kommentti, String vastaus) {
		this.Kommentti=Kommentti;
		this.setvastaus(vastaus);
	}
	public restfulVastaus(String kayttajanimi, String Kommentti, String vastaus) {
		this.setId(kayttajanimi);
		this.Kommentti=Kommentti;
		this.setvastaus(vastaus);
	}
	public String getId() {
		return kayttajanimi;
	}
	public void setId(String kayttajanimi) {
		this.kayttajanimi = kayttajanimi;
	}
	
	public String getKommentti() {
		return Kommentti;
	}
	public void setKommentti(String Kommentti) {
		this.Kommentti = Kommentti;
	}
	public float getvastaus() {
		return vastaus;
	}
	public void setvastaus(int vastaus) {
		this.vastaus = vastaus;
	}
	public void setvastaus(String vastaus) {
		try {
			this.vastaus = Integer.parseInt(vastaus);
		}
		catch (NumberFormatException | NullPointerException e) {
			//Do nothing - the value is not changed
		}
	}
	public int getKysymys_id() {
		return kysymys_id;
	}
	public void setKysymys_id(int kysymys_id) {
		this.kysymys_id = kysymys_id;
	}
}