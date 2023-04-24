package com.github.cristianbermejo.course.bookscrud.client.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.cristianbermejo.course.bookscrud.client.model.Copy;

@Service
public class CopyServiceImpl implements CopyService {
	
	private static final String URL = "http://books-service";
	
	@Autowired
	RestTemplate template;

	@Override
	public List<Copy> newCopy(Copy copy) {
		template.postForLocation(URL + "/book", copy);
		return Arrays.asList(template.getForObject(URL + "/books", Copy[].class));
	}

}
