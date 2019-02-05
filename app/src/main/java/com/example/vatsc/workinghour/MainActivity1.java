package com.example.vatsc.workinghour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity
{
EditText uname,pswrd;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        uname  =(EditText)findViewById(R.id.editText);
        pswrd = (EditText)findViewById(R.id.editText3);

    }
    public void getCheck(View view)
    {      String str1,str2;
            str1 = uname.getText().toString();
            str2  =pswrd.getText().toString();

        if(str1.equals("rajput") && str2.equals("1234"))
            Toast.makeText(getApplicationContext(), "correct LogIn" + str1, Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getApplicationContext(),"Incorrect Password or LogIn",Toast.LENGTH_LONG).show();
    }
    private  void TestUpload()

        {
            int i =1+1;
        }





}
