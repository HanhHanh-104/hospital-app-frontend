package com.example.hospitalapp_frontend.activities;
import com.example.hospitalapp_frontend.R;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAppointment, btnRecords, btnPrescriptions, btnTests, btnPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAppointment = findViewById(R.id.btnAppointment);
        btnRecords = findViewById(R.id.btnRecords);
        btnPrescriptions = findViewById(R.id.btnPrescriptions);
        btnTests = findViewById(R.id.btnTests);
        btnPayment = findViewById(R.id.btnPayment);

        btnAppointment.setOnClickListener(v -> {
            startActivity(new Intent(this, AppointmentActivity.class));
        });

        // Các nút khác xử lý tương tự...
    }
}
