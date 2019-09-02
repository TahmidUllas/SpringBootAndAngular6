package com.misl.DOS;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.misl.DOS.Storage.StorageService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Resource
	StorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}