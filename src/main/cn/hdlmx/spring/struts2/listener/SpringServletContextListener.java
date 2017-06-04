package cn.hdlmx.spring.struts2.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String config = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        servletContext.setAttribute("applicationContext", ctx);

    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
