package com.ruet_cse_1503008.rawnak.android_snippet_bottom_navigation_viewpager2.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.ruet_cse_1503008.rawnak.android_snippet_bottom_navigation_viewpager2.R;

//import android.support.v4.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    EditText editTextSecondFragment;

    Button buttonSecondFragment;

    TextView textViewSecondFragment;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_second, container, false);

        editTextSecondFragment = root.findViewById(R.id.editTextSecondFragment);
        buttonSecondFragment = root.findViewById(R.id.buttonSecondFragment);
        textViewSecondFragment = root.findViewById(R.id.textViewSecondFragment);

        buttonSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(editTextSecondFragment.getText().toString().matches(""))){
                    textViewSecondFragment.setText(editTextSecondFragment.getText().toString());
                }
            }
        });
        
        return root;
    }

}
