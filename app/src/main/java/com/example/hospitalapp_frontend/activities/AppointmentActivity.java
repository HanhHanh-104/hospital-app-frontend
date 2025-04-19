package com.example.hospitalapp_frontend.activities;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.hospitalapp_frontend.R;
import java.util.Calendar;

public class AppointmentActivity extends AppCompatActivity {

    EditText edtNote;
    TextView tvDate;
    Button btnChooseDate, btnSubmit;
    Spinner spinnerDoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        edtNote = findViewById(R.id.edtNote);
        tvDate = findViewById(R.id.tvDate);
        btnChooseDate = findViewById(R.id.btnChooseDate);
        btnSubmit = findViewById(R.id.btnSubmit);
        spinnerDoctor = findViewById(R.id.spinnerDoctor);

        // Tạm thời load danh sách bác sĩ mẫu
        String[] doctors = {"BS Nguyễn Văn A", "BS Trần Thị B", "BS Lê Văn C"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, doctors);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDoctor.setAdapter(adapter);

        btnChooseDate.setOnClickListener(v -> {
            final Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    (view, selectedYear, selectedMonth, selectedDay) -> {
                        String date = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                        tvDate.setText(date);
                    }, year, month, day);
            datePickerDialog.show();
        });

        btnSubmit.setOnClickListener(v -> {
            String note = edtNote.getText().toString();
            String date = tvDate.getText().toString();
            String doctor = spinnerDoctor.getSelectedItem().toString();

            if (date.isEmpty()) {
                Toast.makeText(this, "Vui lòng chọn ngày hẹn", Toast.LENGTH_SHORT).show();
            } else {
                // TODO: Gửi dữ liệu đến API backend
                Toast.makeText(this, "Đã gửi yêu cầu đặt lịch", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
