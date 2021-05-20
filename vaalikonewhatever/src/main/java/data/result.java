package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ehdokkaat")
public class result implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="kayttajanimi")
	private String Kayttajanimi;
	@Column(name="Value")
	private Float Value;
	@Id
	@Column(name="Ehdokas_ID")
	private int ehdokas_id;
		
	public result() {
		
	}
	
	public result (Float Value, String Kayttajanimi, int ehdokas_id) {
		this.Value = Value;
		this.Kayttajanimi = Kayttajanimi;
		this.ehdokas_id = ehdokas_id;
	}
	public result (String Kayttajanimi, int ehdokas_id) {
		this.Kayttajanimi = Kayttajanimi;
		this.ehdokas_id = ehdokas_id;
	}

	public int getId(int ehdokas_id) {
		return ehdokas_id;
	}

	public int setId(int ehdokas_id) {
		this.ehdokas_id = ehdokas_id;
		return ehdokas_id;
	}
 
	public Float getValue() {
		return Value;
	}

	public void setValue(Float value) {
		Value = value;
	}
	public void setValue(String value) {
		try {
			this.Value = Float.parseFloat(value);
		}
		catch (NumberFormatException | NullPointerException e) {
			//Do nothing - the value is not changed
		}
	}

	public String getKayttajanimi() {
		return Kayttajanimi;
	}

	public void setKayttajanimi(String kayttajanimi) {
		Kayttajanimi = kayttajanimi;
	}

	public int getEhdokas_id() {
		return ehdokas_id;
	}

	public void setEhdokas_id(int ehdokas_id) {
		this.ehdokas_id = ehdokas_id;
	}
	

}