package com.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class ItemsActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView paracetamol1Card, calciumCard, aceclofenacCard, baclofenCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        paracetamol1Card = (CardView) findViewById(R.id.paracetamol);
        calciumCard = (CardView) findViewById(R.id.calcium);
        aceclofenacCard = (CardView) findViewById(R.id.aceclofenac);
        baclofenCard = (CardView) findViewById(R.id.baclofen);


        paracetamol1Card.setOnClickListener(ItemsActivity.this);
        calciumCard.setOnClickListener(this);
        aceclofenacCard.setOnClickListener(this);
        baclofenCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent j = new Intent(this, DrugDetails.class);
        startActivity(j);
    }
}
