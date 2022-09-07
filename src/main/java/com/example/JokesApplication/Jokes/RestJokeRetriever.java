package com.example.JokesApplication.Jokes;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestJokeRetriever implements JokeRetriever {

    private final RestTemplate restTemplate;

    private static String url = "http://api.icndb.com/jokes/random";

    public RestJokeRetriever(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public JokeImporterDTO getJoke() {
        ResponseEntity<JokeImporterDTO> result = restTemplate.getForEntity(url,JokeImporterDTO.class);
        return result.getBody();
    }
}
