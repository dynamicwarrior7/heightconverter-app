package com.coding.heightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1=findViewById(R.id.textView);

        TextView t3=findViewById(R.id.textView2);
        EditText e1=findViewById(R.id.editTextNumber);

        Button b1=findViewById(R.id.button);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String centi=e1.getText().toString();
                     float cent= Float.parseFloat(centi);
                     float foot= (float) (0.032*cent);
                     t3.setText(""+foot);
                        TextView text2=findViewById(R.id.text3);
                        text2.setText("foots");

                    }
                });

    }
}