package mx.edu.tesoem.isc.p77s2120222vba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class objeto extends AppCompatActivity {

    Button btnregresa;
    TextView lbnombre, lbedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto);

        Datos datos = getIntent().getParcelableExtra("datosp");

        String nombre = datos.getNombre();
        int edad = datos.getEdad();

        btnregresa = findViewById(R.id.btnregresa);

        lbnombre = findViewById(R.id.lbnombre);
        lbedad = findViewById(R.id.lbedad);

        lbnombre.setText(nombre);
        lbedad.setText(String.valueOf(edad));

        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }

        });

    }
}