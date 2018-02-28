package com.placenote.map;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.placenote.R;

public class MapFragment extends Fragment {

    private MapViewModel mMapViewModel;
    // move fab

    public MapFragment() {}

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapViewModel.start();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_map, container, false);

        mMapViewModel = MapActivity.obtainViewModel(getActivity());

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setupFab();
        setupSnackbar();

    }

    private void setupFab(){
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fragment_map_fab);
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
