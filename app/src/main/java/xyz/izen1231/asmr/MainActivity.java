package xyz.izen1231.asmr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        @Override
        public void onBackPressed() {
            Toast.makeText(this, "뒤로가기 버튼을 한번 더 눌러주세요", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }

    }

