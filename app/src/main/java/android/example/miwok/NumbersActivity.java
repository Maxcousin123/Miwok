package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        String[] numbers = new String[] {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        Log.v("NumbersActivity" , "Word at index 0: " + numbers[0]);


    }



}