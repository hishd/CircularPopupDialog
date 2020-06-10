package com.hishd.circularpopupdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hishd.circularpopup.CircularPopup;
import com.hishd.circularpopup.Constraints;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.btnSuccess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CircularPopup(MainActivity.this)
                        .createAlert("Success Dialog", Constraints.SUCCESS,Constraints.LARGE)
                        .setAnimation(Constraints.SCALE_FROM_BOTTOM_TO_TOP)
                        .setDuration(1000)
                        .setTextSize(Constraints.NORMAL_TEXT_SIZE)
                        .show();
            }
        });
        findViewById(R.id.btnWarning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CircularPopup(MainActivity.this)
                        .createAlert("Warning Dialog", Constraints.WARNING,Constraints.LARGE)
                        .setAnimation(Constraints.SCALE_FROM_BOTTOM_TO_TOP)
                        .setDuration(1000)
                        .setTextSize(Constraints.NORMAL_TEXT_SIZE)
                        .show();
            }
        });
        findViewById(R.id.btnFail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CircularPopup(MainActivity.this)
                        .createAlert("Failure Dialog", Constraints.ERROR,Constraints.LARGE)
                        .setAnimation(Constraints.SCALE_FROM_BOTTOM_TO_TOP)
                        .setDuration(1000)
                        .setTextSize(Constraints.NORMAL_TEXT_SIZE)
                        .show();
            }
        });
    }
}
