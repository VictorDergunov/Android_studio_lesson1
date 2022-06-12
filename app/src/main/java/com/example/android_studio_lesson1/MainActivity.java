package com.example.android_studio_lesson1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText numberOneEditText;
    private EditText numberTwoEditText;
    private Button resultButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(getSumFromView());
            }
        });
    }

    private String getSumFromView() {
        String firstNumberStr = numberOneEditText.getText().toString();
        String secondNumberStr = numberTwoEditText.getText().toString();

        String result;

        try {
            int firstNumber = Integer.parseInt(firstNumberStr);
            int secondNumber = Integer.parseInt(secondNumberStr);

            int sum = firstNumber + secondNumber;

            result = String.valueOf(sum);
        } catch (Exception e) {
            e.printStackTrace();
            result = "Ошибка";
        }

        return result;
    }

    private void initView() {
        numberOneEditText = findViewById(R.id.number_one_edit_text);
        numberTwoEditText = findViewById(R.id.number_two_edit_text);
        resultButton = findViewById(R.id.result_button);
        resultTextView = findViewById(R.id.result_text_view);
    }

}