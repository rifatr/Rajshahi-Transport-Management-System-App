package com.rifat.rajshahitransportmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_menu);
    }

    public void popup(View v) {
        if(v.getId() == R.id.train_schedule) {
            Intent intent = new Intent(this, TrainSchedule.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.train_price) {
            Intent intent = new Intent(this, TrainPrice.class);
            startActivity(intent);
        }
    }
}