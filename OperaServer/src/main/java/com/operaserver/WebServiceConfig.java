package com.operaserver;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
/**
 * WebServiceConfig
 * 
 *Beans Configuration
 *
 * @author dheeraj
 * 
 */
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext)
	{
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ows/resvadv/*");
	}

	@Bean(name = "resvadvanced")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema resvAdvancedSchema) 
	{
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("resvAdvanced");
		wsdl11Definition.setLocationUri("/ows");
		wsdl11Definition.setTargetNamespace("http://opera.com/ows/resvadv");
		wsdl11Definition.setSchema(resvAdvancedSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema resvAdvancedSchema() 
	{
		return new SimpleXsdSchema(new ClassPathResource("ResvAdvanced.xsd"));
	}
}