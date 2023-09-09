package il.co.sahar.blogs.ACTIVITIES;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import il.co.sahar.blogs.R;

public class BlogPostActivity extends AppCompatActivity {
    final Calendar myCalendar= Calendar.getInstance();
    EditText DateText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_post);
        DateText=(EditText) findViewById(R.id.Dateid);
        DatePickerDialog.OnDateSetListener date =new DatePickerDialog.OnDateSetListener() {
            @Override

            public void onDateSet(DatePicker view, int year, int month, int day) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, day);
                updateLabel();
            }
        };
    }
    private void updateLabel(){
        String myFormat="DD/mm/yy";
        SimpleDateFormat dateFormat=new SimpleDateFormat(myFormat, Locale.UK);
        DateText.setText(dateFormat.format(myCalendar.getTime()));
    }
}