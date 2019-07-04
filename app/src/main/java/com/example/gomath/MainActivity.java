package com.example.gomath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView   = findViewById(R.id.scroll);
        final EditText edtlength        = findViewById(R.id.edtlength);
        final EditText edtwidth          = findViewById(R.id.edtwidth);
        Button button           = findViewById(R.id.hitung);
        textView       = findViewById(R.id.hasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String panjang = edtlength.getText().toString();
                String lebar  = edtwidth.getText().toString();

                if(edtlength.length()>0 && edtwidth.length()>0)
                {
                    MenghitungLuasPersegiPanjang(Integer.parseInt(panjang), Integer.parseInt(lebar));
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Nilai Tidak Boleh Kosong",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void MenghitungLuasPersegiPanjang(int panjang, int lebar){
        int hasil;
        hasil = panjang*lebar;
        textView.setText(String.valueOf(hasil));
        scrollView.smoothScrollBy(0,scrollView.getBottom());
    }
}
