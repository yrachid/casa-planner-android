package br.com.yrachid.casaplanner.di.components;

import javax.inject.Singleton;

import br.com.yrachid.casaplanner.MainActivity;
import br.com.yrachid.casaplanner.di.modules.HttpModule;
import dagger.Component;

/**
 * Created by yrachid on 8/29/16.
 */

@Singleton
@Component(modules = {HttpModule.class})
public interface HttpComponent {

    void inject(MainActivity activity);

}
