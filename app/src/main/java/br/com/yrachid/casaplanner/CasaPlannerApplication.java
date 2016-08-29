package br.com.yrachid.casaplanner;

import android.app.Application;

import br.com.yrachid.casaplanner.di.components.DaggerHttpComponent;
import br.com.yrachid.casaplanner.di.components.HttpComponent;
import br.com.yrachid.casaplanner.di.modules.HttpModule;
import butterknife.BindInt;
import butterknife.BindString;


/**
 * Created by yrachid on 8/29/16.
 */
public class CasaPlannerApplication extends Application {

    private HttpComponent httpComponent;

    @BindString(R.string.remote_host)
    String remoteHost;

    @BindInt(R.integer.remote_port)
    int remotePort;

    @Override
    public void onCreate() {

        super.onCreate();

        httpComponent = DaggerHttpComponent
                            .builder()
                            .httpModule(new HttpModule(remotePort, remoteHost))
                            .build();

    }

    public HttpComponent getHttpComponent(){
        return httpComponent;
    }

}
