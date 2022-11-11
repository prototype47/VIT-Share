package com.example.advit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.advit.notice.DeleteNoticeActivity;
import com.example.advit.notice.NoticeUpload;
import com.example.advit.submissions.MainTaskActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice, addGalleryImage, addPDF, delNews, addAssi, submit;
    MaterialButton developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNotice);
        addGalleryImage = findViewById(R.id.addGalleryImage);
        addPDF = findViewById(R.id.addEBook);
        delNews = findViewById(R.id.deleteNotice);
        addAssi = findViewById(R.id.assi);
        submit = findViewById(R.id.submission);
        developer = findViewById(R.id.meetDevelopers);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addPDF.setOnClickListener(this);
        delNews.setOnClickListener(this);
        addAssi.setOnClickListener(this);
        submit.setOnClickListener(this);
        developer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()) {
            case R.id.addNotice:
                intent = new Intent(MainActivity.this, NoticeUpload.class);
                startActivity(intent);
                break;
            case R.id.addGalleryImage:
                intent = new Intent(MainActivity.this, uploadImage.class);
                startActivity(intent);
                break;
            case R.id.addEBook:
                intent = new Intent(MainActivity.this, UploadPDFActivity.class);
                startActivity(intent);
                break;
            case R.id.assi:
                intent = new Intent(MainActivity.this, UploadTaskActivity.class);
                startActivity(intent);
                break;
            case R.id.submission:
                intent = new Intent(MainActivity.this, MainTaskActivity.class);
                startActivity(intent);
                break;
            case R.id.meetDevelopers:
                intent = new Intent(MainActivity.this, developersPage.class);
                startActivity(intent);
                break;
            case R.id.deleteNotice:
                intent = new Intent(MainActivity.this, DeleteNoticeActivity.class);
                startActivity(intent);
                break;
        }
    }
}