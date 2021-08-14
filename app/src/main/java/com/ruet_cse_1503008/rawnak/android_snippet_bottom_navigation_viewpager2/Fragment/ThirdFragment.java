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
public class ThirdFragment extends Fragment {

    EditText editTextThirdFragment;

    Button buttonThirdFragment;

    TextView textViewThirdFragment;


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_third, container, false);

        editTextThirdFragment = root.findViewById(R.id.editTextThirdFragment);
        buttonThirdFragment = root.findViewById(R.id.buttonThirdFragment);
        textViewThirdFragment = root.findViewById(R.id.textViewThirdFragment);

        buttonThirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(editTextThirdFragment.getText().toString().matches(""))){
                    textViewThirdFragment.setText(editTextThirdFragment.getText().toString());
                }
            }
        });

        return root;
    }

}
