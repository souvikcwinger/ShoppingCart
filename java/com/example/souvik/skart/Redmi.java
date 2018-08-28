package com.example.pathikritsanyal.skart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pathikrit Sanyal on 04-01-2018.
 */

public class Redmi extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redmi);
       /*TextView textView=(TextView)findViewById(R.id.textView);
        TextView textView1=(TextView)findViewById(R.id.textView2);
        TextView textView2=(TextView)findViewById(R.id.textView3);
       ImageView imageView3=(ImageView)findViewById(R.id.imageView4);*/
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Redmi.this,login.class);
                startActivity(intent);
            }
        });

    }
}
