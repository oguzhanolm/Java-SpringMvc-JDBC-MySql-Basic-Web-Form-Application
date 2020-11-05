package webapp.StudyCase.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import webapp.StudyCase.DAO.FormDAO;
import webapp.StudyCase.model.Form;

@Controller
public class HomeController {
	
	@Autowired
	private FormDAO formDAO;

//	home isimli jsp dosyam�z�n y�nlendirmesini 
	
	@RequestMapping(value="/")
	public ModelAndView newForm(ModelAndView model) throws IOException{
		Form newForm = new Form();
		model.addObject("form", newForm);
		model.setViewName("home");
		return model;		
	}
	
//	Form ekran�m�zda butona basarak g�nderme i�lemini yapt�ktan sonra form g�nderimi ba�ar�l� sayfas�na y�nlendirme
	
	@RequestMapping(value = "/saveForm", method = RequestMethod.POST)
	public ModelAndView saveForm(@ModelAttribute Form form) {
	    formDAO.saveForm(form);
	    return new ModelAndView("/formsent");
	}
}
