package com.example.lteixeira.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Lehi on 24/04/2017.
 */

public interface CityApi {

    @GET("Master/CidadeServico.svc/rest/BuscaTodasCidades")
    Call<List<City>> getCities();

    @POST("Master/CidadeServico.svc/rest/BuscaPontos")
    Call<String> getPoints(@Body City city);


}
