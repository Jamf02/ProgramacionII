package com.example.avance_08_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2, et3, et4, et5;
    private Button btnGrabar, btnBuscar, btnBorrar, btnModificar, btnBuscarCI, btnBorrarCI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.et1 = (EditText) findViewById(R.id.et1);
        this.et2 = (EditText) findViewById(R.id.et2);
        this.et3 = (EditText) findViewById(R.id.et3);
        this.et4 = (EditText) findViewById(R.id.et4);
        this.et5 = (EditText) findViewById(R.id.et5);
        this.btnGrabar = (Button) findViewById(R.id.btnGrabar);
        this.btnBuscar = (Button) findViewById(R.id.btnBuscar);
        this.btnBorrar = (Button) findViewById(R.id.btnBorrar);
        this.btnModificar = (Button) findViewById(R.id.btnModificar);
        this.btnBorrar = (Button) findViewById(R.id.btnBorrar);
        this.btnBuscarCI= (Button) findViewById(R.id.btnBuscarCI);
        this.btnBorrarCI = (Button) findViewById(R.id.btnBorrarCI);

        this.btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(v.getContext(), "universidad", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                if(et1.getText().length()>0){
                    int id= Integer.parseInt(et1.getText().toString());
                    int cantidadRegistrosBorrados = bd.delete("estudiantes", "id="+id, null);
                    if(cantidadRegistrosBorrados==1){
                        Toast.makeText(v.getContext(),"Se ha borrado"+ cantidadRegistrosBorrados+" registros", Toast.LENGTH_LONG).show();
                    LimpiarFormulario();
                    }
                    else
                        Toast.makeText(v.getContext(),"No se ha encontrado un registro para borrar con el id ingresado",Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(v.getContext(),"No se ingreso el id para borrar", Toast.LENGTH_LONG).show();
                bd.close();
            }
        });
        this.btnBorrarCI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(v.getContext(), "universidad", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                if(et2.getText().length()>0){
                    int id= Integer.parseInt(et1.getText().toString());
                    int cantidadRegistrosBorrados = bd.delete("estudiantes", "id="+id, null);
                    if(cantidadRegistrosBorrados==1){
                        Toast.makeText(v.getContext(),"Se ha borrado"+ cantidadRegistrosBorrados+" registros", Toast.LENGTH_LONG).show();
                        LimpiarFormulario();
                    }
                    else
                        Toast.makeText(v.getContext(),"No se ha encontrado un registro para borrar con el id del CI ingresado",Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(v.getContext(),"No se ingreso el id del CI para borrar", Toast.LENGTH_LONG).show();
                bd.close();
            }
        });


        this.btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(v.getContext(),"universidad", null, 1);
                SQLiteDatabase bd = admin.getReadableDatabase();
                if(et1.getText().length()>0)
                {
                    int id = Integer.parseInt(et1.getText().toString());
                    Cursor fila = bd.rawQuery("select carnet, nombre, edad, id_carrera from estudiantes where id="+id,null);
                    if(fila.moveToFirst())//si devuelve true es que la consulta recuperó datos
                    {
                        et2.setText(fila.getString(0));
                        et3.setText(fila.getString(1));
                        et4.setText(String.valueOf(fila.getInt(2)));
                        et5.setText(String.valueOf(fila.getInt(3)));
                    }
                    else
                        Toast.makeText(v.getContext(),"No se recuperó información con el id ingresado", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(v.getContext(),"No se ha ingresado el id para consultar", Toast.LENGTH_LONG).show();
                bd.close();
            }
        });
        this.btnBuscarCI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(v.getContext(),"universidad", null, 1);
                SQLiteDatabase bd = admin.getReadableDatabase();
                if(et2.getText().length()>0)
                {
                    int idCI = Integer.parseInt(et2.getText().toString());
                    Cursor fila = bd.rawQuery("select id, nombre, edad, id_carrera from estudiantes where carnet="+idCI,null);
                    if(fila.moveToFirst())//si devuelve true es que la consulta recuperó datos
                    {
                        et1.setText(fila.getString(0));
                        et3.setText(fila.getString(1));
                        et4.setText(String.valueOf(fila.getInt(2)));
                        et5.setText(String.valueOf(fila.getInt(3)));
                    }
                    else
                        Toast.makeText(v.getContext(),"No se recuperó información con el id del CI ingresado", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(v.getContext(),"No se ha ingresado el id del CI para consultar", Toast.LENGTH_LONG).show();
                bd.close();
            }
        });


    this.btnGrabar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(v.getContext(),"universidad", null, 1);
            SQLiteDatabase bd = admin.getWritableDatabase();
            if( et1.getText().length()>0 && et2.getText().length()>0 && et3.getText().length()>0 && et4.getText().length()>0 && et5.getText().length()>0 ){
                ContentValues registro = new ContentValues();
                registro.put("id", Integer.parseInt(et1.getText().toString()));
                registro.put("carnet",et2.getText().toString());
                registro.put("nombre",et3.getText().toString());
                registro.put("edad",Integer.parseInt(et4.getText().toString()));
                registro.put("id_carrera",Integer.parseInt(et5.getText().toString()));
                bd.insert("estudiantes", null, registro);
                bd.close();
                LimpiarFormulario();
                Toast.makeText(v.getContext(),"El registro se guardó exitósamente a la base de datos", Toast.LENGTH_LONG).show();




            }
        else
                Toast.makeText(v.getContext(),"No se han ingresado todos los valores del formulario", Toast.LENGTH_LONG).show();
        }
    });
    }
    public void LimpiarFormulario(){
        this.et1.setText("");
        this.et2.setText("");
        this.et3.setText("");
        this.et4.setText("");
        this.et5.setText("");
    }
}