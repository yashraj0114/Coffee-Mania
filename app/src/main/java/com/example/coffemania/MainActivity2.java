package com.example.coffemania;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView n_tv,p_tv,tt;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        n_tv=findViewById(R.id.n_tv);
        p_tv=findViewById(R.id.p_tv);
        tt=findViewById(R.id.tt);

        String mname =getIntent().getStringExtra("keyname1");
        String mphone =getIntent().getStringExtra("keyname2");
        String mprice =getIntent().getStringExtra("keyname3");

        n_tv.setText(mname);
        p_tv.setText(mphone);
        tt.setText(mprice);

    }


    @Override
    public void onBackPressed() {
        androidx.appcompat.app.AlertDialog.Builder a=new androidx.appcompat.app.AlertDialog.Builder(MainActivity2.this);
        a.setMessage("Are You Sure")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity2.super.onBackPressed();
                    }
                })
                .setNegativeButton("No",null);
        AlertDialog c=a.create();
        c.show();


    }


}