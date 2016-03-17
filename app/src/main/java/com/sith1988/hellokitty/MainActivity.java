package com.sith1988.hellokitty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private EditText mNameTextEdit;
    private RadioButton mButton1;
    private RadioButton mButton2;
    private RadioButton mButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView)findViewById(R.id.imageView);
        mButton1 = (RadioButton)findViewById(R.id.radioButton);
        mButton2 = (RadioButton)findViewById(R.id.radioButton2);
        mButton3 = (RadioButton)findViewById(R.id.radioButton3);
    }

    public void onClick(View view) {

        if(mButton1.isChecked())
            mImageView.setImageResource(R.drawable.dog);
        if(mButton2.isChecked())
            mImageView.setImageResource(R.drawable.kitten);
        if(mButton3.isChecked())
            mImageView.setImageResource(R.drawable.bird);

        }

}

