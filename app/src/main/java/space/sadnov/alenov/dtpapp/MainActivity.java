package space.sadnov.alenov.dtpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnregisterDTP, btndellDTP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnregisterDTP = (Button)findViewById(R.id.btnregisterDTP);

        btnregisterDTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(activity_registerIntent);
            }
        });

    }

}