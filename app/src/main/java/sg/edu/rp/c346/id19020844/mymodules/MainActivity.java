package sg.edu.rp.c346.id19020844.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346, tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346=findViewById(R.id.c346);
        tvC349=findViewById(R.id.c349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Mcode", "C346");
                i.putExtra("Mname", "Android Programming");
                i.putExtra("Ayear", 2020);
                i.putExtra("Sem", 1);
                i.putExtra("Mcredit", 4);
                i.putExtra("venue", "W67G");
                startActivity(i);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Mcode", "C349");
                i.putExtra("Mname", "iPad Programming");
                i.putExtra("Ayear", 2020);
                i.putExtra("Sem", 1);
                i.putExtra("Mcredit", 4);
                i.putExtra("venue", "E66H");
                startActivity(i);
            }
        });



    }
}
