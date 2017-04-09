package com.ddxx.provider;

import java.util.List;

import com.ddxx.model.User;

public interface DemoService {

	String sayHello(String name);

	public List<User> getUsers();

}