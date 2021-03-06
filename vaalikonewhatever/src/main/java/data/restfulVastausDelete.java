package data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vastaukset")
public class restfulVastausDelete implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Kayttajanimi")
	protected String kayttajanimi;
	@Column(name="KYSYMYS_ID")
	protected int kysymys_id;
	@Column(name="VASTAUS")
	protected int vastaus;
	@Column(name="KOMMENTTI")
	protected String Kommentti;
	
	public restfulVastausDelete(String kayttajanimi) {
		this.kayttajanimi=kayttajanimi;
		}
	public restfulVastausDelete() {
		
		}

	public restfulVastausDelete(String kayttajanimi, int kysymys_id, int vastaus, String Kommentti) {
		this.kayttajanimi=kayttajanimi;
		this.kysymys_id=kysymys_id;
		this.vastaus=vastaus;
		this.Kommentti=Kommentti;
	}

	public restfulVastausDelete(String kayttajanimi, String kysymys_id, String vastaus, String Kommentti) {
		this.kayttajanimi=kayttajanimi;
		this.setKysymys_id(kysymys_id);
		this.setvastaus(vastaus);
		this.Kommentti=Kommentti;
	}

	public String getKayttajanimi() {
		return kayttajanimi;
	}
	public void setKayttajanimi(String kayttajanimi) {
		this.kayttajanimi = kayttajanimi;
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
		catch (NumberFormatException | NullPointerException e) {
			//Do nothing - the value is not changed
		}
	}
	public int getvastaus() {
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
    public String getKommentti() {
        return Kommentti;
    }
    public void setKommentti(String Kommentti) {
        this.Kommentti = Kommentti;
    }
}