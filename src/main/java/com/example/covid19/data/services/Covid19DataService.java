package com.example.covid19.data.services;

import com.example.covid19.data.models.Covid;
import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Data
public class Covid19DataService {
    String apiKey = "40ece3a68dmshf26be0807bf902cp184e76jsn999733fa245d";
    String baseUrl ="https://covid-193.p.rapidapi.com/statistics";
    WebClient webClient = WebClient.create(baseUrl);

    public Mono<Covid> getCountryData(String name){
        Mono<Covid> results = webClient
                .get()
                .uri(
                        (s) -> s
                                .queryParam("country", name)
                                .build()
                )
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", "covid-193.p.rapidapi.com")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Covid.class);
        //to show no of deaths
        Covid covid = results.block();
        System.out.println(covid.getResponse().get(0).getDeaths());
        return results;

    }
}
