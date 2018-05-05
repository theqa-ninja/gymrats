package com.hackhlth.gymrats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterCoinActivity extends AppCompatActivity {

    private Button mButton;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_coin);

        mEditText = findViewById(R.id.coin_id_edit_text);
        mButton = findViewById(R.id.button_register_coin);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Toast.makeText(getApplication(), R.string.register_button_clicked, Toast.LENGTH_SHORT).show();
                mEditText.setText("");
            }
        });
    }
}
