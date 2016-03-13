package com.example.cosmas.intentdemo2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by cosmas on 3/11/2016.
 */
public class SecondActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        String intentData =getIntent().getStringExtra("data");
        TextView secondview= (TextView)findViewById(R.id.textview);
        secondview.setText(intentData);

    }


}
