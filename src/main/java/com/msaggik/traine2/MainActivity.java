package com.msaggik.traine2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText userIdIn; // айди пользователя
    private EditText placeIn; // место
    private EditText arrivalIn;// время прибытия
    private EditText departureIn; // время отправления
    private EditText priceIn; // цена
    private Button button;

    private String userId;
    private String place;
    private String departure;
    private String arrival;
    private String price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIdIn = findViewById(R.id.userId);
        placeIn = findViewById(R.id.placeIn);
        departureIn = findViewById(R.id.departureIn);
        arrivalIn = findViewById(R.id.arrivalIn);
        priceIn = findViewById(R.id.priceIn);
        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            userId = userIdIn.getText().toString();
            place = placeIn.getText().toString();
            departure = departureIn.getText().toString();
            arrival = arrivalIn.getText().toString();
            price = priceIn.getText().toString();

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            intent.putExtra("userId",userId);
            intent.putExtra("place",place);
            intent.putExtra("departure",departure);
            intent.putExtra("arrival",arrival);
            intent.putExtra("price",price);

            startActivity(intent);

        }
    };
}