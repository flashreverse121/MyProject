package ioOperation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Restcontroller
{
	@RequestMapping(value = "/register", method = RequestMethod.POST) 
	 public String submitForm(@ModelAttribute("user") User user) {
			System.out.println(user);
	        return "Result";
	 }

	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public String showForm(Model model) {
			User user=new User();
			List<Element> cityElementList1=null;

			try {
			        File inputFile = new File("M:\\Eclipse\\Settings\\Xml-1\\src\\main\\resources\\mondial.xml");
			        SAXBuilder saxBuilder = new SAXBuilder();
			        Document document = saxBuilder.build(inputFile);
			       // System.out.println("Root element :" + document.getRootElement().getName());
			        Element classElement = document.getRootElement();			    
			        classElement.getChildren();
			        @SuppressWarnings("unchecked")
					List<Element> countryList1 = classElement.getChildren("country");
			        List<Element> cityList = null ;
			        List<Element> cityElementList; 
			        List<String>  input = new ArrayList<String>();
			        List<String> countryList = Arrays.asList("f0_144", "f0_136","f0_149","f0_157","f0_162","f0_169");
			        model.addAttribute("user", user);
				    model.addAttribute("countryList", countryList);
				    
			         cityElementList1 = countryList1.stream()
			        		.filter(c->c.getAttribute("id").getValue().equalsIgnoreCase("f0_136"))
			        	    .collect(Collectors.toList());
			        
			        Element country1 = cityElementList1.get(0);
			        cityElementList1= country1.getChildren("city");
			        
			        for(int i=0;i<cityElementList1.size();i++) {
				    	   input.add(cityElementList1.get(i).getAttribute("id").getValue().toString());
				       }
			       
			        model.addAttribute("cityList",input);
		
			       
			        cityElementList1 = cityElementList1.stream()
			        		
			        		.filter(c->c.getAttribute("id").getValue().equalsIgnoreCase("f0_36498"))
			        	    .collect(Collectors.toList());
			        
			        System.out.println(cityElementList1.get(0).getChild("name").getText()+"--"+user.toString());
			        
			        //cityElementList1= cityElementList1.get(0).getChildren();
			     
			    //System.out.println(cityElementList1.get(2).getAttribute("type").getValue());
     
				}
		 			
			  	catch(JDOMException e) {
			        e.printStackTrace();
			     } 
		        catch(IOException ioe) {
			        ioe.printStackTrace();
			     }
			
			 //cityElementList1.get(2).getAttribute("type").getValue();
		   
		     
		   // System.out.println("Going home...");
	        return "index";
		
				}
}
		