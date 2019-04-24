package com.lavylearns.gcpgradlespring1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lavanya K on 2019-04-24.
 */
@RestController
@RequestMapping(value="/lavyLearns", produces = MediaType.APPLICATION_JSON_VALUE)
public class JustAnApi {
	@RequestMapping(path="/helloApi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> helloApi(){
	 return new ResponseEntity<>("Hello World.. Lavy learned Gradle setup and publishing api to GCP.. YAY YAY", HttpStatus.OK);
	}
}
