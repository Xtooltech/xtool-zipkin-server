package com.xtool.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class XtoolZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(XtoolZipkinServerApplication.class, args);
	}
}
