package eduardo.caballer.ejerciciosdeclase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText txtFrase;
    private Button btnCaracteres;
    private Button btnPalabras;
    private TextView txtLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarActividad();

        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contarCaracteres();
            }
        });

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contarPalabras();
            }
        });
    }

    private void contarPalabras() {
        String frase = txtFrase.getText().toString();

        String[] palabras = frase.split(" ");

        int contador = palabras.length;

        txtLabel.setText("Tú frase tiene " + contador + " palabras.");
    }

    private void contarCaracteres() {

        String frase = txtFrase.getText().toString();

        int contador = frase.length();

        txtLabel.setText("Tú frase tiene " + contador + " carácteres.");
    }

    private void inicializarActividad() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
        txtLabel = findViewById(R.id.txtLabelMain);
    }
}