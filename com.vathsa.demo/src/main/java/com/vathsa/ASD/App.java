package com.vathsa.ASD;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vathsa.ASD.beans.Citizen;
import com.vathsa.ASD.beans.appconfig.Appconfi;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container = new  AnnotationConfigApplicationContext(Appconfi.class);
       Citizen c = container.getBean(Citizen.class);
       System.out.println(c.getMobileNo()+"  "+c.getEmailId());
       System.out.println("Aadhar details are  :--");
       System.out.println(c.getAadharcard().getAge()+"  "+c.getAadharcard().getGender());
       System.out.println(c.getAadharcard().getName()+" "+c.getAadharcard().getAadharNo());
    }
}
