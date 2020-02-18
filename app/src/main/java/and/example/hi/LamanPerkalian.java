package and.example.hi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LamanPerkalian extends AppCompatActivity {
    private EditText etAngkaPertama, etAngkaKedua;
    private TextView tvAngka, Hasil;
    private Button BKali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laman_perkalian);

        etAngkaPertama = findViewById(R.id.etAngkaPertama);
        etAngkaKedua = findViewById(R.id.etAngkakedua);
        tvAngka = findViewById(R.id.tvAngka);
        Hasil = findViewById(R.id.Hasil);
        BKali = findViewById(R.id.BKali);

        BKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAngkaPertama = etAngkaPertama.getText().toString();
                String sAngkaKedua = etAngkaKedua.getText().toString();

                double angka1 = Double.parseDouble(sAngkaPertama);
                double angka2 = Double.parseDouble(sAngkaKedua);

                double hasil = angka1*angka2;

                String sHasil = String.valueOf(hasil);
                Hasil.setText(sHasil);
            }
        });

    }
}
