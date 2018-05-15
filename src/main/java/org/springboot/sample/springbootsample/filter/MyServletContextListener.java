package org.springboot.sample.springbootsample.filter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println(servletContextEvent.getServletContext().getClass()+"ServletContex初始化");
        System.out.println(servletContextEvent.getServletContext().getContextPath());
        System.out.println(servletContextEvent.getServletContext().getServerInfo()+"oooooooooo");
    }
//    class org.apache.catalina.core.StandardContext$NoPluggabilityServletContextServletContex初始化
//
//    Apache Tomcat/8.5.31oooooooooo
//            过滤器初始化
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContex销毁");
    }
}
