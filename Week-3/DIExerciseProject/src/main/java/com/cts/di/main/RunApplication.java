package com.cts.di.main;

import com.cts.di.service.LibraryManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LibraryManager manager = (LibraryManager) context.getBean("libraryManager");
        manager.showLibraryInfo();
    }
}
