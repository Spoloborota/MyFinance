package com.spoloborota.financetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddCategory extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);

        editText = (EditText) findViewById(R.id.category_name);

        button = (Button) findViewById(R.id.button_add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                if(!name.isEmpty()) {
                    Toast.makeText(AddCategory.this, name + R.string.added_category,  Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AddCategory.this, Categories.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(AddCategory.this, R.string.empty_category,  Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
