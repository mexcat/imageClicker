package cl.gencina.iconbutton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MuestraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra);

        ImageView mostrar = findViewById(R.id.iv_muestra);
        Integer nombre = getIntent().getIntExtra("nombreImagen", 0);
        mostrar.setImageResource(nombre);
        initListeners();
    }
    private void initListeners() {
        Button volver = findViewById(R.id.btn_volver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
