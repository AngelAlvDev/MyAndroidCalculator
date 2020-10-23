package est.angelalv.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainResultTextView = findViewById(R.id.mainResultTextView);
        TextView resumeOperationTextView = findViewById(R.id.resumeOperationTextView);
        Button zero_button = findViewById(R.id.zeroButton);
        Button double_zero_button = findViewById(R.id.double0Button);
        Button one_button = findViewById(R.id.oneButton);
        Button two_button = findViewById(R.id.twoButton);
        Button three_button = findViewById(R.id.threeButton);
        Button four_button = findViewById(R.id.fourButton);
        Button five_button = findViewById(R.id.fiveButton);
        Button six_button = findViewById(R.id.sixButton);
        Button seven_button = findViewById(R.id.sevenButton);
        Button eight_button = findViewById(R.id.eightButton);
        Button nine_button = findViewById(R.id.nineButton);
        Button plus_button = findViewById(R.id.plusButton);
        Button minus_button = findViewById(R.id.minusButton);
        Button multiply_button = findViewById(R.id.multiplyButton);
        Button slash_button = findViewById(R.id.slashButton);
        Button c_button = findViewById(R.id.cButton);
        Button percent_button = findViewById(R.id.percentButton);
        Button dot_button = findViewById(R.id.dotButton);
        Button sign_button = findViewById(R.id.signButton);
        Button equals_button = findViewById(R.id.equalsButton);
        final String[] operator = new String[1];
        final Double[] operand1 = {0.0};
        Double operand2 = 0.0;



        zero_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(zero_button.getText().toString());
                }
                else{
                    mainResultTextView.append(zero_button.getText().toString());

                }
            }
        });

        double_zero_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(zero_button.getText().toString());

                }
                else{
                    mainResultTextView.append(double_zero_button.getText().toString());
                }
            }
        });

        one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(one_button.getText().toString());

                }
                else{
                    mainResultTextView.append(one_button.getText().toString());
                }
            }
        });

        two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(two_button.getText().toString());

                }
                else{
                    mainResultTextView.append(two_button.getText().toString());
                }
            }
        });

        three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(three_button.getText().toString());

                }
                else{
                    mainResultTextView.append(three_button.getText().toString());
                }
            }
        });


        four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(four_button.getText().toString());

                }
                else{
                    mainResultTextView.append(four_button.getText().toString());
                }
            }
        });

        five_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(five_button.getText().toString());

                }
                else{
                    mainResultTextView.append(five_button.getText().toString());
                }
            }
        });

        six_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(six_button.getText().toString());

                }
                else{
                    mainResultTextView.append(six_button.getText().toString());
                }
            }
        });

        seven_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(seven_button.getText().toString());

                }
                else{
                    mainResultTextView.append(seven_button.getText().toString());
                }
            }
        });

        eight_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(eight_button.getText().toString());

                }
                else{
                    mainResultTextView.append(eight_button.getText().toString());
                }
            }
        });

        nine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainResultTextView.getText().toString().equals("0")){
                    mainResultTextView.setText(nine_button.getText().toString());

                }
                else{
                    mainResultTextView.append(nine_button.getText().toString());
                }
            }
        });

        dot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Double.parseDouble(mainResultTextView.getText().toString()) % 1 == 0)
                    mainResultTextView.append(dot_button.getText().toString());
            }
        });


        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operand1[0] = Double.parseDouble(mainResultTextView.getText().toString());
                operator[0] = "+";
                resumeOperationTextView.setText(mainResultTextView.getText().toString() + " " + operator[0]);
                mainResultTextView.setText(zero_button.getText().toString());
            }
        });

        equals_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = Double.parseDouble(mainResultTextView.getText().toString());
                mainResultTextView.setText(String.valueOf(result));

            }
        });
    }

}