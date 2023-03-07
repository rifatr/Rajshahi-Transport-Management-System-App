package com.rifat.rajshahitransportmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AirMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_menu);
    }

    public void popup(View v) {
        if(v.getId() == R.id.air_schedule) {
            Intent intent = new Intent(this, AirSchedule.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.air_price) {
            Intent intent = new Intent(this, AirPrice.class);
            startActivity(intent);
        }
    }

}