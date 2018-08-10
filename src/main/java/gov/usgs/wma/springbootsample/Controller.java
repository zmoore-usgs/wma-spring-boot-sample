package gov.usgs.wma.springbootsample;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
	@GetMapping(value = "/world", produces = MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> helloWorld()  throws IOException{
		return new ResponseEntity<>("Hello World!", new HttpHeaders(), HttpStatus.OK);
	}
}
