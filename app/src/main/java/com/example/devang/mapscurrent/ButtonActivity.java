package com.example.devang.mapscurrent;

import android.content.Context;
import android.content.Intent;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.devang.mapscurrent.R;

public class ButtonActivity extends AppCompatActivity {


    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

    }

    public void showCurrentLocation(View view){
        final Intent intent = new Intent(ButtonActivity.this, MapsActivity.class);
        //intent.putExtra("FROM", editFrom.getText().toString().trim());
        //intent.putExtra("TO", editTo.getText().toString().trim());
        ButtonActivity.this.startActivity(intent);
        //Read more: http://mrbool.com/google-directions-api-tracing-routes-in-android/34083#ixzz4eTxwNF6s
    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
