package xyz.izen1231.asmr;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.user);
        imageView.setBackground(new ShapeDrawable(new OvalShape()));
        imageView.setClipToOutline(true);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }

        @Override
        public void onBackPressed() {
            Toast.makeText(this, "뒤로가기 버튼을 한번 더 눌러주세요", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }

    }

