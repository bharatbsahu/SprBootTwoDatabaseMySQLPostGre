package com.baeldung.springmultipledatasources.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.springmultipledatasources.dto.UserDto;
import com.baeldung.springmultipledatasources.service.MultiService;
import com.baeldung.springmultipledatasources.todos.Todo;
import com.baeldung.springmultipledatasources.topics.Topic;

@RestController
public class Controller {
	
    @Autowired
    private MultiService _multiService;

    @GetMapping("/todo/{id}")
    public Optional<Todo> getTodoData(@PathVariable(value = "id") Long Id){
    	
        return _multiService.TodoMethod(Id);
    }
    
    @GetMapping("/topic/{id}")
    public Optional<Topic> getTopicData(@PathVariable(value = "id") Long Id){
    	
        return _multiService.TopicMethod(Id);
    }
    
    @GetMapping("/data/{id}")
    public UserDto getData(@PathVariable(value = "id") Long Id){
    	
    	UserDto _userDto = null;
    	
    	Optional<Todo> todo = _multiService.TodoMethod(Id);
    	
    	Optional<Topic> topic = _multiService.TopicMethod(Id);
    	
    	_userDto = new UserDto();
    	_userDto.setTodo(todo.get());
    	_userDto.setTopic(topic.get());
    	
        return _userDto;
    }
}
