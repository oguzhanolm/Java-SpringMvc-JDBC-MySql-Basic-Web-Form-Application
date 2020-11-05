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

//	home isimli jsp dosyamýzýn yönlendirmesini 
	
	@RequestMapping(value="/")
	public ModelAndView newForm(ModelAndView model) throws IOException{
		Form newForm = new Form();
		model.addObject("form", newForm);
		model.setViewName("home");
		return model;		
	}
	
//	Form ekranýmýzda butona basarak gönderme iþlemini yaptýktan sonra form gönderimi baþarýlý sayfasýna yönlendirme
	
	@RequestMapping(value = "/saveForm", method = RequestMethod.POST)
	public ModelAndView saveForm(@ModelAttribute Form form) {
	    formDAO.saveForm(form);
	    return new ModelAndView("/formsent");
	}
}
