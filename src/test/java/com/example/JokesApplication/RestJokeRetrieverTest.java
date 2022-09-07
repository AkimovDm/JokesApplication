package com.example.JokesApplication;

import com.example.JokesApplication.Jokes.JokeImporterDTO;
import com.example.JokesApplication.Jokes.JokeRetriever;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;



@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = JokesApplication.class)

public class RestJokeRetrieverTest {

    @Autowired
    JokeRetriever jokeRetriever;

    @Test
    void getJoke() {
        JokeImporterDTO result=jokeRetriever.getJoke();
       Assert.isTrue(result.value.joke.contains("Chuck Norris"));


    }
}