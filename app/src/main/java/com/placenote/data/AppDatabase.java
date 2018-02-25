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

@Database(entities = {Note.class}, version = 1, exportSchema = false)
@TypeConverters(TransformationUtils.class)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase sInstance;

    private static final String DATABASE_NAME = "place-note-db";

    public abstract NoteDAO noteDAO();

    public static AppDatabase getInstance(final Context context) {
        synchronized (AppDatabase.class) {
            if (sInstance == null) {
                sInstance = create(context, false);
            }
            return sInstance;
        }
    }

    private static AppDatabase create(Context context, boolean memoryOnly) {
        RoomDatabase.Builder<AppDatabase> builder;

        if (memoryOnly) {
            builder = Room.inMemoryDatabaseBuilder(context.getApplicationContext(), AppDatabase.class);
        } else {
            builder = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, DATABASE_NAME);
        }
        return builder.build();
    }

}
