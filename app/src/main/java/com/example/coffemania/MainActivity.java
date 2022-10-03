package com.example.coffemania;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CardView card1,card2,card3,card4,card5,card6;
    Button button;

    String ty="0";
    String c1="200";
    String c2="300";
    String c3="400";
    String c4="500";
    String c5="600";
    String c6="700";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
//        card3=findViewById(R.id.card3);
//        card5=findViewById(R.id.card5);
//        card4=findViewById(R.id.card4);
//        card6=findViewById(R.id.card6);




        card1.setOnClickListener(new Click());
        card2.setOnClickListener(new Click());
//        card3.setOnClickListener(new Click());
//        card5.setOnClickListener(new Click());
//        card4.setOnClickListener(new Click());
//        card6.setOnClickListener(new Click());



//        card1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ty="coffee1";
//                if (ty.equals("coffee1")){
//
//                    intent.putExtra("mcoffee1", c1);
//                    startActivity(intent);
//                }
//
//
//
//            }
//        });
//        card2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ty="coffee2";
//                if (ty.equals("coffee2")){
//
//                    intent.putExtra("mcoffee2", c2);
//                    startActivity(intent);
//                }
//
//
//
//            }
//        });


    }

    public class Click implements View.OnClickListener{


        @Override
        public void onClick(View view) {



            switch (view.getId()){
                case R.id.card1:
                    Intent intent = new Intent(MainActivity.this,card_option.class);

                    Toast.makeText(MainActivity.this, "Card 1 clicked", Toast.LENGTH_SHORT).show();
                    intent.putExtra("mcoffee1", c1);
                    startActivity(intent);
                    break;

                case R.id.card2:
                    Intent intent2 = new Intent(MainActivity.this,Coffee_Activity02.class);

                    Toast.makeText(MainActivity.this, "Card 2 clicked", Toast.LENGTH_SHORT).show();
                    intent2.putExtra("mcoffee2", c2);
                    startActivity(intent2);
                    break;

//                case R.id.card3:
//                    Toast.makeText(MainActivity.this, "Card 3 clicked", Toast.LENGTH_SHORT).show();
//                    intent.putExtra("mcoffee3", c3);
//                    startActivity(intent);
//                    break;
//
//                case R.id.card4:
//                    Toast.makeText(MainActivity.this, "Card 4 clicked", Toast.LENGTH_SHORT).show();
//                    intent.putExtra("mcoffee4", c4);
//                    startActivity(intent);
//                    break;
//
//
//                case R.id.card5:
//                    Toast.makeText(MainActivity.this, "Card 5 clicked", Toast.LENGTH_SHORT).show();
//                    intent.putExtra("mcoffee5", c5);
//                    startActivity(intent);
//                    break;
//
//                case R.id.card6:
//                    Toast.makeText(MainActivity.this, "Card 6 clicked", Toast.LENGTH_SHORT).show();
//                    intent.putExtra("mcoffee6", c6);
//                    startActivity(intent);
//                    break;


                default:

            }
        }
    }










}