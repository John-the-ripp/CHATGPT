package com.example.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;
    private int user_id;

    public Article(int id, int user_id) {
        this.id = id;
        this.user_id = user_id;
    }

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", user_id=" + user_id +
                '}';
    }
}
