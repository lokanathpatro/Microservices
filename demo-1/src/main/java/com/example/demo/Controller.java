package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


@RestController
public class Controller {
	@GetMapping(path="/quote", produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ObjectNode getMessage() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode node = mapper.createObjectNode();
		node.put("text", "springCloud-microservice");
		node.put("author", "Lokanath");
		return node;}
	
	@GetMapping(path="/quote-qa", produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ObjectNode getMessageQa() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode node = mapper.createObjectNode();
		node.put("text", "microservice");
		node.put("author", "Santosh");
		return node;}
}

/*@RestController
public class Controller {
	@GetMapping(path="/quote")
	public String getMessage() {
		
		return "Loka";}
}*/

