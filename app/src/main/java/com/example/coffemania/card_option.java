package com.example.coffemania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class card_option extends AppCompatActivity {


    EditText username, phone;

    String lp="0";
    int final_price1 = 0 ;



    BottomSheetDialog sheetDialog;
    TextView temp_cost_tv, top_cost_tv, glass_cost_tv;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7;
    RelativeLayout buy_button;
    RelativeLayout update_button;

    Button place_order;
    ImageView increment_quantity, decrement_quantity;

    TextView temp_tv;

    TextView quantity_tv, final_price_tv;
    RelativeLayout hot_glass, ice_glass, cold_glass;

    RelativeLayout small_glass, medium_glass, large_glass;

    int final_summary=1;


    int quantity = 1;
    int price = 249;
    String total_price = "249";

    int confirm_total;

    int small_size = 10;
    String final_small_size = "10";
    String final_quantity;

    String typeofuser = "0";
    String typeofpass = "0";

    String courses = "";

    String abc = "0";
    String def = "0";

    int s = 0;
    int g = 0;
    int add;

//    int c1=0;
//    int c2=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_option);

        increment_quantity = findViewById(R.id.increment_quantity);
        decrement_quantity = findViewById(R.id.decrement_quantity);


        quantity_tv = findViewById(R.id.quantity_tv);


        final_price_tv = findViewById(R.id.final_price_tv);


        hot_glass = findViewById(R.id.hot_glass);
        ice_glass = findViewById(R.id.ice_glass);
        cold_glass = findViewById(R.id.cold_glass);

        small_glass = findViewById(R.id.small_glass);
        medium_glass = findViewById(R.id.medium_glass);
        large_glass = findViewById(R.id.large_glass);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);


        temp_tv = findViewById(R.id.temp_tv);


        temp_cost_tv = findViewById(R.id.temp_cost_tv);
        glass_cost_tv = findViewById(R.id.glass_cost_tv);
        top_cost_tv = findViewById(R.id.top_cost_tv);
        checkBox7 = findViewById(R.id.checkBox7);

        buy_button = findViewById(R.id.buy_button);
        update_button = findViewById(R.id.update_button);

        small_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                small_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.size_glass_focused));
                medium_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.coffeesize_layout));
                large_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.coffeesize_layout));
                typeofuser = "small_glass";

                int glass_price = 0;

                glass_price = glass_price + 10;

                def = String.valueOf(glass_price);


                glass_cost_tv.setText(def);
            }
        });
        medium_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                small_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.coffeesize_layout));
                medium_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.size_glass_focused));
                large_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.coffeesize_layout));
                typeofuser = "medium_glass";


                int glass_price = 0;

                glass_price = glass_price + 20;

                def = String.valueOf(glass_price);


                glass_cost_tv.setText(def);
            }
        });
        large_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                small_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.coffeesize_layout));
                medium_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.coffeesize_layout));
                large_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.size_glass_focused));
                typeofuser = "large_glass";
                int glass_price = 0;

                glass_price = glass_price + 30;

                def = String.valueOf(glass_price);


                glass_cost_tv.setText(def);

            }
        });

        increment_quantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                quantity = quantity + 1;
                String lop = String.valueOf(quantity);
                quantity_tv.setText(lop);






////
////
                final_summary = final_summary + confirm_total ;
                total_price = String.valueOf(final_summary);


                final_price_tv.setText(total_price);


            }
        });
        decrement_quantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(card_option.this, "Decrease", Toast.LENGTH_SHORT).show();

                quantity = quantity - 1;
                String lop = String.valueOf(quantity);
                quantity_tv.setText(lop);

