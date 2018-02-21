package com.placenote.map;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Context;

import com.placenote.data.NotesRepository;

/**
 * Created by OlehLiskovych on 2/12/18.
 */

public class MapViewModel extends AndroidViewModel {

    private final Context context; // Must be application context

    private final NotesRepository notesRepository;

    public MapViewModel(Application application, NotesRepository repository) {
        super(application);
        context = application.getApplicationContext();
        notesRepository = repository;

        // Set initial state
    }

    public void start() {
        loadNotes();
    }

    private void loadNotes() {

    }



}
