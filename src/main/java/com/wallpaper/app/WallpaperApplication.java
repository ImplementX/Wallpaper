package com.wallpaper.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@EnableAutoConfiguration
@SpringBootApplication
public class WallpaperApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallpaperApplication.class, args);
	}
}
