package data;

public class questions {
	private int kysymys_id;
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