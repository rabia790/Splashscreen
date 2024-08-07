package com.rn_splashscreen_tutorial; // Change this to your package name.

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    try {
      super.onCreate(savedInstanceState);
      Intent intent = new Intent(this, MainActivity.class);

      // IMPORTANT: Pass along FCM messages, notifications, ...
      Bundle extras = getIntent().getExtras();
      if (extras != null) {
        intent.putExtras(extras);
      }
      startActivity(intent);
      finish();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}