package cl.gencina.iconbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners(){
        ImageButton marioBtn = findViewById(R.id.iv_mario);
        ImageButton luigiBtn = findViewById(R.id.iv_luigi);
        ImageButton peacheBtn = findViewById(R.id.iv_peach);
        ImageButton bowserBtn = findViewById(R.id.iv_bowser);
        Button cerrar = findViewById(R.id.btn_cerrar);


        marioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMuestraActivity(R.drawable.m);
            }
        });
        luigiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMuestraActivity(R.drawable.l);
            }
        });
        peacheBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMuestraActivity(R.drawable.p);
            }
        });
        bowserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMuestraActivity(R.drawable.b);
            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void toMuestraActivity(Integer nombre){
        Log.e("nombre", String.valueOf( nombre));
        Intent intent = new Intent(MainActivity.this, MuestraActivity.class);
        intent.putExtra("nombreImagen", nombre);
        startActivity(intent);
    }

}