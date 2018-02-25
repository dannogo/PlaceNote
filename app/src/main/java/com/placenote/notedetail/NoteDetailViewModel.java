package com.placenote.notedetail;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;

import com.placenote.data.NotesRepository;

/**
 * Created by OlehLiskovych on 2/12/18.
 */

public class NoteDetailViewModel extends AndroidViewModel {

    private final NotesRepository mNotesRepository;

    public NoteDetailViewModel(Application application, NotesRepository repository) {
        super(application);
        mNotesRepository = repository;
    }

//    public void deleteNote() {
//        if ()
//    }

}
