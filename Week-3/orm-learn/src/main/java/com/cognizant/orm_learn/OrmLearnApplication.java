package com.cognizant.orm_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        LOGGER.info("Inside main");

        countryService = context.getBean(CountryService.class);

        Country india = new Country();
        india.setCode("IN");
        india.setName("India");
        countryService.addCountry(india);

        Country usa = new Country();
        usa.setCode("US");
        usa.setName("United States of America");
        countryService.addCountry(usa);

        testGetAllCountries();
        System.out.println("\nDifference between JPA, Hibernate and Spring Data JPA");
System.out.println("JPA : Java Persistence API (Specification)");
System.out.println("Hibernate : ORM Framework implementing JPA");
System.out.println("Spring Data JPA : Simplifies JPA by reducing boilerplate code");
    }

   private static void testGetAllCountries() {

    System.out.println("Country Details");

    List<Country> countries = countryService.getAllCountries();

    for (Country country : countries) {
        System.out.println("Code : " + country.getCode());
        System.out.println("Name : " + country.getName());
    }

}
}