//                confirm_total = confirm_total - confirm_total;
//                total_price = String.valueOf(confirm_total);
//
//
//                final_price_tv.setText(total_price);

            }
        });

        hot_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hot_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglassfocused));
                cold_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglass));
                ice_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglass));
                typeofpass = "hot_glass";

                int temperature = 0;


                temperature = temperature + 50;
                abc = String.valueOf(temperature);
                temp_cost_tv.setText(abc);

            }
        });
        ice_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hot_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglass));
                ice_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglassfocused));
                cold_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglass));
                typeofpass = "ice_glass";


                int temperature = 0;


                temperature = temperature + 70;
                abc = String.valueOf(temperature);
                temp_cost_tv.setText(abc);


            }
        });
        cold_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hot_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglass));
                ice_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglass));
                cold_glass.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.layoutglassfocused));
                typeofpass = "cold_glass";


                int temperature = 0;


                temperature = temperature + 90;
                abc = String.valueOf(temperature);
                temp_cost_tv.setText(abc);


            }
        });

        Intent intent = new Intent(card_option.this, MainActivity2.class);

//        String mcoffee_price1 =getIntent().getStringExtra("mcoffee1");
//        final_price_tv.setText(mcoffee_price1);
//        String mcoffee_price2 = getIntent().getStringExtra("mcoffee2");
//        final_price_tv2.setText(mcoffee_price2);
//        String mcoffee_price3 = getIntent().getStringExtra("mcoffee3");
//        final_price_tv3.setText(mcoffee_price3);
//
//        String mcoffee_price5 = getIntent().getStringExtra("mcoffee5");
//        final_price_tv5.setText(mcoffee_price5);
//
//        String mcoffee_price4 = getIntent().getStringExtra("mcoffee4");
//        final_price_tv4.setText(mcoffee_price4);
//
//        String mcoffee_price6 = getIntent().getStringExtra("mcoffee6");
//        final_price_tv6.setText(mcoffee_price6);



        String mcoffee_price1 =getIntent().getStringExtra("mcoffee1");
        int c1=Integer.parseInt(mcoffee_price1);
        final_price_tv.setText(mcoffee_price1);











        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int totalamount = 0;
                StringBuilder result = new StringBuilder();
                if (checkBox1.isChecked()) {
                    totalamount += 5;
                }
                if (checkBox2.isChecked()) {
                    totalamount += 10;
                }
                if (checkBox3.isChecked()) {
                    totalamount += 15;
                }
                if (checkBox4.isChecked()) {
                    totalamount += 20;
                }
                if (checkBox5.isChecked()) {
                    totalamount += 30;
                }
                if (checkBox6.isChecked()) {
                    totalamount += 40;
                }
                if (checkBox7.isChecked()) {
                    totalamount += 35;
                }
                result.append(totalamount);
                top_cost_tv.setText(result.toString());


                if (typeofuser.equals("0")) {
                    Toast.makeText(card_option.this, "Select Glass Size", Toast.LENGTH_SHORT).show();
                } else if (typeofpass.equals("0")) {
                    Toast.makeText(card_option.this, "Select Coffee Type", Toast.LENGTH_SHORT).show();
                } else {

                    s = Integer.parseInt(abc);
                    g = Integer.parseInt(def);
                    add = s + g + totalamount;







//                    String mcoffee_price2 = getIntent().getStringExtra("mcoffee2");
//                    c2= Integer.parseInt(mcoffee_price2);



                    confirm_total = c1 + add;

                    String k = String.valueOf(confirm_total);
                    final_price_tv.setText(k);


                    intent.putExtra("keyname3",k);






                }


            }
        });

        buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sheetDialog = new BottomSheetDialog(card_option.this, R.style.BottomSheetStyle);
                View sheetview = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottomsheetdialog, null);


                sheetview.findViewById(R.id.place_order).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        EditText username = sheetview.findViewById(R.id.username);
                        EditText phone = sheetview.findViewById(R.id.phone);
                        String u_n = username.getText().toString();
                        String p_tv = phone.getText().toString();


                        if(u_n.equals("abc") && p_tv.equals("1234")) {

                            Toast.makeText(card_option.this, "Worked Login succcele", Toast.LENGTH_SHORT).show();

                            intent.putExtra("keyname1", u_n);
                            intent.putExtra("keyname2", p_tv);
                            startActivity(intent);
                            finish();

                        }

                        else{
                            Toast.makeText(card_option.this, "Fail", Toast.LENGTH_SHORT).show();


                        }

                    }
                });

                sheetDialog.setContentView(sheetview);
                sheetDialog.show();

            }


        });


    }

}