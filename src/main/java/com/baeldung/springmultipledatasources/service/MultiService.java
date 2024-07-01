package com.baeldung.springmultipledatasources.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.springmultipledatasources.dto.UserDto;
import com.baeldung.springmultipledatasources.todos.Todo;
import com.baeldung.springmultipledatasources.todos.TodoRepository;
import com.baeldung.springmultipledatasources.topics.Topic;
import com.baeldung.springmultipledatasources.topics.TopicRepository;

@Service
public class MultiService {
	
	@Autowired
	TodoRepository _todoRepository;
	
	@Autowired
	TopicRepository _topicRepository;
	
	public Optional<Todo> TodoMethod(Long id){
		
		return _todoRepository.findById(id);
		
	}
	
	public Optional<Topic> TopicMethod(Long id){
		
		return _topicRepository.findById(id);
		
	}
	

}
