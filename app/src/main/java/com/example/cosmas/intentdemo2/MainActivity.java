package com.example.cosmas.intentdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonPressed(View view)
    {
      Button button= (Button) view;
        String buttontxt= button.getText().toString();
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("data",buttontxt);
        startActivity(intent);
    }

}
