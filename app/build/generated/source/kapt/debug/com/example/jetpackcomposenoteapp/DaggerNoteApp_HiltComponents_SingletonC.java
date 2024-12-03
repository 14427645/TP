// Generated by Dagger (https://dagger.dev).
package com.example.jetpackcomposenoteapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.jetpackcomposenoteapp.data.data_source.NoteDatabase;
import com.example.jetpackcomposenoteapp.di.AppModule;
import com.example.jetpackcomposenoteapp.di.AppModule_ProvideNoteDatabaseFactory;
import com.example.jetpackcomposenoteapp.di.AppModule_ProvideNoteRepositoryFactory;
import com.example.jetpackcomposenoteapp.di.AppModule_ProvideNoteUseCasesFactory;
import com.example.jetpackcomposenoteapp.domain.repository.NoteRepository;
import com.example.jetpackcomposenoteapp.domain.use_case.NotesUseCases;
import com.example.jetpackcomposenoteapp.presentation.MainActivity;
import com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel;
import com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.jetpackcomposenoteapp.presentation.notes.NotesViewModel;
import com.example.jetpackcomposenoteapp.presentation.notes.NotesViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerNoteApp_HiltComponents_SingletonC extends NoteApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerNoteApp_HiltComponents_SingletonC singletonC = this;

  private volatile Object noteDatabase = new MemoizedSentinel();

  private volatile Object noteRepository = new MemoizedSentinel();

  private volatile Object notesUseCases = new MemoizedSentinel();

  private DaggerNoteApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;

  }

  public static Builder builder() {
    return new Builder();
  }

  private NoteDatabase noteDatabase() {
    Object local = noteDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = noteDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideNoteDatabaseFactory.provideNoteDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          noteDatabase = DoubleCheck.reentrantCheck(noteDatabase, local);
        }
      }
    }
    return (NoteDatabase) local;
  }

  private NoteRepository noteRepository() {
    Object local = noteRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = noteRepository;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideNoteRepositoryFactory.provideNoteRepository(noteDatabase());
          noteRepository = DoubleCheck.reentrantCheck(noteRepository, local);
        }
      }
    }
    return (NoteRepository) local;
  }

  private NotesUseCases notesUseCases() {
    Object local = notesUseCases;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = notesUseCases;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideNoteUseCasesFactory.provideNoteUseCases(noteRepository());
          notesUseCases = DoubleCheck.reentrantCheck(notesUseCases, local);
        }
      }
    }
    return (NotesUseCases) local;
  }

  @Override
  public void injectNoteApp(NoteApp noteApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public NoteApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerNoteApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements NoteApp_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerNoteApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public NoteApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityRetainedCImpl extends NoteApp_HiltComponents.ActivityRetainedC {
    private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl(DaggerNoteApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;


    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private static final class ActivityCBuilder implements NoteApp_HiltComponents.ActivityC.Builder {
      private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private Activity activity;

      private ActivityCBuilder(DaggerNoteApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
      }

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public NoteApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
      }
    }

    private static final class ActivityCImpl extends NoteApp_HiltComponents.ActivityC {
      private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl = this;

      private ActivityCImpl(DaggerNoteApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;


      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
      }

      @Override
      public Set<String> getViewModelKeys() {
        return SetBuilder.<String>newSetBuilder(2).add(AddEditNoteViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(NotesViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
      }

      private static final class FragmentCBuilder implements NoteApp_HiltComponents.FragmentC.Builder {
        private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private Fragment fragment;

        private FragmentCBuilder(DaggerNoteApp_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;
        }

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public NoteApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCI(singletonC, activityRetainedCImpl, activityCImpl, fragment);
        }
      }

      private static final class FragmentCI extends NoteApp_HiltComponents.FragmentC {
        private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private final FragmentCI fragmentCI = this;

        private FragmentCI(DaggerNoteApp_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
            Fragment fragmentParam) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;


        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCI);
        }

        private static final class ViewWithFragmentCBuilder implements NoteApp_HiltComponents.ViewWithFragmentC.Builder {
          private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

          private final ActivityRetainedCImpl activityRetainedCImpl;

          private final ActivityCImpl activityCImpl;

          private final FragmentCI fragmentCI;

          private View view;

          private ViewWithFragmentCBuilder(DaggerNoteApp_HiltComponents_SingletonC singletonC,
              ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
              FragmentCI fragmentCI) {
            this.singletonC = singletonC;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCI = fragmentCI;
          }

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public NoteApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCI(singletonC, activityRetainedCImpl, activityCImpl, fragmentCI, view);
          }
        }

        private static final class ViewWithFragmentCI extends NoteApp_HiltComponents.ViewWithFragmentC {
          private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

          private final ActivityRetainedCImpl activityRetainedCImpl;

          private final ActivityCImpl activityCImpl;

          private final FragmentCI fragmentCI;

          private final ViewWithFragmentCI viewWithFragmentCI = this;

          private ViewWithFragmentCI(DaggerNoteApp_HiltComponents_SingletonC singletonC,
              ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
              FragmentCI fragmentCI, View viewParam) {
            this.singletonC = singletonC;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCI = fragmentCI;


          }
        }
      }

      private static final class ViewCBuilder implements NoteApp_HiltComponents.ViewC.Builder {
        private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private View view;

        private ViewCBuilder(DaggerNoteApp_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;
        }

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public NoteApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCI(singletonC, activityRetainedCImpl, activityCImpl, view);
        }
      }

      private static final class ViewCI extends NoteApp_HiltComponents.ViewC {
        private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private final ViewCI viewCI = this;

        private ViewCI(DaggerNoteApp_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
            View viewParam) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;


        }
      }
    }

    private static final class ViewModelCBuilder implements NoteApp_HiltComponents.ViewModelC.Builder {
      private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private SavedStateHandle savedStateHandle;

      private ViewModelCBuilder(DaggerNoteApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
      }

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public NoteApp_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
      }
    }

    private static final class ViewModelCImpl extends NoteApp_HiltComponents.ViewModelC {
      private final SavedStateHandle savedStateHandle;

      private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl = this;

      private volatile Provider<AddEditNoteViewModel> addEditNoteViewModelProvider;

      private volatile Provider<NotesViewModel> notesViewModelProvider;

      private ViewModelCImpl(DaggerNoteApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.savedStateHandle = savedStateHandleParam;

      }

      private AddEditNoteViewModel addEditNoteViewModel() {
        return new AddEditNoteViewModel(singletonC.notesUseCases(), savedStateHandle);
      }

      private Provider<AddEditNoteViewModel> addEditNoteViewModelProvider() {
        Object local = addEditNoteViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
          addEditNoteViewModelProvider = (Provider<AddEditNoteViewModel>) local;
        }
        return (Provider<AddEditNoteViewModel>) local;
      }

      private NotesViewModel notesViewModel() {
        return new NotesViewModel(singletonC.notesUseCases());
      }

      private Provider<NotesViewModel> notesViewModelProvider() {
        Object local = notesViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
          notesViewModelProvider = (Provider<NotesViewModel>) local;
        }
        return (Provider<NotesViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(2).put("com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel", (Provider) addEditNoteViewModelProvider()).put("com.example.jetpackcomposenoteapp.presentation.notes.NotesViewModel", (Provider) notesViewModelProvider()).build();
      }

      private static final class SwitchingProvider<T> implements Provider<T> {
        private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ViewModelCImpl viewModelCImpl;

        private final int id;

        SwitchingProvider(DaggerNoteApp_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.viewModelCImpl = viewModelCImpl;
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel 
            return (T) viewModelCImpl.addEditNoteViewModel();

            case 1: // com.example.jetpackcomposenoteapp.presentation.notes.NotesViewModel 
            return (T) viewModelCImpl.notesViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private static final class ServiceCBuilder implements NoteApp_HiltComponents.ServiceC.Builder {
    private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerNoteApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public NoteApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ServiceCImpl extends NoteApp_HiltComponents.ServiceC {
    private final DaggerNoteApp_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerNoteApp_HiltComponents_SingletonC singletonC, Service serviceParam) {
      this.singletonC = singletonC;


    }
  }
}
