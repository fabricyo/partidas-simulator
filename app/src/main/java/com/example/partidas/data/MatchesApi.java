package com.example.partidas.data;

import com.example.partidas.domain.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("partidas.json")
    Call<List<Match>> getMatches();

}
