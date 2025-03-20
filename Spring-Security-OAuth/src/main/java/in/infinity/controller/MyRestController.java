package in.infinity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/")
	public ResponseEntity<String> getVerify() {
		return new ResponseEntity<String>("Welcome to OAuth Verifictaion", HttpStatus.OK);
	}

}
