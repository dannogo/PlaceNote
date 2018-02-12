package com.placenote.map;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.placenote.R;
import com.placenote.databinding.FragmentMapBinding;

/**
 * Created by OlehLiskovych on 2/12/18.
 */

public class MapFragment extends Fragment {

    private MapViewModel mMapViewModel;
    // move fab
    private FragmentMapBinding mFragmentMapBinding;

    public MapFragment() {}

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapViewModel.start();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setupFab();
        setupSnackbar();

    }

    private void setupFab(){
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void setupSnackbar() {

    }
}
