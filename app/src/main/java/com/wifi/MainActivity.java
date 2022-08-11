package com.wifi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.utility.WF_VCodec;
import com.wifi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        /*input*/ byte[] pAVData = new byte[40000];
        /*input*/ int DataLen = 150 ;
        /*out*/ byte[] out_yuv420 = new byte[31300];
        /*out*/ int out_yuv420ByteSize =0;
        /*out*/ int out_picture_width =0;
        /*out*/ int out_picture_heigh = 0;
        // Example of a call to a native method
        WF_VCodec w = new WF_VCodec();

        ((TextView)findViewById(R.id.sample_test)).setText(String.valueOf(
                w.WFVC_Decode(  pAVData, DataLen, out_yuv420, out_yuv420ByteSize,out_picture_width,out_picture_heigh)
        ));
        ((TextView)findViewById(R.id.sample_close)).setText(String.valueOf(out_yuv420ByteSize));

    }



}