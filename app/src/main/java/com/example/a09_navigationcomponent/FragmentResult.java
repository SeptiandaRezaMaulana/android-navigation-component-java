package com.example.a09_navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentResult extends Fragment {
    private TextView txtNama;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        txtNama = view.findViewById(R.id.txtNama);
        assert getArguments() != null;
        txtNama.setText(getArguments().getString("nama"));
        return view;
    }
}