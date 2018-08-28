package com.example.pathikritsanyal.skart;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by Pathikrit Sanyal on 02-01-2018.
 */

public class Contact extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_contact,
                container, false);


        Button button=(Button)view.findViewById(R.id.button6);
        final RatingBar ratingBar=(RatingBar) view.findViewById(R.id.ratingBar) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Intent.ACTION_DIAL);
                String no="8902243871";
                in.setData(Uri.parse("tel:"+no));
                startActivity(in);
            }
        });

        return view;
    
    }

}
