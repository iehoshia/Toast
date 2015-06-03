package com.example.iehoshia.intentapi;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText eNombre;
    EditText eApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eNombre = (EditText) findViewById(R.id.ETnombre);
        eApellido=(EditText) findViewById(R.id.ETapellido);
    }


    public void mostrarApellido (View view){
       String tApellido;
        tApellido = eApellido.getText().toString();
        Toast.makeText(this, tApellido, Toast.LENGTH_LONG).show();

    }

    public void mostrarNombre(View view){
        String tNombre;
        tNombre = eNombre.getText().toString();
        Toast.makeText(this, tNombre, Toast.LENGTH_LONG).show();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
