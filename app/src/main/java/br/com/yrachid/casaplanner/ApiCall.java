package br.com.yrachid.casaplanner;


import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;

public class ApiCall extends AsyncTask<Retrofit, List<Imovel>, List<Imovel>>{

    @Override
    protected List<Imovel> doInBackground(Retrofit[] params) {

        CasaPlannerService service = params[0].create(CasaPlannerService.class);

        List<Imovel> imoveis = new ArrayList<>();

        try {
            Response<List<Imovel>> imovels = service.listImoveis().execute();
            imoveis = imovels.body();

            Log.i("AAAA", Boolean.toString(imovels.isSuccessful()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return imoveis;

    }
}
