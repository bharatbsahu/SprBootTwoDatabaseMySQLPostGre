package com.baeldung.springmultipledatasources.dto;

import java.util.Optional;

import com.baeldung.springmultipledatasources.todos.Todo;
import com.baeldung.springmultipledatasources.topics.Topic;

public class UserDto {
	
	private Todo todo;
	private Topic topic;
	
	
	
	public UserDto(Todo todo, Topic topic) {
		super();
		this.todo = todo;
		this.topic = topic;
	}
	
	public UserDto() {

	}

	public Todo getTodo() {
		return todo;
	}
	public void setTodo(Todo todo) {
		this.todo = todo;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	

}
