package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Post {

    @Id
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;

    //relationship
    @OneToMany
    @JoinColumn(name = "post_id")
    private List<Comment> comment;
}

