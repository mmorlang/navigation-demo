package com.ebookfrenzy.navigationdemo;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SecondFragment.OnFragmentInteractionListener {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState); setContentView(R.layout.main_activity);
  }

  @Override
 public void onFragmentInteraction(Uri uri) {
  }

}

