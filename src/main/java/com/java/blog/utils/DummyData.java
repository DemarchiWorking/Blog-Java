package com.java.blog.utils;

import com.java.blog.model.Post;
import com.java.blog.repository.CodeblogRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Antonio Eduardo Silvei");
        post1.setDate(LocalDate.now());
        post1.setTitulo("Desenvolvedor Full Stack");
        post1.setTexto("TEST1");

        Post post2 = new Post();
        post2.setAutor("Armenio S.");
        post2.setDate(LocalDate.now());
        post2.setTitulo("Engenheiro de Software");
        post2.setTexto("TEST2");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}