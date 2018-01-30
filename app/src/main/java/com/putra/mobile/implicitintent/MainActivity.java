package com.putra.mobile.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button call, kamera, kfc, github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call = (Button)findViewById(R.id.btnCall);
        kamera = (Button)findViewById(R.id.btnCamera);
        github = (Button)findViewById(R.id.btnGithub);
        kfc = (Button)findViewById(R.id.btnKfc);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallIntent(view);
            }
        });
        kamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallIntent(view);
            }
        });
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallIntent(view);
            }
        });
        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallIntent(view);
            }
        });
    }

    private void CallIntent(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnCall:
                intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:085364665287"));
                startActivity(intent);
                break;
            case R.id.btnCamera:
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intent, 0);
                break;
            case R.id.btnGithub:
                intent = new Intent(Intent.ACTION_VIEW, Uri
                                .parse("https://github.com/yusmiPutra"));
                startActivity(intent);
                break;
            case R.id.btnKfc:
                intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:14045"));
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
