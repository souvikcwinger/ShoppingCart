package com.example.pathikritsanyal.skart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pathikritsanyal.skart.MainActivity;
import com.example.pathikritsanyal.skart.R;

/**
 * Created by Pathikrit Sanyal on 04-01-2018.
 */

public class Samsungon extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsungon);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Samsungon.this,login.class);
                startActivity(intent);
            }
        });
    }
}
