package pl.coderslab.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {
	
	
public void onStartup(ServletContext container) throws ServletException {

		
		AnnotationConfigWebApplicationContext ctx = 
				new AnnotationConfigWebApplicationContext(); // Tworzymy kontekst aplikacji.

		ctx.register(AppConfig.class); // Rejestrujemy klasę konfiguracji.
		ctx.setServletContext(container); // Ustawiamy kontekst servletów.
		ServletRegistration.Dynamic servlet = 
				container.addServlet(
						"dispatcher", new DispatcherServlet(ctx)); //Tworzymy i ustawiamy DispatcherServlet .
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
}


