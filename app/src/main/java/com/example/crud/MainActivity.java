package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editActivity, editAsunto, editFecha;
    Button btnAddData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);

        editActivity = (EditText)findViewById(R.id.actividadin);
        editActivity = (EditText)findViewById(R.id.asuntoin);
        editActivity = (EditText)findViewById(R.id.fechain);
        btnAddData = (Button)findViewById(R.id.button_add);

    }

    public void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editActivity.getText().toString(),
                                editAsunto.getText().toString(),
                                editFecha.getText().toString());

                        if (isInserted = true)
                            Toast.makeText(MainActivity.this, "Dato Insertado", Toast.LENGTH_LONG).show();
                        else {
                            Toast.makeText(MainActivity.this, "Dato no Insertado", Toast.LENGTH_SHORT).show();
                        }




                    }
                }
        );
    }




}
