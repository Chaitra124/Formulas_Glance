package com.formulas_glance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Chaitra Vani Jujaray on 18-10-2016.
 */
public class CalculusActivity extends AppCompatActivity implements OnClickListener {

    Button btDifferentiation;
    Button btIntegration;

protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.calculusactivity);
    btDifferentiation = (Button) findViewById(R.id.btDifferentiation);
    btIntegration = (Button) findViewById(R.id.btIntegration);
    btDifferentiation.setOnClickListener(this);
    btIntegration.setOnClickListener(this);
}

    public void onClick(View view){
        switch(view.getId()){
            case R.id.btDifferentiation:
                Intent intent = new Intent(this, Differentiation.class);
                startActivity(intent);
                break;

            case R.id.btIntegration:
                Intent intent1= new Intent(this, Integration.class);
                startActivity(intent1);
                break;
        }
    }

}
