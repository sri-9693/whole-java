package com.vathsa.ASD.beans.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vathsa.ASD.beans.Aadharcard;
import com.vathsa.ASD.beans.Citizen;

@Configuration
@ComponentScan(basePackages="com.vathsa.ASD.beans")
public class Appconfi
{
	@Bean
     public  Aadharcard aadharcard()
     {
		return new Aadharcard("Ravi",35,"Male",3456);
     }
	@Bean
	public Citizen citizen()
	{
		return new Citizen(1234,"abc@hotmail.com",aadharcard());
	}
}
