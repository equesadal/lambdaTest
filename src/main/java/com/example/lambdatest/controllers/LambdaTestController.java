package com.example.lambdatest.controllers;

import com.example.lambdatest.process.*;
import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LambdaTestController {

	@PostMapping(path = "/lambdatest", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String LambdaTest(@RequestBody String requestBody) {
		OperationResolver resolver = new OperationResolver();
		OperationInputParser parser = new OperationInputParser();
		StringBuilder output = new StringBuilder();

		ArrayList<OperationInput> inputs = parser.Parse(requestBody); // I didnt add sanizitation for the requestBody for now, in prod that is a must.

		System.out.println("Starting to process");
		for(OperationInput input:inputs) {
		    String result = resolver.Resolve(input.operationType, input.number);
		    output.append(result + "\n");
		}

		return output.toString();
	}
}
