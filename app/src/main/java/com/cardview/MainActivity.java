package com.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView paracetamol1Card, calciumCard, aceclofenacCard, baclofenCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paracetamol1Card = (CardView) findViewById(R.id.paracetamol);
        calciumCard = (CardView) findViewById(R.id.calcium);
        aceclofenacCard = (CardView) findViewById(R.id.aceclofenac);
        baclofenCard = (CardView) findViewById(R.id.baclofen);


        paracetamol1Card.setOnClickListener(this);
        calciumCard.setOnClickListener(this);
        aceclofenacCard.setOnClickListener(this);
        baclofenCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()){
            case R.id.paracetamol : i = new Intent(this,NapaActivity.class); startActivity(i); break;
            case R.id.calcium : i = new Intent(this,AceActivity.class); startActivity(i); break;
            case R.id.aceclofenac : i = new Intent(this,FexoActivity.class); startActivity(i); break;
            case R.id.baclofen : i = new Intent(this,EvoActivity.class); startActivity(i); break;
            default:break;
        }

    }
}
