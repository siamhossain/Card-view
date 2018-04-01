package com.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;

public class FragmentNewItems extends Fragment {

    View v;
    private TableLayout mainTableLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_new_items_layout, container, false);
        mainTableLayout = (TableLayout) v.findViewById(R.id.category_table_layout);
        mainTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DrugDetails.class));
            }
        });
        return v;
    }
}
