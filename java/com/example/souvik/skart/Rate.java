package com.example.pathikritsanyal.skart;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pathikrit Sanyal on 02-01-2018.
 */

public class Rate extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_rate,
                container, false);

        Button button=(Button)view.findViewById(R.id.button5);
        final RatingBar ratingBar=(RatingBar) view.findViewById(R.id.ratingBar) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating =String.valueOf(ratingBar.getRating());
               Toast.makeText(getActivity(),rating,Toast.LENGTH_LONG).show();
            }
        });

        return view;
    
    }


}
