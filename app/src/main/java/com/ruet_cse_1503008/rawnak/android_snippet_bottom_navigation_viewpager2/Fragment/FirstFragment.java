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
public class FirstFragment extends Fragment {

    EditText editTextFirstFragment;

    Button buttonFirstFragment;

    TextView textViewFirstFragment;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_first, container, false);

        editTextFirstFragment = root.findViewById(R.id.editTextFirstFragment);
        buttonFirstFragment = root.findViewById(R.id.buttonFirstFragment);
        textViewFirstFragment = root.findViewById(R.id.textViewFirstFragment);

        buttonFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(editTextFirstFragment.getText().toString().matches(""))){
                    textViewFirstFragment.setText(editTextFirstFragment.getText().toString());
                }
            }
        });

        return root;
    }

}
