package com.levislv.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.levislv.androiddemo.fitssystemwindows.FitsSystemWindowsActivity;
import com.levislv.androiddemo.windowsoftinputmode.WindowSoftInputModeActivity;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_to_fitssystemwindows).setOnClickListener(this);

        findViewById(R.id.btn_00).setOnClickListener(this);
        findViewById(R.id.btn_01).setOnClickListener(this);
        findViewById(R.id.btn_10).setOnClickListener(this);
        findViewById(R.id.btn_11).setOnClickListener(this);
        findViewById(R.id.btn_20).setOnClickListener(this);
        findViewById(R.id.btn_21).setOnClickListener(this);
        findViewById(R.id.btn_30).setOnClickListener(this);
        findViewById(R.id.btn_31).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_to_fitssystemwindows:
                startActivity(new Intent(this, FitsSystemWindowsActivity.class));
                break;

            case R.id.btn_00:
                startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                        .putExtra("with_scroll", true)
                        .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED));
                break;
            case R.id.btn_01:
                startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                        .putExtra("with_scroll", false)
                        .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED));
                break;
            case R.id.btn_10:
                startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                        .putExtra("with_scroll", true)
                        .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE));
                break;
            case R.id.btn_11:
                startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                        .putExtra("with_scroll", false)
                        .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE));
                break;
            case R.id.btn_20:
                startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                        .putExtra("with_scroll", true)
                        .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN));
                break;
            case R.id.btn_21:
                startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                        .putExtra("with_scroll", false)
                        .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN));
                break;
            case R.id.btn_30:
                startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                        .putExtra("with_scroll", true)
                        .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING));
                break;
            case R.id.btn_31:
                startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                        .putExtra("with_scroll", false)
                        .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING));
                break;
            default:

                break;
        }
    }
}
