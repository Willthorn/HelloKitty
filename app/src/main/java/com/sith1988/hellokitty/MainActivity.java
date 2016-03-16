package com.sith1988.hellokitty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameTextEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView)findViewById(R.id.textView);
        mNameTextEdit = (EditText)findViewById(R.id.editText);
    }

    public void onClick(View view) {

        if(mNameTextEdit.getText().length()!=0) {
            mHelloTextView.setText("Hello "+mNameTextEdit.getText()+"!");
        } else {
            mHelloTextView.setText("Hello Kitty!");
        }

    }
}
