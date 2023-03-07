package com.rifat.rajshahitransportmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button busBttn, trainBttn, airBttn, epBttn, exitBttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        busBttn = findViewById(R.id.bus_button);
        trainBttn = findViewById(R.id.train_button);
        airBttn = findViewById(R.id.air_button);
        epBttn = findViewById(R.id.ep_button);
        exitBttn = findViewById(R.id.exit_button);

    }

    public void popup(View v) {
        if(v.getId() == R.id.bus_button) {
            //Toast.makeText(MenuActivity.this, "Bus Menu is Coming...", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, BusMenu.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.train_button) {
            //Toast.makeText(MenuActivity.this, "Train Menu is Coming...", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, TrainMenu.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.air_button) {
            //Toast.makeText(MenuActivity.this, "Airway Menu is Coming...", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, AirMenu.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.ep_button) {
            //Toast.makeText(MenuActivity.this, "Emergency & Private Menu is Coming...", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, Emergency.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.exit_button) {
            Toast.makeText(MenuActivity.this, "Thank You...\nCome Again...", Toast.LENGTH_SHORT).show();
            finish();
            System.exit(0);
        }

    }
}
