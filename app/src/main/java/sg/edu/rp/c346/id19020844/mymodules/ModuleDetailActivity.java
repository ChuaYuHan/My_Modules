package sg.edu.rp.c346.id19020844.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvMcode, tvMname, tvAyear,tvSem, tvMcredit, tvVenue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvMcode=findViewById(R.id.Mcode);
        tvMname=findViewById(R.id.Mname);
        tvAyear=findViewById(R.id.Ayear);
        tvSem=findViewById(R.id.sem);
        tvMcredit=findViewById(R.id.Mcredit);
        tvVenue=findViewById(R.id.venue);
        btnReturn=findViewById(R.id.back);

        Intent intentReceived = getIntent();

        String modCode = intentReceived.getStringExtra("Mcode");
        String modName = intentReceived.getStringExtra("Mname");
        int acadYear = intentReceived.getIntExtra("Ayear: ", 0);
        int sem = intentReceived.getIntExtra("Sem: ", 0);
        int modCredit = intentReceived.getIntExtra("Mcredit", 0);
        String venue = intentReceived.getStringExtra("venue");

        tvMcode.setText("Module Code: " + modCode);
        tvMname.setText("Module Name: " + modName);
        tvAyear.setText("Academic Year: " + acadYear);
        tvSem.setText("Semester: " + sem);
        tvMcredit.setText("Module Credit: " + modCredit);
        tvVenue.setText("Venue: " + venue);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
