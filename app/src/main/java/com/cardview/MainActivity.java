package com.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView napaCard, aceCard, fexoCard, evoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        napaCard = (CardView) findViewById(R.id.napa);
        aceCard = (CardView) findViewById(R.id.ace);
        fexoCard = (CardView) findViewById(R.id.fexo);
        evoCard = (CardView) findViewById(R.id.evo);


        napaCard.setOnClickListener(this);
        aceCard.setOnClickListener(this);
        fexoCard.setOnClickListener(this);
        evoCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()){
            case R.id.napa : i = new Intent(this,NapaActivity.class); startActivity(i); break;
            case R.id.ace : i = new Intent(this,AceActivity.class); startActivity(i); break;
            case R.id.fexo : i = new Intent(this,FexoActivity.class); startActivity(i); break;
            case R.id.evo : i = new Intent(this,EvoActivity.class); startActivity(i); break;
            default:break;
        }

    }
}
