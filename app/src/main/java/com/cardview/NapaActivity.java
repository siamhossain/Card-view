package com.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class NapaActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView napaDetais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_napa);
        napaDetais = (CardView) findViewById(R.id.napa_details);

        napaDetais.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent j;

        switch(v.getId()){
            case R.id.napa_details : j = new Intent(this,DrugDetails.class); startActivity(j); break;
            default:break;
        }
    }
}
