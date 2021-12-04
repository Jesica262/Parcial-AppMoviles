package com.example.parcial;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroUsuariosActivity extends AppCompatActivity {

        int campoId;
        EditText campoNombre;
        EditText campoContrasenia;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            campoNombre= (EditText) findViewById(R.id.nombreAux);
            campoContrasenia= (EditText) findViewById(R.id.contraseniaAux);
            campoId = 1;

        }

        public void onClick(View view) {
            registrarUsuarios();
        }

        private void registrarUsuarios() {
            ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_usuarios",null,1);

            SQLiteDatabase db=conn.getWritableDatabase();

            ContentValues values=new ContentValues();
            values.put(Consultas.CAMPO_ID,campoId);
            values.put(Consultas.CAMPO_NOMBRE,campoNombre.getText().toString());
            values.put(Consultas.CAMPO_CONTRASENIA,campoContrasenia.getText().toString());

            Long idResultante=db.insert(Consultas.TABLA_USUARIO,Consultas.CAMPO_ID,values);

            Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
            db.close();
        }
    }
