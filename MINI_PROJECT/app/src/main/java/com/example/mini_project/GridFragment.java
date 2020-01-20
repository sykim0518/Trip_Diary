package com.example.mini_project;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.List;

public class GridFragment extends Fragment {
    DBHelper dbHelper;
    List list;
    ImageAdapter adapter;
    GridView gridview;

    public static GridFragment newInstance() {

        return new GridFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid, null);

        list=MainActivity.dbHelper.getAllListViewItemData();
        gridview = (GridView) view.findViewById(R.id.gridView);
        adapter = new ImageAdapter(list, getContext());
        gridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }
}
