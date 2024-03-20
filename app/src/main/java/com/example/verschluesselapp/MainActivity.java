package com.example.verschluesselapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    EditText editTextInput, editTextOutput;
    Button buttonEncrypt;
    Button buttonDecrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize views
        editTextInput = findViewById(R.id.editTextInput);
        editTextOutput = findViewById(R.id.editTextOutput);
        buttonEncrypt = findViewById(R.id.buttonEncrypt);
        buttonDecrypt = findViewById(R.id.buttonDecrypt);

        // Setzen des KeyListeners
        editTextOutput.setKeyListener(null);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set OnClickListener for the button
        buttonEncrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextInput.getText().toString();
                Verschluesseln.encrypt(inputText);
                editTextOutput.setText(inputText);
            }
        });

        buttonDecrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextInput.getText().toString();
                Verschluesseln.decrypt(inputText);
                editTextOutput.setText(inputText);
            }
        });

        //automatisch bilschirmatastatur aufruffen
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
    }
}


/*
public class MainActivity extends AppCompatActivity {

    EditText editTextInput, editTextOutput;
    Button buttonEncrypt;
    Button buttonDecrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        editTextOutput.setKeyListener(null);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize views
        editTextInput = findViewById(R.id.editTextInput);
        editTextOutput = findViewById(R.id.editTextOutput);
        buttonEncrypt = findViewById(R.id.buttonEncrypt);
        buttonDecrypt = findViewById(R.id.buttonDencrypt);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Set OnClickListener for the button
        buttonEncrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextInput.getText().toString();

                Verschluesseln.encrypt(inputText);

                editTextOutput.setText(inputText);
            }
        });
        buttonDecrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextInput.getText().toString();

                Verschluesseln.decrypt(inputText);

                editTextOutput.setText(inputText);
            }
        });


    }
}
*/