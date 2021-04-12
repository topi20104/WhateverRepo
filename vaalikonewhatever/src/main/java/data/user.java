package data;

public class user implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient int id;
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
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}