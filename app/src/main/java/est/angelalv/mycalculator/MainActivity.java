package est.angelalv.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mainResultTextView;
    private TextView resumeOperationTextView;
    private Button zero_button;
    private Button double_zero_button;
    private Button one_button;
    private Button two_button;
    private Button three_button;
    private Button four_button;
    private Button five_button;
    private Button six_button;
    private Button seven_button;
    private Button eight_button;
    private Button nine_button;
    private Button plus_button;
    private Button minus_button;
    private Button multiply_button;
    private Button slash_button;
    private Button c_button;
    private Button percent_button;
    private Button dot_button;
    private Button sign_button;
    private Button equals_button;
    private String operator ="+";
    private Double operand1 = 0.0;
    private Double operand2 = 0.0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainResultTextView = findViewById(R.id.mainResultTextView);
        resumeOperationTextView = findViewById(R.id.resumeOperationTextView);
        zero_button = findViewById(R.id.zeroButton);
        double_zero_button = findViewById(R.id.double0Button);
        one_button = findViewById(R.id.oneButton);
        two_button = findViewById(R.id.twoButton);
        three_button = findViewById(R.id.threeButton);
        four_button = findViewById(R.id.fourButton);
        five_button = findViewById(R.id.fiveButton);
        six_button = findViewById(R.id.sixButton);
        seven_button = findViewById(R.id.sevenButton);
        eight_button = findViewById(R.id.eightButton);
        nine_button = findViewById(R.id.nineButton);
        plus_button = findViewById(R.id.plusButton);
        minus_button = findViewById(R.id.minusButton);
        multiply_button = findViewById(R.id.multiplyButton);
        slash_button = findViewById(R.id.slashButton);
        c_button = findViewById(R.id.cButton);
        percent_button = findViewById(R.id.percentButton);
        dot_button = findViewById(R.id.dotButton);
        sign_button = findViewById(R.id.signButton);
        equals_button = findViewById(R.id.equalsButton);



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

        c_button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = 0.0;
                operand2 = 0.0;
                operator = "";
                mainResultTextView.setText("0");
                resumeOperationTextView.setText("");
            }
        }));

        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(mainResultTextView.getText().toString()) + operand1;

                if(operator.equals("+")){
                    resumeOperationTextView.append(" " + mainResultTextView.getText());
                    mainResultTextView.setText(String.valueOf(operand1 + operand2));
                }
                else if(operator.equals("-")){
                    resumeOperationTextView.append(" " + mainResultTextView.getText());
                    mainResultTextView.setText(String.valueOf(operand1 - operand2));
                }
                else if(operator.equals("*")){
                    resumeOperationTextView.append(" " + mainResultTextView.getText());
                    mainResultTextView.setText(String.valueOf(operand1 * operand2));
                }
                else if(operator.equals("/")){
                    if(operand2 != 0) {
                        resumeOperationTextView.append(" " + mainResultTextView.getText());
                        mainResultTextView.setText(String.valueOf(operand1 / operand2));
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
                        mainResultTextView.setText("NAN");
                    }
                }

                operator = "+";
                resumeOperationTextView.setText(mainResultTextView.getText().toString() + " " + operator);
                mainResultTextView.setText(zero_button.getText().toString());
            }
        });

        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(mainResultTextView.getText().toString());
                operator = "-";
                resumeOperationTextView.setText(mainResultTextView.getText().toString() + " " + operator);
                mainResultTextView.setText(zero_button.getText().toString());
            }
        });

        multiply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(mainResultTextView.getText().toString());
                operator = "*";
                resumeOperationTextView.setText(mainResultTextView.getText().toString() + " " + operator);
                mainResultTextView.setText(zero_button.getText().toString());
            }
        });

        slash_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(mainResultTextView.getText().toString());
                operator = "/";
                resumeOperationTextView.setText(mainResultTextView.getText().toString() + " " + operator);
                mainResultTextView.setText(zero_button.getText().toString());
            }
        });

        sign_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(mainResultTextView.getText().toString()) * -1;
                if(operand1 == -0.0) {
                    Toast.makeText(getApplicationContext(), "No se puede cambiar de signo el 0", Toast.LENGTH_SHORT).show();
                    mainResultTextView.setText(String.valueOf(0));
                }
                else
                    mainResultTextView.setText(String.valueOf(operand1));
            }
        });

        percent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(mainResultTextView.getText().toString());

                    mainResultTextView.setText(String.valueOf(operand1/100));

            }
        });

        equals_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand2 = Double.parseDouble(mainResultTextView.getText().toString());
                if(operator.equals("+")){
                    resumeOperationTextView.append(" " + mainResultTextView.getText());
                    mainResultTextView.setText(String.valueOf(operand1 + operand2));
                }
                else if(operator.equals("-")){
                    resumeOperationTextView.append(" " + mainResultTextView.getText());
                    mainResultTextView.setText(String.valueOf(operand1 - operand2));
                }
                else if(operator.equals("*")){
                    resumeOperationTextView.append(" " + mainResultTextView.getText());
                    mainResultTextView.setText(String.valueOf(operand1 * operand2));
                }
                else if(operator.equals("/")){
                    if(operand2 != 0) {
                        resumeOperationTextView.append(" " + mainResultTextView.getText());
                        mainResultTextView.setText(String.valueOf(operand1 / operand2));
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
                        mainResultTextView.setText("NAN");
                    }
                }

            }
        });
    }

}