package com.placenote.data;

import android.arch.lifecycle.MutableLiveData;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;
import android.content.Context;

import com.placenote.util.TransformationUtils;

/**
 * Created by OlehLiskovych on 2/12/18.
 */

@Database(entities = {Note.class}, version = 1)
@TypeConverter(TransformationUtils.class)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase sInstance;

    public static final String DATABASE_NAME = "place-note-db";

    public abstract NoteDAO noteDAO();

    private final MutableLiveData<Boolean> isDatabaseCreated = new MutableLiveData<>();

    public static AppDatabase getsInstance(final Context context, final App)

}
