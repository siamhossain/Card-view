package com.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

public class FragmentCategory extends Fragment implements View.OnClickListener {

    View v2;
    private CardView paracetamol1Card, calciumCard, aceclofenacCard, baclofenCard;
    private TableLayout mainTableLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v2 = inflater.inflate(R.layout.fragment_category_layout, container, false);

        paracetamol1Card = (CardView) v2.findViewById(R.id.paracetamol);
        calciumCard = (CardView) v2.findViewById(R.id.calcium);
        aceclofenacCard = (CardView) v2.findViewById(R.id.aceclofenac);
        baclofenCard = (CardView) v2.findViewById(R.id.baclofen);
        mainTableLayout = (TableLayout) v2.findViewById(R.id.category_table_layout);


        paracetamol1Card.setOnClickListener(FragmentCategory.this);
        calciumCard.setOnClickListener(this);
        aceclofenacCard.setOnClickListener(this);
        baclofenCard.setOnClickListener(this);
        mainTableLayout.setOnClickListener(this);

        return v2;
    }

    @Override
    public void onClick(View v) {
        Intent i;
        startActivity(new Intent(getContext(), ItemsActivity.class));
        return;

/*
        switch(v.getId()){
            case R.id.paracetamol : i = new Intent(getContext(), ItemsActivity.class); startActivity(i); break;
            default:break;
        }
*/

    }
}