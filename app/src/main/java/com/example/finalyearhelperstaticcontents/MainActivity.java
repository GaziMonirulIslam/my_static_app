package com.example.finalyearhelperstaticcontents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ram(View view) {

        Intent i = new Intent(getApplicationContext(),LaptopRamGuide.class);
        startActivity(i);
    }

    public void processor(View view) {

        Intent i = new Intent(getApplicationContext(),LaptopProcessorGuide.class);
        startActivity(i);

    }

    public void storage(View view) {

        Intent i = new Intent(getApplicationContext(),LaptopStorageGuide.class);
        startActivity(i);

    }

    public void ports(View view) {

        Intent i = new Intent(getApplicationContext(),LaptopPortsGuide.class);
        startActivity(i);

    }


    public void platform(View view) {

        Intent i = new Intent(getApplicationContext(),LaptopPlatformGuide.class);
        startActivity(i);

    }


    public void display(View view) {

        Intent i1 = new Intent(getApplicationContext(),LaptopDisplayAndGraphicsGuide.class);
        startActivity(i1);
    }

    public void screensize(View view) {

        Intent i1 = new Intent(getApplicationContext(),LaptopScreenSizeGuide.class);
        startActivity(i1);
    }

    public void smartphoneprocessor(View view) {

        Intent i1 = new Intent(getApplicationContext(),SmartphoneProcessorGuide.class);
        startActivity(i1);
    }

    public void smartphonedisplay(View view) {


        Intent i1 = new Intent(getApplicationContext(),SmartphoneDisplayGuide.class);
        startActivity(i1);
    }

    public void smartphonecamera(View view) {

        Intent i1 = new Intent(getApplicationContext(),SmartphoneCameraGuide.class);
        startActivity(i1);
    }

    public void smartphonebattery(View view) {

        Intent i1 = new Intent(getApplicationContext(),SmartphoneBatteryGuide.class);
        startActivity(i1);
    }

    public void smartphonerom(View view) {

        Intent i1 = new Intent(getApplicationContext(),SmartphoneRomGuide.class);
        startActivity(i1);
    }

    public void smartphoneram(View view) {

        Intent i1 = new Intent(getApplicationContext(),SmartphoneRamGuide.class);
        startActivity(i1);
    }

    public void tvconnectivity(View view) {

        Intent i1 = new Intent(getApplicationContext(),TvConnectivityGuide.class);
        startActivity(i1);
    }

    public void tvsound(View view) {

        Intent i1 = new Intent(getApplicationContext(),TvSoundGuide.class);
        startActivity(i1);
    }

    public void tvsmarttv(View view) {

        Intent i1 = new Intent(getApplicationContext(),TvSmartTvGuide.class);
        startActivity(i1);
    }

    public void tvscreensize(View view) {

        Intent i1 = new Intent(getApplicationContext(),TvScreenSizeGuide.class);
        startActivity(i1);
    }

    public void tvdisplay(View view) {

        Intent i1 = new Intent(getApplicationContext(),TvDisplayTypeGuide.class);
        startActivity(i1);
    }

    public void tvbasic(View view) {

        Intent i1 = new Intent(getApplicationContext(),TvBasicGuide.class);
        startActivity(i1);
    }
}
