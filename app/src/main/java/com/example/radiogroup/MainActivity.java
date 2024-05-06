package com.example.radiogroup;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout TL;
    Switch swtch;
    RadioButton rbRed, rbYellow, rbGreen, rbBlue;
    Button btnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        TL = findViewById(R.id.TL);

        swtch = (Switch) findViewById(R.id.swtch);

        rbRed = (RadioButton) findViewById(R.id.rbRed);
        rbYellow = (RadioButton) findViewById(R.id.rbYellow);
        rbBlue = (RadioButton) findViewById(R.id.rbBlue);
        rbGreen = (RadioButton) findViewById(R.id.rbGreen);

        btnChange = (Button) findViewById(R.id.btnChange);
    }


    public void goChange(View view) {
        if (swtch.isChecked())
        {
            if (rbRed.isChecked()) TL.setBackgroundColor(Color.RED);
            else if (rbYellow.isChecked()) TL.setBackgroundColor(Color.YELLOW);
            else if (rbBlue.isChecked()) TL.setBackgroundColor(Color.BLUE);
            else if (rbGreen.isChecked()) TL.setBackgroundColor(Color.GREEN);
        }
    }
}