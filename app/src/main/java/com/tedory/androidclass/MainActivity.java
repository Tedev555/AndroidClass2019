package com.tedory.androidclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int status = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.image_view);
        Button btnChange = findViewById(R.id.btn_change);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status == 0) {
                    imageView.setImageResource(R.drawable.sam_img);
                    status = 1;
                } else {
                    imageView.setImageResource(R.drawable.sam_img2);
                    status = 0;
                }
            }
        });

    }
}
