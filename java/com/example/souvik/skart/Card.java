package com.example.pathikritsanyal.skart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Pathikrit Sanyal on 13-01-2018.
 */

public class Card extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        Button b=(Button)findViewById(R.id.button3);
        final EditText e1=(EditText)findViewById(R.id.editText5);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        final EditText e3=(EditText)findViewById(R.id.editText3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().length()==0)

                {
                    e1.requestFocus();
                    e1.setError("FIELD CANNOT BE EMPTY");


                }
                else if(e2.getText().toString().length()==0)

                {
                    e2.requestFocus();
                    e2.setError("FIELD CANNOT BE EMPTY");

                }

                else if(e3.getText().toString().length()==0)

                {
                    e3.requestFocus();
                    e3.setError("FIELD CANNOT BE EMPTY");

                }
                else {
                    Toast.makeText(Card.this, "Your payment is successful and Thank you for shopping with us", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(Card.this, MainActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
            }
        });

    }
}


