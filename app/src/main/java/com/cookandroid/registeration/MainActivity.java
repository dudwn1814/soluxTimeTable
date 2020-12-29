package com.cookandroid.registeration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button courseButton = (Button)findViewById(R.id.courseButton);
        final Button scheduleButton = (Button)findViewById(R.id.scheduleButton);
        final Button statisticsButton = (Button)findViewById(R.id.statisticsButton);
        final LinearLayout notice = (LinearLayout)findViewById(R.id.notice);

        courseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new CourseFragment());
                fragmentTransaction.commit();
            }
        });

        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new ScheduleFragment());
                fragmentTransaction.commit();
            }
        });

        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new StatisticsFragment());
                fragmentTransaction.commit();
            }
        });
    }
}