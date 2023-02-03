package com.in28minutes.springboot.learnspringboot;

public class Course {
    private long id;
    private String name;
    private String author;

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //Getters
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("Course [id= %s, name= %s, author= %s]", id, name, author);
    }
}
