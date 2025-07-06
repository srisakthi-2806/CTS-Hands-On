package com.cts.library.main;

import com.cts.library.service.LibraryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.library.config.AppConfig;

public class RunApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        LibraryService service = context.getBean(LibraryService.class);
        service.displayBooks();
    }
}
