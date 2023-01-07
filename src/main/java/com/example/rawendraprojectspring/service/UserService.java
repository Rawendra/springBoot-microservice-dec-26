package com.example.rawendraprojectspring.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.rawendraprojectspring.controller.Users;

@Component
public class UserService {

	private static List<Users> list = new ArrayList<>();
	private static int userCount;

	static {
		list.add(new Users("ALEX", 123, LocalDate.of(1995, 01, 22)));
		list.add(new Users("RAVI", 124, LocalDate.of(1995, 07, 22)));
		list.add(new Users("TOM", 125, LocalDate.of(1920, 9, 22)));
		list.add(new Users("JIM", 126, LocalDate.of(1925, 04, 22)));
	}

	public static List<Users> getAllUsers() {
		return list;
	}

	public static Users getUserForId(Integer id) {
		Predicate<? super Users> predicate = user -> user.getId().equals(id);
		Users user = list.stream().filter(predicate).findFirst().orElse(null);
		return user;
	}

	public static Users createUser(Users user) {
		list.add(user);
		return user;

	}

	public static Users deleteForID(int id) {
		Predicate<? super Users> predicate = user -> user.getId().equals(id);
		Users user = getUserForId(id);
		list.removeIf(predicate);
		return user;

	}

}
