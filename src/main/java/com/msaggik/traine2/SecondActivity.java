package com.msaggik.traine2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView dataMainActivity;
    private Button button;

    private String userId;
    private String place;
    private String departure;
    private String arrival;
    private String price;
    

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        dataMainActivity = findViewById(R.id.dataMainActivity);
        button = findViewById(R.id.button);

        Bundle bundleIntent = getIntent().getExtras();

        userId = bundleIntent.getString("userId");
        place = bundleIntent.get("place").toString();
        departure = bundleIntent.get("departure").toString();
        arrival = bundleIntent.get("arrival").toString();
        price = bundleIntent.get("price").toString();

        dataMainActivity.setText("Id пользователя" + userId + "\n"
        +"Место" + place + "\n" + "Время отправления" + departure + "\n" +
                "Время прибытия" + arrival + "\n" + "Цена билета" + price + "\n");
        button.setOnClickListener(listener);

    }
    
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}