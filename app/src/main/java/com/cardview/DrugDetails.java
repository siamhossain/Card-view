package com.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrugDetails extends AppCompatActivity {
    TextView tvDrugDetails;
    String details = "<p><b>Ingredients:</b> Glutathione, Fulvic Acid, Generic Drug</p>\n" +
            "    <p><b>Instruction:</b> Your medication should be safe and effective if you take it according to your doctor's instructions. However, if you don't, your drug could do more harm than good.</p>\n" +
            "    <p><b>Dose and usage:</b> For minor aches and pains, take 2 tablets of Regular Strength Tylenol (dose 325 mg each tablet) every 4 to 6 hours as needed (q4 to q6 PRN).</p>\n" +
            "    <p><b>Side effects:</b> The most common set of side effects for drugs that work inside your body involves the gastrointestinal system.</p>\n" +
            "    <p><b>Side effects with other medicines:</b> To find more about a drug's side effects, look on the label of over-the-counter (OTC) products or on package inserts or printed materials that you get with prescription drugs.</p>\n" +
            "    <p><b>Usage during pregnancy:</b> It's possible that you may not have a serious or long-lasting problem after using drugs. But the same is not always true for a fetus. Drug-using mothers often give birth to drug babies. These children have a host of developmental problems.</p>\n" +
            "    <p><b>Supply:</b> Tablets - 20*10 pieces</p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_details);
        tvDrugDetails = (TextView) findViewById(R.id.tv_drug_details);
        tvDrugDetails.setText(Html.fromHtml(details));
    }
}
