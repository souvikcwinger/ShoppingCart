package com.example.pathikritsanyal.skart;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pathikrit Sanyal on 06-01-2018.
 */

public class FirstFragment extends Fragment {



    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.first_layout, container, false);
        Button btnOpen=(Button)myView.findViewById(R.id.button);
        Button btnOpen1=(Button)myView.findViewById(R.id.button2);
        Button btnOpen2=(Button)myView.findViewById(R.id.button3);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), Samsungon.class);
                startActivity(in);
            }

        });
        btnOpen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(),Redmi.class);
                startActivity(in);
            }
        });
        btnOpen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(),Apple.class);
                startActivity(in);
            }
        });
        return myView;
    }
}
