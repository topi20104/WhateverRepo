package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import data.ehdokas;
import data.questions;
import data.vastaus;

public class Dao {
	private String url;
	private String user;
	private String pass;
	private Connection conn;
	public Dao(String url, String user, String pass) {
		this.url=url;
		this.user=user;
		this.pass=pass;
	}
	
	public boolean getConnection() {
		try {
	        if (conn == null || conn.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver").newInstance();
	            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
	                throw new SQLException(e);
	            }
	            conn = DriverManager.getConnection(url, user, pass);
	        }
	        return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public ArrayList<ehdokas> readAllehdokas() {
		ArrayList<ehdokas> list=new ArrayList<>();
		try {
			Statement stmt=conn.createStatement();
			ResultSet RS=stmt.executeQuery("select * from ehdokkaat");
			while (RS.next()){
				ehdokas f=new ehdokas();
				f.setId(RS.getInt("Ehdokas_ID"));
				f.setSukunimi(RS.getString("Sukunimi"));
				f.setEtunimi(RS.getString("Etunimi"));
				f.setPuolue(RS.getString("Puolue"));
				f.setKotipaikkakunta(RS.getString("Kotipaikkakunta"));
				f.setIka(RS.getInt("Ika"));
				f.setMiksi(RS.getString("Miksi_eduskuntaan"));
				f.setMita(RS.getString("Mita_asioita_haluat_edistaa"));
				f.setAmmatti(RS.getString("Ammatti"));
				f.setSalasana(RS.getString("Salasana"));
				f.setKayttajanimi(RS.getString("Kayttajanimi"));
				list.add(f);
				
			}
			return list;
		}
		catch(SQLException e) {
			return null;
		}
	}

	public ArrayList<ehdokas> updateehdokas(ehdokas f) {
		try {
			String sql="update ehdokkaat set Sukunimi=?, Etunimi=?, Puolue=?, Kotipaikkakunta=?, Ika=?, Miksi_eduskuntaan=?, Mita_asioita_haluat_edistaa=?, Ammatti=?, Salasana=?, Kayttajanimi=? where Ehdokas_ID=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, f.getSukunimi());
			pstmt.setString(2, f.getEtunimi());
			pstmt.setString(3, f.getPuolue());
			pstmt.setString(4, f.getKotipaikkakunta());
			pstmt.setInt(5, f.getIka());
			pstmt.setString(6, f.getMiksi());
			pstmt.setString(7, f.getMita());
			pstmt.setString(8, f.getAmmatti());
			pstmt.setString(9, f.getSalasana());
			pstmt.setString(10, f.getKayttajanimi());
			pstmt.setInt(11, f.getId());
			pstmt.executeUpdate();
			return readAllehdokas();
		}
		catch(SQLException e) {
			return null;
		}
	}
	public ArrayList<ehdokas> insertehdokas(ehdokas f) {
		try {
			String sql="insert into ehdokkaat (Sukunimi, Etunimi, Puolue, Kotipaikkakunta, Ika, Miksi_eduskuntaan, Mita_asioita_haluat_edistaa, Ammatti, Salasana, Kayttajanimi) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, f.getSukunimi());
			pstmt.setString(2, f.getEtunimi());
			pstmt.setString(3, f.getPuolue());
			pstmt.setString(4, f.getKotipaikkakunta());
			pstmt.setInt(5, f.getIka());
			pstmt.setString(6, f.getMiksi());
			pstmt.setString(7, f.getMita());
			pstmt.setString(8, f.getAmmatti());
			pstmt.setString(9, f.getSalasana());
			pstmt.setString(10, f.getKayttajanimi());
			pstmt.executeUpdate();
			return readAllehdokas();
		}
		catch(SQLException e) {
			return null;
		}
	}
	public ArrayList<ehdokas> deleteehdokas(String Ehdokas_ID) {
		try {
			String sql="delete from ehdokkaat where EHDOKAS_ID=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, Ehdokas_ID);
			pstmt.executeUpdate();
			return readAllehdokas();
		}
		catch(SQLException e) {
			return null;
		}
	}

	public ehdokas readehdokas(String id) {
		ehdokas f=null;
		try {
			String sql="select * from ehdokkaat where EHDOKAS_ID=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet RS=pstmt.executeQuery();
			while (RS.next()){
				f=new ehdokas();
				f.setId(RS.getInt("ehdokas_id"));
				f.setEtunimi(RS.getString("etunimi"));
				f.setSukunimi(RS.getString("sukunimi"));
				f.setPuolue(RS.getString("puolue"));
				f.setKotipaikkakunta(RS.getString("kotipaikkakunta"));
				f.setIka(RS.getInt("ika"));
				f.setMiksi(RS.getString("miksi_eduskuntaan"));
				f.setMita(RS.getString("mita_asioita_haluat_edistaa"));
				f.setAmmatti(RS.getString("ammatti"));
				f.setSalasana(RS.getString("salasana"));
				f.setKayttajanimi(RS.getString("kayttajanimi"));
				
			}
			return f;
		}
		catch(SQLException e) {
			return null;
		}
	}
	public ehdokas readehdokasshow(String id) {
		ehdokas g=null;
		try {
			String sql="select * from ehdokkaat where EHDOKAS_ID=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet RS=pstmt.executeQuery();
			while (RS.next()){
				g=new ehdokas();
				g.setId(RS.getInt("ehdokas_id"));
				g.setEtunimi(RS.getString("etunimi"));
				g.setSukunimi(RS.getString("sukunimi"));
				g.setPuolue(RS.getString("puolue"));
				g.setKotipaikkakunta(RS.getString("kotipaikkakunta"));
				g.setIka(RS.getInt("ika"));
				g.setMiksi(RS.getString("miksi_eduskuntaan"));
				g.setMita(RS.getString("mita_asioita_haluat_edistaa"));
				g.setAmmatti(RS.getString("ammatti"));
				g.setKayttajanimi(RS.getString("kayttajanimi"));
				
			}
			return g;
		}
		catch(SQLException e) {
			return null;
		}
	}
	public questions readQuestions(String id) {
		questions f=null;
		try {
			String sql="select * from kysymykset where KYSYMYS_ID=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet RS=pstmt.executeQuery();
			while (RS.next()){
				f=new questions();
				f.setId(RS.getInt("kysymys_id"));
				f.setKysymys(RS.getString("kysymys"));
				
			}
			return f;
		}
		catch(SQLException e) {
			return null;
		}
	}
	public ArrayList<questions> readAllQuestions() {
		ArrayList<questions> list=new ArrayList<>();
		try {
			Statement stmt=conn.createStatement();
			ResultSet RS=stmt.executeQuery("select * from kysymykset");
			while (RS.next()){
				questions f=new questions();
				f.setId(RS.getInt("Kysymys_ID"));
				f.setKysymys(RS.getString("Kysymys"));
				list.add(f);
				
			}
			return list;
		}
		catch(SQLException e) {
			return null;
		}
	}
	public ArrayList<vastaus> insertAnswers(vastaus f) {
		
		try {
			
			String insert1 = "insert into vastaukset (Kayttajanimi, Vastaus, Kysymys_id, Kommentti) VALUES (?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(insert1);
			stmt.setString(1, f.getKayttajanimi());
			stmt.setInt(3, f.getVastaus());
			stmt.setInt(2, f.getKysymys_id());
			stmt.setString(4, f.getKommentti());
			stmt.executeUpdate();
			return readAllAnswers();
		}
			catch(SQLException e) {
				return null;
			}
	}
	
	
	public ArrayList<vastaus> readAllAnswers() {
		ArrayList<vastaus> list=new ArrayList<>();
		try {
			Statement stmt=conn.createStatement();
			ResultSet RS=stmt.executeQuery("select * from vastaukset");
			while (RS.next()){
				vastaus f=new vastaus();
				f.setKysymys_id(RS.getInt("Kysymys_ID"));
				f.setKayttajanimi(RS.getString("Kayttajanimi"));
				f.setVastaus(RS.getInt("Vastaus"));
				f.setKommentti(RS.getString("Kommentti"));
				list.add(f);
			}
			return list;
		}
		catch(SQLException e) {
			return null;
		}
	}
}
