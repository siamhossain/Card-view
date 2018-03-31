package com.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTwo extends Fragment implements View.OnClickListener {

    View v2;
    private CardView paracetamol1Card, calciumCard, aceclofenacCard, baclofenCard;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v2 = inflater.inflate(R.layout.fragment_two_layout, container, false);

        paracetamol1Card = (CardView) v2.findViewById(R.id.paracetamol);
        calciumCard = (CardView) v2.findViewById(R.id.calcium);
        aceclofenacCard = (CardView) v2.findViewById(R.id.aceclofenac);
        baclofenCard = (CardView) v2.findViewById(R.id.baclofen);


        paracetamol1Card.setOnClickListener(FragmentTwo.this);
        calciumCard.setOnClickListener(this);
        aceclofenacCard.setOnClickListener(this);
        baclofenCard.setOnClickListener(this);

        return v2;
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()){
            case R.id.paracetamol : i = new Intent(getContext(), NapaActivity.class); startActivity(i); break;
            case R.id.calcium : i = new Intent(getContext(), AceActivity.class); startActivity(i); break;
            case R.id.aceclofenac : i = new Intent(getContext(), FexoActivity.class); startActivity(i); break;
            case R.id.baclofen : i = new Intent(getContext(), EvoActivity.class); startActivity(i); break;
            default:break;
        }

    }
}