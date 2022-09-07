package com.example.JokesApplication.cli;

import com.example.JokesApplication.Jokes.JokeRetriever;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellCommands {
    private final JokeRetriever jokeRetriever;

    public ShellCommands(JokeRetriever jokeRetriever) {
        this.jokeRetriever = jokeRetriever;
    }
    @ShellMethod("Расскажи шутку")
    public String joke(){
        return jokeRetriever.getJoke().value.joke;

    }


}
