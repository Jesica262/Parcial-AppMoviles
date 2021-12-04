package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);

        Crear();
    }

    public void Crear()
    {
        Button crear = (Button) findViewById(R.id.crearUsuario);

        crear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent miIntent = null;

                miIntent =new Intent(MainActivity.this,RegistroUsuariosActivity.class);

                if (miIntent !=null){
                    startActivity(miIntent);
                }
            }
        });
    }
}