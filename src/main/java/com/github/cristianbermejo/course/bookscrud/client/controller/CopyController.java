package com.github.cristianbermejo.course.bookscrud.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cristianbermejo.course.bookscrud.client.model.Copy;
import com.github.cristianbermejo.course.bookscrud.client.service.CopyService;

@RestController
public class CopyController {

	@Autowired
	private CopyService service;
	
	@PostMapping("copy/{isbn}/{title}/{theme}")
	public List<Copy> createCopy(@PathVariable(name = "isbn") Long isbn,
								 @PathVariable(name = "title") String title,
								 @PathVariable(name = "theme") String theme) {

		return service.newCopy(new Copy(isbn, title, theme));
	}
}
