package a816.android.soldesk.mbc_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Mbc_1Activity extends AppCompatActivity {

    Button  button1,button2,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbc_1);

        button1  = (Button) findViewById(R.id.button_1);
        button2  = (Button) findViewById(R.id.button_2);
        button3  = (Button) findViewById(R.id.button_3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("MyButton","button1^^^^");



            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("MyButton","button2~~");
            }
        });


        button3  = (Button) findViewById(R.id.button_3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyButton","btn3333!!!!!!");
            }
        });


    }
}
