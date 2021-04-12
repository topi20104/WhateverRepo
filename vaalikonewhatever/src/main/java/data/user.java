package data;

public class user implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient int Ehdokas_ID;
    private transient String Kayttajanimi;
    private transient String Salasana;
    
   
	public String getKayttajanimi() {
		return Kayttajanimi;
	}
	public void setKayttajanimi(String Kayttajanimi) {
		this.Kayttajanimi = Kayttajanimi;
	}
	public String getSalasana() {
		return Salasana;
	}
	public void setSalasana(String Salasana) {
		this.Salasana = Salasana;
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

}