package br.com.yrachid.casaplanner.factories;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yrachid on 8/26/16.
 */
public class RetrofitFactory {

    public Retrofit create(String host, String port) {

        return new Retrofit
                    .Builder()
                    .baseUrl(String.format("http://%s:%s", host, port ))
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
    }

}
