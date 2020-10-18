package com.example.a09_navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentMain extends Fragment {
    private Button btn_navigate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        btn_navigate = view.findViewById(R.id.navigate_button);
        btn_navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nama", "Septianda Reza Maulana");
                Navigation.findNavController(view).navigate(R.id.action_fragmentMain_to_fragmentResult, bundle);
            }
        });
        return view;
    }
}