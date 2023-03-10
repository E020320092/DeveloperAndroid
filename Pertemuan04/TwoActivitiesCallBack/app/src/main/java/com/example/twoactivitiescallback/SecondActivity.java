package com.example.twoactivitiescallback;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG
            = secondActivity.class.getSimpleName();

    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";

    private EditText mReply;

    public class secondActivity extends AppCompatActivity {
        public static final String EXTRA_REPLY = "com.example.android.twoactivitiescallback.extra.REPLY";
        private EditText mReply;

        @Override
        protected void onStart() {
            super.onStart();
            Log.d(LOG_TAG, "onStart");
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            Intent intent = getIntent();
            String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
            TextView textView = findViewById(R.id.text_message);
            textView.setText(message);
        }

        public void returnReply(View view) {
            String reply = mReply.getText().toString();
            Intent replyIntent = new Intent();
            replyIntent.putExtra(EXTRA_REPLY, reply);
            setResult(RESULT_OK, replyIntent);
            finish();
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d(LOG_TAG, "onPause");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d(LOG_TAG, "onRestart");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d(LOG_TAG, "onResume");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d(LOG_TAG, "onStop");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d(LOG_TAG, "onDestroy");
        }
    }
}