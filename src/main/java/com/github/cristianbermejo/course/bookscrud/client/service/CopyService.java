package com.github.cristianbermejo.course.bookscrud.client.service;

import java.util.List;

import com.github.cristianbermejo.course.bookscrud.client.model.Copy;

public interface CopyService {
	List<Copy> newCopy(Copy copy);
}
