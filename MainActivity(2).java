package com.example.trabajo_programacion;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //declaramos las variables de instancia
    private Button BSalir;
    private TextView tv1;
    private ImageButton ib1;
    private ImageView iv1;
    private Truco miBaraja;
    private int contador1 = 0;
    private Temporizador temporizador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.ib1 = (ImageButton) findViewById(R.id.ib1);
        this.tv1 = (TextView) findViewById(R.id.tv1);
        this.iv1 = (ImageView) findViewById(R.id.iv1);
        this.BSalir = (Button) findViewById(R.id.BSalir);
        this.miBaraja = new Truco();
        this.ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (contador1 < 40) {
                if (contador1 == 0)
                        iv1.setVisibility(View.VISIBLE);
                    Context c = v.getContext();
                    int id = c.getResources().getIdentifier(miBaraja.maso[contador1].dirImagen, "drawable", c.getPackageName());
                    iv1.setImageResource(id);
                    Toast.makeText(v.getContext(), miBaraja.maso[contador1].dirImagen, Toast.LENGTH_SHORT).show();
                    contador1++;
                    tv1.setText("3");
                    temporizador = new Temporizador(3500, 1000);
                    temporizador.start();
                } else {
                    iv1.setVisibility(View.INVISIBLE);
                }
            }
        });

        this.BSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public class Temporizador extends CountDownTimer {
        public Temporizador(long totalMilisegundos, long intervalo) {
            super(totalMilisegundos, intervalo);

        }

        @Override
        public void onTick(long millisUntilFinished) {
            long segundos = millisUntilFinished / 1000;
            tv1.setText(String.valueOf(segundos));
        }

        @Override
        public void onFinish() {
            if (contador1 < 40) {

                if (contador1 == 0) {
                    iv1.setVisibility(View.VISIBLE);
                }
                Context c = com.example.trabajo_programacion.MainActivity.this;
                int id = c.getResources().getIdentifier(miBaraja.maso[contador1].dirImagen, "drawable", c.getPackageName());
                iv1.setImageResource(id);
                Toast.makeText(com.example.trabajo_programacion.MainActivity.this, miBaraja.maso[contador1].dirImagen, Toast.LENGTH_SHORT).show();
                contador1++;
                tv1.setText("3");
                temporizador = new Temporizador(3500, 1000);
                temporizador.start();
            } else {
                ib1.setVisibility(View.INVISIBLE);
            }

        }
    }
}