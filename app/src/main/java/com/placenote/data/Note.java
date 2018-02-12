package com.placenote.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by OlehLiskovych on 2/12/18.
 */

@Entity(tableName = "tasks")
public final class Note {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private final String id;

    @NonNull
    private final String title;

    @Nullable
    private final String description;

    @NonNull
    private final boolean isActive;
}
