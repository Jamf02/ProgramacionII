package com.example.avance_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private ImageView iv1;
private Button bt1, bt2;
private TextView tv1;
private RadioButton rb1, rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iv1 = (ImageView) findViewById(R.id.iv1);
        this.bt1 = (Button) findViewById(R.id.bt1);
        this.bt2 = (Button) findViewById(R.id.bt2);
        this.tv1 = (TextView) findViewById(R.id.tv1);
        this.rb1 = (RadioButton) findViewById(R.id.rb1);
        this.rb2 = (RadioButton) findViewById(R.id.rb2);
        //implementamos los botones
        this.bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random aleatorio = new Random();
                int valor = aleatorio.nextInt(2);//0 es cruz, 1 cara
                if(valor == 0) {
                    iv1.setImageResource(R.drawable.cruz2);
                    tv1.setText("Cruz");
                    tv1.setVisibility(View.VISIBLE);
                    if(rb1.isChecked()) {
                        Toast.makeText(MainActivity.this, "Acertaste: CRUZ", Toast.LENGTH_SHORT).show();
                    } else if (rb2.isChecked())
                        Toast.makeText(MainActivity.this, "No acertaste, Intenta de nuevo!", Toast.LENGTH_SHORT).show();
                    }else {
                    iv1.setImageResource(R.drawable.cara2);
                    tv1.setText("Cara");
                    tv1.setVisibility(View.VISIBLE);
                    if(rb2.isChecked()) {
                        Toast.makeText(MainActivity.this, "Acertaste: CARA", Toast.LENGTH_SHORT).show();
                    } else if (rb1.isChecked()){
                        Toast.makeText(MainActivity.this, "No acertaste, Intenta de nuevo", Toast.LENGTH_SHORT).show();
                    }
                }
                bt1.setVisibility(View.INVISIBLE);
                bt2.setVisibility(View.VISIBLE);
                rb1.setVisibility(View.INVISIBLE);
                rb2.setVisibility(View.INVISIBLE);
            }
        });
        this.bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.moneda);
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.INVISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);
            }
        });
        }

    }

