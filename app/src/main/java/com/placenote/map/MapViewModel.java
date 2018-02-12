package com.placenote.map;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Context;

import com.placenote.data.NotesRepository;

/**
 * Created by OlehLiskovych on 2/12/18.
 */

public class MapViewModel extends AndroidViewModel {

    private final Context mContext; // Must be application context

    private final NotesRepository mNotesRepository;

    public MapViewModel(Application application, NotesRepository repository) {
        super(application);
        mContext = application.getApplicationContext();
        mNotesRepository = repository;

        // Set initial state
    }

    public void start() {
        loadTasks();
    }

    private void loadTasks() {

    }



}
