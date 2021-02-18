package com.cookandroid.registeration;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.SlidingDrawer;
import android.widget.TextView;


public class Schedule {

    private String monday[] = new String[14];
    private String tuesday[] = new String[14];
    private String wednesday[] = new String[14];
    private String thursday[] = new String[14];
    private String friday[] = new String[14];

    private String monPro[] = new String[14];
    private String tuePro[] = new String[14];
    private String wedPro[] = new String[14];
    private String thuPro[] = new String[14];
    private String friPro[] = new String[14];

    String proName = "";

    public Schedule() {
        for(int i = 0; i < 14; i++)
        {
            monday[i] = "";
            tuesday[i] = "";
            wednesday[i] = "";
            thursday[i] = "";
            friday[i] = "";

        }

        for(int i = 0; i < 14; i++)
        {
            monPro[i] = "";
            tuePro[i] = "";
            wedPro[i] = "";
            thuPro[i] = "";
            friPro[i] = "";

        }
    }

    public void addSchedule(String scheduleText) {
        int temp;
        if((temp = scheduleText.indexOf("월")) > -1)
        {
            temp += 2;
            int count = temp;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";
                }
            }
        }
        if((temp = scheduleText.indexOf("화")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";
                }
            }
        }
        if((temp = scheduleText.indexOf("수")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";
                }
            }
        }
        if((temp = scheduleText.indexOf("목")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";
                }
            }
        }
        if((temp = scheduleText.indexOf("금")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";
                }
            }
        }
    }

    //////
    public boolean validate(String scheduleText) {
        if(scheduleText.equals(""))
        {
            return true;
        }
        int temp;
        if((temp = scheduleText.indexOf("월")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    if(!monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("화")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    if(!tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }if((temp = scheduleText.indexOf("수")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    if(!wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }if((temp = scheduleText.indexOf("목")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    if(!thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }if((temp = scheduleText.indexOf("금")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    if(!friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void addSchedule(String scheduleText, String courseTitle, String courseProfessor) {
        String professor;
        if (courseProfessor.equals(""))
        {
            professor="";
        }
        else{
            professor ="";
            proName = courseProfessor;
        }
        int temp;
        if((temp = scheduleText.indexOf("월")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;
                    monPro[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = proName;
                }
            }
        }
        if((temp = scheduleText.indexOf("화")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;
                    tuePro[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = proName;
                }
            }
        }
        if((temp = scheduleText.indexOf("수")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;
                    wedPro[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = proName;
                }
            }
        }
        if((temp = scheduleText.indexOf("목")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;
                    thuPro[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = proName;
                }
            }
        }
        if((temp = scheduleText.indexOf("금")) > -1)
        {
            temp += 2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']')
                {
                    endPoint = i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;
                    friPro[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = proName;
                }
            }
        }
    }
    // setting 함수 --> 해당 강의 목록들을 보여주도록 세팅하는 기능
    public void setting(TextView text1, TextView text2, SlidingDrawer drawer, AutoResizeTextView[] monday,AutoResizeTextView[] tuesday,AutoResizeTextView[] wednesday,AutoResizeTextView[] thursday,AutoResizeTextView[] friday, Context context) {
        int maxLength = 0;
        String maxString ="";
        for(int i=0; i<14; i++)
        {
            if(this.monday[i].length() > maxLength)
            {
                maxLength = this.monday[i].length();
                maxString = this.monday[i];
            }
            if(this.tuesday[i].length() > maxLength)
            {
                maxLength = this.tuesday[i].length();
                maxString = this.tuesday[i];
            }
            if(this.wednesday[i].length() > maxLength)
            {
                maxLength = this.wednesday[i].length();
                maxString = this.wednesday[i];
            }
            if(this.thursday[i].length() > maxLength)
            {
                maxLength = this.thursday[i].length();
                maxString = this.thursday[i];
            }
            if(this.friday[i].length() > maxLength)
            {
                maxLength = this.friday[i].length();
                maxString = this.friday[i];
            }
        }
        for(int i=0;i<14;i++)
        {
            if(!this.monday[i].equals(""))
            {
                monday[i].setText(this.monday[i]);
                monday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));

                int finalI = i;
                monday[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        drawer.animateOpen();
                        text1.setText(monday[finalI].getText());
                        text2.setText(monPro[finalI]);
                    }
                });
            }
            else
            {
                monday[i].setText(maxString);
            }
            if(!this.tuesday[i].equals(""))
            {
                tuesday[i].setText(this.tuesday[i]);
                tuesday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));

                int finalI = i;
                tuesday[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        drawer.animateOpen();
                        text1.setText(tuesday[finalI].getText());
                        text2.setText(tuePro[finalI]);
                    }
                });
            }
            else
            {
                tuesday[i].setText(maxString);
            }
            if(!this.wednesday[i].equals(""))
            {
                wednesday[i].setText(this.wednesday[i]);
                wednesday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));

                int finalI = i;
                wednesday[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        drawer.animateOpen();
                        text1.setText(wednesday[finalI].getText());
                        text2.setText(wedPro[finalI]);
                    }
                });
            }
            else
            {
                wednesday[i].setText(maxString);
            }
            if(!this.thursday[i].equals(""))
            {
                thursday[i].setText(this.thursday[i]);
                thursday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));

                int finalI = i;
                thursday[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        drawer.animateOpen();
                        text1.setText(thursday[finalI].getText());
                        text2.setText(thuPro[finalI]);
                    }
                });
            }
            else
            {
                thursday[i].setText(maxString);
            }
            if(!this.friday[i].equals(""))
            {
                friday[i].setText(this.friday[i]);
                friday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));

                int finalI = i;
                friday[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        drawer.animateOpen();
                        text1.setText(friday[finalI].getText());
                        text2.setText(friPro[finalI]);
                    }
                });
            }
            else
            {
                friday[i].setText(maxString);
            }
            monday[i].resizeText();
            tuesday[i].resizeText();
            wednesday[i].resizeText();
            thursday[i].resizeText();
            friday[i].resizeText();
        }
    }
}