package data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="kysymykset")
public class questions {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int kysymys_id;
	@Column(name ="kysymys")
	private String kysymys;
	
	public questions (String kysymys_id, String kysymys) {
		setId(kysymys_id);
		this.kysymys = kysymys;
	}
	public questions() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return kysymys_id;
	}
	public void setId(int kysymys_id) {
		this.kysymys_id = kysymys_id;
		
	}
	public void setId(String kysymys_id) {
		try {
			this.kysymys_id = Integer.parseInt(kysymys_id);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public String getKysymys() {
		return kysymys;
	}
	public void setKysymys(String kysymys) {
		this.kysymys = kysymys;
	}
	
	
	
}