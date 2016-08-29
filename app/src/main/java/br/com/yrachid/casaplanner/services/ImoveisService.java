package br.com.yrachid.casaplanner.services;


import java.util.List;

import br.com.yrachid.casaplanner.models.Imovel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ImoveisService {

    @GET("api/alugueis")
    Call<List<Imovel>> all();

}
