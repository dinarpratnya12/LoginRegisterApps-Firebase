package com.dinar.loginregisterapps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    View view;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);
        textView = view.findViewById(R.id.judul);
        textView.setText("LOREAPS");

        try {
            String tangkap = getArguments().getString("email");
            textView.setText("Hai, "+tangkap);
        } catch (Exception e){

        }
        return view;
    }
}
