package com.spoloborota.financetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddTransaction extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_transaction);
        editText = (EditText) findViewById(R.id.transaction_name);

        button = (Button) findViewById(R.id.transaction_add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                if(!name.isEmpty()) {
                    Toast.makeText(AddTransaction.this, R.string.added_transaction,  Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AddTransaction.this, Transactions.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(AddTransaction.this, R.string.empty_category,  Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
