package com.gddecorator;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.guestdriven.dal.configurations.PersistenceContext;
import com.guestdriven.dal.models.PmsDetails;
import com.guestdriven.dal.models.Service;
import com.guestdriven.dal.repositories.PmsRepository;
import com.guestdriven.dal.repositories.ServiceModeRepository;

@Configuration
@ComponentScan("com.guestdriven.dal.configurations")
@Import(PersistenceContext.class)
@EnableJpaRepositories(basePackages = "com.guestdriven.dal.repositories")
/**
 * MySqlDecorator
 * 
 * Acts as a mediator between the microservices and database access logics
 * 
 * @author dheeraj
 * 
 */
public class MySqlDecorator {
	PmsRepository pmsRepo;
	ServiceModeRepository servModeRepo;
	   public PmsDetails getPmsDetails(String hotelCode)
	   {
		   ConfigurableApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(PersistenceContext.class);
	     pmsRepo=ctx.getBean(PmsRepository.class);
	     PmsDetails pmsDetails= pmsRepo.findByHotelCode(hotelCode);
		   ctx.close();
		   return pmsDetails;
		}
	   public Service getServMode(int id)
	   {
		   ConfigurableApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(PersistenceContext.class);
	     servModeRepo=ctx.getBean(ServiceModeRepository.class);
	     Service servDetails= servModeRepo.findById(id);
		   ctx.close();
		   return servDetails;
		}
}
