package com.wjw.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created on 2020/12/22 0022
 *
 * @author weng
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("MyListener.contextInitialized…………");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("MyListener.contextDestroyed………………");
    }
}
