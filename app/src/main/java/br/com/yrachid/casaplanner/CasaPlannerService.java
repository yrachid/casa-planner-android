package br.com.yrachid.casaplanner;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CasaPlannerService {

    @GET("api/alugueis")
    Call<List<Imovel>> listImoveis();

}
