package and.example.hi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etNama;
    private Button BKirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = findViewById(R.id.etNama);
        BKirim = findViewById(R.id.BKirim);

        BKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sNama = etNama.getText().toString();
                String  nama = sNama;
                etNama.setText(sNama);

                Intent intent = new Intent(getApplicationContext(),Perkalian.class);
                intent.putExtra("nama",sNama);
                startActivity(intent);
            }
        });
    }
}
