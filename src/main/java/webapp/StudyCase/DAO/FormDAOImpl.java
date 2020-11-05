package webapp.StudyCase.DAO;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import webapp.StudyCase.model.Form;

public class FormDAOImpl implements FormDAO {
	
// 		*Veritabani implamentasyon islerleri için kullanacagimiz constructor methot	
	
	 private JdbcTemplate jdbcTemplate;	 
	 
	    public FormDAOImpl(DataSource dataSource) {
	        jdbcTemplate = new JdbcTemplate(dataSource);
	    }

	    
	    
//		*Form girdilerimizi alttaki override mothodu ile veritabanina kayit sorgusunu yolluyoruz	
	    
	@Override
	public void saveForm(Form form) {
		String sql = "INSERT INTO basvuru_formu (ad_soyad, tc, adres, telefon, eposta, dogum_tarihi, soru1, soru2, soru3, soru4, soru5)" + " VALUES (?, ?, ?, ?,?, ?, ?, ?,?, ?, ?)";
    jdbcTemplate.update(sql, form.getAdSoyad(),form.getTc(),form.getAdres(),form.getTelefon(),form.getMail(),form.getDogumTarihi(),form.getSoru1(),form.getSoru2(),form.getSoru3(),form.getSoru4(),form.getSoru5());
		
	}

	
}
