package com.placenote.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by OlehLiskovych on 2/12/18.
 */

@Entity(tableName = "notes")
public final class Note {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private final int id;

    @NonNull

    private final String title;

    @NonNull
    private final boolean isActive;

    @Nullable
    private final String description;

    public Note(@NonNull int id, @NonNull String title,
                @Nullable String description, @NonNull boolean isActive) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isActive = isActive;
    }


    @NonNull
    public int getId() {
        return id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    @NonNull
    public boolean isActive() {
        return isActive;
    }
}
