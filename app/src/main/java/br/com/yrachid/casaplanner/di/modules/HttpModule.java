package br.com.yrachid.casaplanner.di.modules;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yrachid on 8/29/16.
 */
@Module
public class HttpModule {

    private final int remotePort;
    private final String remoteHost;

    public HttpModule(int remotePort, String remoteHost) {
        this.remotePort = remotePort;
        this.remoteHost = remoteHost;
    }

    @Provides
    public Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(Gson gson) {

        return new Retrofit
                .Builder()
                .baseUrl(String.format("http://%s:%s", remoteHost, remotePort))
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

}
