package webapp.StudyCase.model;

import java.sql.Date;

public class Form {
	
	private Integer basvuru_no;
	private String adSoyad;
	private String tc;
	private String adres;
	private String telefon;
	private String mail;
	private Date dogumTarihi;
	private String soru1;
	private String soru2;
	private String soru3;
	private String soru4;
	private String soru5;
	
	public Form() {
		
	}

	public Form(Integer basvuru_no, String adSoyad, String tc, String adres, String telefon, String mail,
			Date dogumTarihi, String soru1, String soru2, String soru3, String soru4, String soru5) {
		this.basvuru_no = basvuru_no;
		this.adSoyad = adSoyad;
		this.tc = tc;
		this.adres = adres;
		this.telefon = telefon;
		this.mail = mail;
		this.dogumTarihi = dogumTarihi;
		this.soru1 = soru1;
		this.soru2 = soru2;
		this.soru3 = soru3;
		this.soru4 = soru4;
		this.soru5 = soru5;
	}

	public Integer getBasvuru_no() {
		return basvuru_no;
	}

	public void setBasvuru_no(Integer basvuru_no) {
		this.basvuru_no = basvuru_no;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public String getSoru1() {
		return soru1;
	}

	public void setSoru1(String soru1) {
		this.soru1 = soru1;
	}

	public String getSoru2() {
		return soru2;
	}

	public void setSoru2(String soru2) {
		this.soru2 = soru2;
	}

	public String getSoru3() {
		return soru3;
	}

	public void setSoru3(String soru3) {
		this.soru3 = soru3;
	}

	public String getSoru4() {
		return soru4;
	}

	public void setSoru4(String soru4) {
		this.soru4 = soru4;
	}

	public String getSoru5() {
		return soru5;
	}

	public void setSoru5(String soru5) {
		this.soru5 = soru5;
	}
	
}
