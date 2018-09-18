package com.example.sammitafoya.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // ref all the views
    private TextView quantity;
    private TextView summary;
    private CheckBox hasCream;
    private CheckBox hasChoco;
    private Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.main_layout);

        coffee = new Coffee();
        quantity = (TextView) findViewById(R.id.quantityView);
        summary = (TextView) findViewById(R.id.summaryView);
        hasCream = (CheckBox) findViewById(R.id.creamBox);
        hasChoco = (CheckBox) findViewById(R.id.chocoBox);
    }

    public void setChoco( View view){
        coffee.setChoco(hasChoco.isChecked());
    }

    public void setCream( View view){
        coffee.setCream(hasCream.isChecked());
    }

    public void increment(View view) {
        coffee.incrementQuantity();
        quantity.setText(coffee.getQuanityString());
    }

    public void decrement(View view) {
        coffee.decrementQuantity();
        quantity.setText(coffee.getQuanityString());
    }

    public void computeOrder (View view) {
        summary.setText(coffee.getOrderSummary());
    }

}
