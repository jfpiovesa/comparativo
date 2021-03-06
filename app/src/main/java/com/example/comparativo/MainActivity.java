package com.example.comparativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcula(View view) {
        TextView resultado = findViewById(R.id.textView6);

        EditText num1 = findViewById(R.id.editTextNumberDecimal3);
        EditText num2 = findViewById(R.id.editTextNumberDecimal4);

         Float n1 = Float.parseFloat( num1.getText().toString());
         Float n2 = Float.parseFloat(num2.getText().toString());



        if ( n2 >= n1)
        {
               resultado.setText("Gasolina");

        }
        else
        {
            resultado.setText("Ácool");

        }




    }
}