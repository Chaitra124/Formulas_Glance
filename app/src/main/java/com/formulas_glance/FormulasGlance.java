package com.formulas_glance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.view.View.OnClickListener;

/**
 * Created by Chaitra Vani Jujaray on 18-10-2016.
 */
public class FormulasGlance extends AppCompatActivity implements OnClickListener {
    Button btnArea;
    Button btnCalculus;
    Button btAlgebra;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_formulas_glance);
        btnArea = (Button) findViewById(R.id.btnArea);
        btnCalculus = (Button) findViewById(R.id.btnCalculus);

        btnArea.setOnClickListener(this);
        btnCalculus.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnArea:
                Intent intent = new Intent(this, AreaActivity.class);
                startActivity(intent);
                break;

            case R.id.btnCalculus:
                Intent intent1 = new Intent(this, CalculusActivity.class);
                startActivity(intent1);
                break;

        }
    }
}
