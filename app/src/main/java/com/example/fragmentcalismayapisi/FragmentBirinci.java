package com.example.fragmentcalismayapisi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentBirinci extends Fragment {
    private Button buttonTikla;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_birinci_layout,container,false);// rootView ile tasarimdaki nesnelere erisebiliriz
        buttonTikla=rootView.findViewById(R.id.buttonTikla);
        buttonTikla.setOnClickListener(view -> {
            Toast.makeText(getActivity(),"Hellooooo",Toast.LENGTH_SHORT).show();

        });
        return rootView;
    }
}
