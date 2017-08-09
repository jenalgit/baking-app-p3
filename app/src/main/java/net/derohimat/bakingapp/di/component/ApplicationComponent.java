package net.derohimat.bakingapp.di.component;

import net.derohimat.bakingapp.BaseApplication;
import net.derohimat.bakingapp.data.sources.local.PreferencesHelper;
import net.derohimat.bakingapp.data.sources.remote.ApiService;
import net.derohimat.bakingapp.data.sources.remote.UnauthorisedInterceptor;
import net.derohimat.bakingapp.di.module.ApplicationModule;
import net.derohimat.bakingapp.features.recipedetail.RecipeDetailPresenter;
import net.derohimat.bakingapp.features.recipedetail.StepsListPresenter;
import net.derohimat.bakingapp.features.recipelist.RecipeListPresenter;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Component;
import io.realm.Realm;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(BaseApplication baseApplication);
    void inject(UnauthorisedInterceptor unauthorisedInterceptor);
    void inject(RecipeListPresenter presenter);
    void inject(RecipeDetailPresenter presenter);
    void inject(StepsListPresenter presenter);

    ApiService apiService();
    EventBus eventBus();
    Realm realm();
    PreferencesHelper prefsHelper();

}