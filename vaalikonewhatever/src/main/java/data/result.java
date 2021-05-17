package data;

public class result implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Kayttajanimi;
	private Float Value;
		
	public result() {
		
	}
	
	public result (Float Value, String Kayttajanimi) {
		this.Value = Value;
		this.Kayttajanimi = Kayttajanimi;
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
	

}