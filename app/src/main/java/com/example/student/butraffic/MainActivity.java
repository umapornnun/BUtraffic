package com.example.student.butraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {  //การประกาศตัวแปร

    // Explicit คือ การประการตัวแปร

    private ListView trafficListView;   //ตัวแปรที่ 1
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();
        //Button Controller
        buttonController();


    }   // Main Method


    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() { //เป็นการตเซตค่าเมื่อมีการกดปุ่ม
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.cat);
                //getBase คือการบอกว่าแหล่งกำหนดเสียงเสียงไม่ได้อยู่ภายนอกนะ
                buttonPlayer.start();

                //Inter to WebView คือการกำหนด เวลากดแล้ว ไปยังเว็บไซต์
                Intent objIntent = new Intent(new Intent(Intent.ACTION_VIEW));
                objIntent.setData(Uri.parse("https://mail.google.com/mail/u/0/#inbox"));   //ใส่ "...." ทุกครั้งเมื่อทำการใส่เว็บ
                startActivity(objIntent);//คำสั่งเริ่มสตาร์หรือทำงานของเว็บ start เสมอ


            }// event
        });//ใส่คลาส
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);  //ที่เราต้องการให้มันสัมพันธ์กันกับอะไร
        aboutMeButton = (Button) findViewById(R.id.button);



    }
} //   Main Class  นี้คือคลาสหลัก