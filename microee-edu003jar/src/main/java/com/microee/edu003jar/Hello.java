package com.microee.edu003jar;

import com.microee.edu003jar.model.Article;

public class Hello {
	public static void main (String[] args) {
		System.out.println("hello");
		User u1 = new User();
		u1.setName("keesh。张");
		System.out.println(u1.getName());
		Article a1 = new Article();
		System.out.println(a1.getTitle());
	}
}
