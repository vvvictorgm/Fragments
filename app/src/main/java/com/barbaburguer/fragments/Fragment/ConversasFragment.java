package com.barbaburguer.fragments.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.barbaburguer.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConversasFragment extends Fragment {
    private TextView textContato;


    public ConversasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conversas, container, false);
        textContato = view.findViewById(R.id.textContato);

        return view;

    }

}
