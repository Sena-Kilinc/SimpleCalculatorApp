package com.senakilinc.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.firstText);
        number2=findViewById(R.id.secondText);
        resultText =findViewById(R.id.resultText);
    }

    public void sum(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            resultText.setText("Invalid Input!");
        }else{
            int firstNum = Integer.parseInt(number1.getText().toString());
            int secondNum = Integer.parseInt(number2.getText().toString());
            int result = firstNum+secondNum;
            resultText.setText("Result: "+result);
        }

    }
    public void subtract(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            resultText.setText("Invalid Input!");
        }else{
            int firstNum = Integer.parseInt(number1.getText().toString());
            int secondNum = Integer.parseInt(number2.getText().toString());
            int result = firstNum-secondNum;
            resultText.setText("Result: "+result);
        }
    }
    public void multiply(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            resultText.setText("Invalid Input!");
        }else{
            int firstNum = Integer.parseInt(number1.getText().toString());
            int secondNum = Integer.parseInt(number2.getText().toString());
            int result = firstNum*secondNum;
            resultText.setText("Result: "+result);
        }
    }
    public void divide(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            resultText.setText("Invalid Input!");
        }else{
            int firstNum = Integer.parseInt(number1.getText().toString());
            int secondNum = Integer.parseInt(number2.getText().toString());
            int result = firstNum/secondNum;
            resultText.setText("Result: "+result);
        }
    }
}