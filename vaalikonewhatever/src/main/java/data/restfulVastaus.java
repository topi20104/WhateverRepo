package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class restfulVastaus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String kayttajanimi;
	private int kysymys_id;
	private int vastaus;
	private String Kommentti;
	
	public restfulVastaus() {
		
	}
	public restfulVastaus(int kysymys_id, int weight) {
		this.kysymys_id=kysymys_id;
		this.weight=weight;
	}
	public restfulVastaus(String kayttajanimi, String breed, float weight) {
		this.kayttajanimi=kayttajanimi;
		this.breed=breed;
		this.weight=weight;
	}
	public restfulVastaus(String breed, String weight) {
		this.breed=breed;
		this.setWeight(weight);
	}
	public restfulVastaus(String kayttajanimi, String breed, String weight) {
		this.setId(kayttajanimi);
		this.breed=breed;
		this.setWeight(weight);
	}
	public String getId() {
		return kayttajanimi;
	}
	public void setId(String kayttajanimi) {
		this.kayttajanimi = kayttajanimi;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setWeight(String weight) {
		try {
			this.weight = Float.parseFloat(weight);
		}
		catch (NumberFormatException | NullPointerException e) {
			//Do nothing - the value is not changed
		}
	}
}