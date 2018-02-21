package com.placenote.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import com.placenote.util.TransformationUtils;

/**
 * Created by OlehLiskovych on 2/12/18.
 */

@Database(entities = {Note.class}, version = 1)
@TypeConverters(TransformationUtils.class)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase sInstance;

    public static final String DATABASE_NAME = "place-note-db";

    public abstract NoteDAO noteDAO();

    public static AppDatabase getInstance(final Context context) {
        synchronized (AppDatabase.class) {
            if (sInstance == null) {
                sInstance = Room.databaseBuilder(context.getApplicationContext(),
                        AppDatabase.class, DATABASE_NAME)
                        .build();
            }
            return sInstance;
        }
    }

}
