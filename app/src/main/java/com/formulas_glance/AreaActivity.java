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
public class AreaActivity extends AppCompatActivity implements OnClickListener {
    Button btTwoDimensionObjects;
    Button btThreeDimensionObjects;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.areaactivity);
        btTwoDimensionObjects = (Button) findViewById(R.id.btnTwoDimensionObjects);
        btThreeDimensionObjects = (Button) findViewById(R.id.btnThreeDimensionObjects);
        btTwoDimensionObjects.setOnClickListener(this);
        btThreeDimensionObjects.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnTwoDimensionObjects:
                Intent intent = new Intent(this, TwoDimensionActivity.class);
                startActivity(intent);
                break;

            case R.id.btnThreeDimensionObjects:
                Intent intent1 = new Intent(this, ThreeDimensionActivity.class);
                startActivity(intent1);
                break;

        }
    }
}
