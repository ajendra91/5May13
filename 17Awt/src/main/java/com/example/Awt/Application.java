package com.example.Awt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);
		SpringApplicationBuilder sab=new SpringApplicationBuilder(Application.class);
		sab.headless(false).run(args);
		JFrame fm=new JFrame("ajendra frame");
		fm.setSize(500,500);
		fm.setVisible(true);
	}

}
