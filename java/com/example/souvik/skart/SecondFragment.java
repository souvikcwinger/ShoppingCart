package com.example.pathikritsanyal.skart;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Pathikrit Sanyal on 06-01-2018.
 */

public class SecondFragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.second_layout, container, false);
        Button btnOpen=(Button)myView.findViewById(R.id.button);
        Button btnOpen1=(Button)myView.findViewById(R.id.button4);
        Button btnOpen2=(Button)myView.findViewById(R.id.button3);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), Samsungtv.class);
                startActivity(in);
            }

        });
        btnOpen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(),Sonytv.class);
                startActivity(in);
            }
        });
        btnOpen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(),Lgtv.class);
                startActivity(in);
            }
        });
        return myView;
    }
}