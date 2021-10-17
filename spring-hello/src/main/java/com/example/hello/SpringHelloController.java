package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

@RestController
public class SpringHelloController {

	@GetMapping("/")
	public String hostname() throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		return addr.getHostName();
	}

	@GetMapping(value = "/test")
	public ResponseEntity randomStatusTest() {
		HttpStatus status = HttpStatus.values()[new Random().nextInt(HttpStatus.values().length)];
		return new ResponseEntity(status);
	}
}
