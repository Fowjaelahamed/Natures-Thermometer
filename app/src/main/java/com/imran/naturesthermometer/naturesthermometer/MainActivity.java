package com.imran.naturesthermometer.naturesthermometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etext;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etext=findViewById(R.id.editText);
        btn=findViewById(R.id.button);
        tv=findViewById(R.id.textView);
        tv.setVisibility(View.GONE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n=Integer.parseInt(etext.getText().toString().trim());
                double rs=(n/3)+4;
                tv.setText("The outside Temperature is "+rs+" degrees Celsius");
                tv.setVisibility(View.VISIBLE);
            }
        });
    }
}
