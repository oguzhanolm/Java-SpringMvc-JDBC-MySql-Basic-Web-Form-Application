package webapp.StudyCase.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import webapp.StudyCase.DAO.FormDAO;
import webapp.StudyCase.DAO.FormDAOImpl;

@Configuration
@ComponentScan(basePackages="webapp.StudyCase")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	
//	Veritabani baglantimiz icin veritabani yolunu datasorce methodu ile belirtiyoruz 
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bayilik_basvuru");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        
        return dataSource;
	}

// 	ViewResolver methodumuz "MVC" modelinin View kismi ile alakali olarak Java Server Page dosyalarimizin adreslemesini yapiyor 	
	
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}	

    @Bean
    public FormDAO getFormDAO() {
        return new FormDAOImpl(getDataSource());
    }

	
}
