package com.e.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonEqual, buttonC, buttonDot;
    TextView textView;
    EditText editText;

    float mValueOne, mValueTwo;

    boolean addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.buttonZero);
        button1 = findViewById(R.id.buttonOne);
        button2 = findViewById(R.id.buttonTwo);
        button3 = findViewById(R.id.buttonThree);
        button4 = findViewById(R.id.buttonFour);
        button5 = findViewById(R.id.buttonFive);
        button6 = findViewById(R.id.buttonSix);
        button7 = findViewById(R.id.buttonSeven);
        button8 = findViewById(R.id.buttonEight);
        button9 = findViewById(R.id.buttonNine);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSubtract);
        buttonMul = findViewById(R.id.buttonMultiply);
        buttonDiv = findViewById(R.id.buttonDivide);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonC = findViewById(R.id.buttonClear);
        buttonDot = findViewById(R.id.buttonDot);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
                if (editText != null){
                    mValueTwo = 1;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
                if (editText != null){
                    mValueTwo = 2;
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
                if (editText != null){
                    mValueTwo = 3;
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
                if (editText != null){
                    mValueTwo = 4;
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
                if (editText != null){
                    mValueTwo = 5;
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
                if (editText != null){
                    mValueTwo = 6;
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
                if (editText != null){
                    mValueTwo = 7;
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
                if (editText != null){
                    mValueTwo = 8;
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
                if (editText != null){
                    mValueTwo = 9;
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
                if (editText != null){
                    mValueTwo = 0;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                textView.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    editText.setText(editText.getText() + "+");
                    addition = true;
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    editText.setText(editText.getText() + "-");
                    subtraction = true;
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    editText.setText(editText.getText() + "*");
                    multiplication = true;
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    editText.setText(editText.getText() + "/");
                    division = true;
                }
            }
        });





        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (addition == true) {
                    editText.setText("");
                    textView.setText(mValueOne + mValueTwo + "");
                    addition = false;
                }

                if (subtraction == true) {
                    editText.setText("");
                    textView.setText(mValueOne - mValueTwo + "");
                    subtraction = false;
                }

                if (multiplication == true) {
                    editText.setText("");
                    textView.setText(mValueOne * mValueTwo + "");
                    multiplication = false;
                }

                if (division == true) {
                    editText.setText("");
                    textView.setText(mValueOne / mValueTwo + "");
                    division = false;
                }
            }
        });
    }
}