package com.edu007fatjar;

import com.microee.edu003jar.model.Article;

public class App {
    public static void main(String[] args) {
        Article a1 = new Article();
        a1.setTitle("这是一片文章");
        System.out.println(a1.getTitle());
    }
}