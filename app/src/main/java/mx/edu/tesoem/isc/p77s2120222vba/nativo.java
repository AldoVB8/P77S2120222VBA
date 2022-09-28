package mx.edu.tesoem.isc.p77s2120222vba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nativo extends AppCompatActivity {

    Button btnregresa;
    TextView lbnombre, lbedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nativo);

        Bundle parametros = getIntent().getExtras();

        lbnombre = findViewById(R.id.lbnombre);
        lbedad = findViewById(R.id.lbedad);

        String nombre ="";
        int edad=0;

        btnregresa = findViewById(R.id.btnregresa);

        nombre = parametros.getString("nombre");
        edad = parametros.getInt("edad");

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