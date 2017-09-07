package org.codeforafrica.citizenreporterandroid.di;

import dagger.Component;
import javax.inject.Singleton;
import org.codeforafrica.citizenreporterandroid.app.CitizenReporterApplication;
import org.codeforafrica.citizenreporterandroid.ui.assignments.AssignmentsFragment;
import org.codeforafrica.citizenreporterandroid.ui.assignments.AssignmentsFragmentPresenter;
import org.codeforafrica.citizenreporterandroid.ui.auth.LoginActivity;
import org.codeforafrica.citizenreporterandroid.ui.settings.SettingsFragment;
import org.codeforafrica.citizenreporterandroid.ui.stories.StoriesFragment;
import org.codeforafrica.citizenreporterandroid.ui.stories.StoriesFragmentPresenter;

/**
 * Created by Ahereza on 9/1/17.
 */
@Singleton @Component(modules = { AppModule.class, PresenterModule.class })
public interface AppComponent {
  void inject(CitizenReporterApplication app);

  void inject(AssignmentsFragment fragment);

  void inject(StoriesFragment fragment);

  void inject(AssignmentsFragmentPresenter presenter);

  void inject(StoriesFragmentPresenter presenter);

  void inject(LoginActivity activity);

  void inject(SettingsFragment fragment);

}
