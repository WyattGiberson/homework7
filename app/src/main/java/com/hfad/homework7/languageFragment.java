package com.hfad.homework7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class languageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_language, container, false);
        String message = languageFragmentArgs.fromBundle(requireArguments()).getMessage();
        TextView languageType = view.findViewById(R.id.helloText);

        if(message.equals("English")){
            languageType.setText("hello");
        }
        else if(message.equals("French")){
            languageType.setText("bonjour");
        }
        else{
            languageType.setText("hola");
        }

        return view;
    }
}