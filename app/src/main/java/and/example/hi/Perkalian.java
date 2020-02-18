package and.example.hi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Perkalian extends AppCompatActivity {
    private TextView etTampilNama;
    private Button BPerkalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);
        etTampilNama = findViewById(R.id.etTampilNama);
        BPerkalian = findViewById(R.id.BPerkalian);

        String nama = getIntent().getStringExtra("nama");
        etTampilNama.setText("Hi " + nama + "!");

        BPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LamanPerkalian.class);
                startActivity(intent);
            }
        });
    }
}
