package br.com.yrachid.casaplanner;


import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.yrachid.casaplanner.models.Imovel;
import br.com.yrachid.casaplanner.services.ImoveisService;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ApiCall extends AsyncTask<Retrofit, List<Imovel>, List<Imovel>>{

    private String message;

    @Override
    protected List<Imovel> doInBackground(Retrofit[] params) {

        ImoveisService service = params[0].create(ImoveisService.class);

        List<Imovel> imoveis = new ArrayList<>();

        try {
            Response<List<Imovel>> imovels = service.all().execute();
            imoveis = imovels.body();

        } catch (IOException e) {
            message = e.getMessage();
            e.printStackTrace();
        }

        return imoveis;

    }

    @Override
    protected void onPostExecute(List<Imovel> imovels) {
        super.onPostExecute(imovels);
    }
}
