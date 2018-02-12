package com.placenote.map;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.placenote.R;
import com.placenote.ViewModelFactory;
import com.placenote.util.ActivityUtils;

public class MapActivity extends AppCompatActivity implements MapNavigator{

    private MapViewModel mMapViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupToolbar();
        setupViewFragment();

        mMapViewModel = obtainViewModel(this);

    }

    public static MapViewModel obtainViewModel(FragmentActivity activity) {
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication());

        return ViewModelProviders.of(activity, factory).get(MapViewModel.class);
    }

    private void setupViewFragment() {
        MapFragment mapFragment = (MapFragment) getSupportFragmentManager().findFragmentById(R.id.content_fragment);
        if (mapFragment == null) {
            mapFragment = MapFragment.newInstance();
            ActivityUtils.replaceFragmentInActivity(getSupportFragmentManager(), mapFragment, R.id.content_fragment);
        }
    }

    private void setupToolbar() {
        setContentView(R.layout.activity_map);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void openNoteDetails(String taskId) {
        Intent intent = new Intent(this, );
    }

    @Override
    public void openCreateNote() {

    }
}
