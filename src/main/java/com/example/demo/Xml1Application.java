package com.example.demo;

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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import ioOperation.Restcontroller;

@SpringBootApplication
@ComponentScan(basePackageClasses=Restcontroller.class)
public class Xml1Application {

	public static void main(String[] args) {
		//test();
		SpringApplication.run(Xml1Application.class, args);
	}
	@SuppressWarnings({ "unchecked", "null" })
	public static void test()
				{  

		try {
			        File inputFile = new File("M:\\Eclipse\\Settings\\Xml-1\\src\\main\\resources\\mondial.xml");
			        SAXBuilder saxBuilder = new SAXBuilder();
			        Document document = saxBuilder.build(inputFile);
			        System.out.println("Root element :" + document.getRootElement().getName());
			        Element classElement = document.getRootElement();			    
			        classElement.getChildren();
			        @SuppressWarnings("unchecked")
					List<Element> countryList1 = classElement.getChildren("country");
			        List<Element> cityList = null ;
			        List<Element> cityElementList; 
			        
			        List<Element> cityElementList1 = countryList1.stream()
			        		.filter(c->c.getAttribute("id").getValue().equalsIgnoreCase("f0_136"))
			        	    .collect(Collectors.toList());
			        
			        Element country1 = cityElementList1.get(0);
			        cityElementList1= country1.getChildren("city");
			        
			        List<String>  input = new ArrayList<String>();
			        
			       // System.out.println(Arrays.deepToString(cityElementList1.toArray()));
			       // cityElementList1.forEach(name->System.out.println(name.getAttribute("id").getValue())) ;
			/*
			 * <form:label path="keywords">Full name:</form:label> <form:input
			 * path="keywords" value="${attribute}"/><br/>
			 */
			       for(int i=0;i<cityElementList1.size();i++)
			       {
			    	   
			    	   input.add(cityElementList1.get(i).getAttribute("id").getValue().toString());
			       }
			        
			        System.out.println(input.toString());
			       
			        cityElementList1 = cityElementList1.stream()
			        		.filter(c->c.getAttribute("id").getValue().equalsIgnoreCase("f0_36498"))
			        	    .collect(Collectors.toList());

			        cityElementList1= cityElementList1.get(0).getChildren();
			        
				     
			    System.out.println(cityElementList1.get(2).getAttribute("type").getValue());
			 		
//			        for(int i=0;i<countryList1.size();i++)
//			        {
//			        	  Element country = countryList1.get(i);
//			        	  Attribute attribute =  country.getAttribute("id");
//			        	  
//			        	  if("f0_136".equalsIgnoreCase(attribute.getValue()))
//			        	  {
//			        		  	  cityList  = country.getChildren("city");
//					        	  for(int i1=0;i1<cityList.size();i1++)
//							        {
//						        		  Element city = cityList.get(i1);
//							        	  Attribute attribute1 =  city.getAttribute("id");
//					
//							        	  if("f0_36498".equalsIgnoreCase(attribute1.getValue()))
//							        	  {
//							        		  cityElementList= city.getChildren(); 
//							        		  System.out.println( city.getAttribute("longitude")+"--"+city.getAttribute(""
//							        		  		+ "latitude"));
//							        		  
//							        		  System.out.println(cityElementList.get(2).getAttribute("type").getValue());
//							        		  break;
//							        		  }
//			
//							        }
//					        	  break;
//					        }
//			        		  
//			        	}
			        

				}
		 			
			  	catch(JDOMException e) {
			        e.printStackTrace();
			     } 
		        catch(IOException ioe) {
			        ioe.printStackTrace();
			     }
			
				}
		
}

