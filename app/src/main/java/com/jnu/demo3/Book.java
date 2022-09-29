package com.jnu.demo3;

public class Book {
    String name;
    int id;
    Book(String n, int i){
        name = n;
        id = i;
    }

    int getCoverResourceId(){
        return id;
    }

    String getTitle(){
        return name;
    }
}
