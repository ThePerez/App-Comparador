package com.example.app.practica.alex_app_compare;

import android.accessibilityservice.TouchInteractionController;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.BreakIterator;
public class MainActivity extends AppCompatActivity {

    public TouchInteractionController btnComparar;
    public BreakIterator tvResultado;
    EditText editText1;
    EditText editText2;
    private Button compareButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        compareButton = findViewById(R.id.compareButton);
        resultTextView = findViewById(R.id.resultTextView);

        compareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtiene valores de los EditText
                String input1 = editText1.getText().toString();
                String input2 = editText2.getText().toString();

                // Convierte los valores a números
                int number1 = Integer.parseInt(input1);
                int number2 = Integer.parseInt(input2);

                // Compara los números
                if (number1 > number2) {
                    resultTextView.setText("El primer número es mayor.");
                } else if (number1 < number2) {
                    resultTextView.setText("El segundo número es mayor.");
                } else {
                    resultTextView.setText("Los números son iguales.");
                }
            }
        });
    }

    public String compareNumbers(int number1, int number2) {
        return String.valueOf(0);
    }
}
