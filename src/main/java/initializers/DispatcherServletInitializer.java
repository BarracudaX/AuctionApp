package initializers;

import configuration.SpringRootConfiguration;
import configuration.SpringServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringRootConfiguration.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringServletConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
