package com.placenote;

import android.annotation.SuppressLint;
import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.placenote.data.NotesRepository;
import com.placenote.map.MapViewModel;

/**
 * Created by OlehLiskovych on 2/11/18.
 */

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    @SuppressLint("StaticFieldLeak")
    private static volatile ViewModelFactory INSTANCE;
    private final Application mApplication;
    private final NotesRepository mNotesRepository;

    public static ViewModelFactory getInstance(Application application) {
        if (INSTANCE == null) {
            // TODO: replace NotesRepository constructor call to newInstance call
            INSTANCE = new ViewModelFactory(application, new NotesRepository());
        }
        return INSTANCE;
    }

    public static void destroyInstance() { INSTANCE = null; }

    private ViewModelFactory(Application application, NotesRepository repository) {
        mApplication = application;
        mNotesRepository = repository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MapViewModel.class)) {
            return (T) new MapViewModel(mApplication, mNotesRepository);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }

}
