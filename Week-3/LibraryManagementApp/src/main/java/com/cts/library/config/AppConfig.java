package com.cts.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cts.library.service.LibraryService;

@Configuration
public class AppConfig {

    @Bean
    public LibraryService libraryService() {
        return new LibraryService();
    }
}
