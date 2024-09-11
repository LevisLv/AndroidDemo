package com.levislv.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.levislv.androiddemo.clipchildren.ClipChildrenActivity;
import com.levislv.androiddemo.fitssystemwindows.FitsSystemWindowsActivity;
import com.levislv.androiddemo.scrollbarstyle.ScrollbarStyleActivity;
import com.levislv.androiddemo.systemuivisibility.SystemUiVisibilityActivity;
import com.levislv.androiddemo.windowsoftinputmode.WindowSoftInputModeActivity;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_to_clipchildren).setOnClickListener(this);

        findViewById(R.id.btn_to_fitssystemwindows).setOnClickListener(this);

        findViewById(R.id.btn_to_scrollbarstyle).setOnClickListener(this);

        findViewById(R.id.btn_to_systemuivisibility).setOnClickListener(this);

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
        int id = v.getId();
        if (id == R.id.btn_to_clipchildren) {
            startActivity(new Intent(this, ClipChildrenActivity.class));
        } else if (id == R.id.btn_to_fitssystemwindows) {
            startActivity(new Intent(this, FitsSystemWindowsActivity.class));
        } else if (id == R.id.btn_to_scrollbarstyle) {
            startActivity(new Intent(this, ScrollbarStyleActivity.class));
        } else if (id == R.id.btn_to_systemuivisibility) {
            startActivity(new Intent(this, SystemUiVisibilityActivity.class));
        } else if (id == R.id.btn_00) {
            startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                    .putExtra("with_scroll", true)
                    .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED));
        } else if (id == R.id.btn_01) {
            startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                    .putExtra("with_scroll", false)
                    .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED));
        } else if (id == R.id.btn_10) {
            startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                    .putExtra("with_scroll", true)
                    .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE));
        } else if (id == R.id.btn_11) {
            startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                    .putExtra("with_scroll", false)
                    .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE));
        } else if (id == R.id.btn_20) {
            startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                    .putExtra("with_scroll", true)
                    .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN));
        } else if (id == R.id.btn_21) {
            startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                    .putExtra("with_scroll", false)
                    .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN));
        } else if (id == R.id.btn_30) {
            startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                    .putExtra("with_scroll", true)
                    .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING));
        } else if (id == R.id.btn_31) {
            startActivity(new Intent(this, WindowSoftInputModeActivity.class)
                    .putExtra("with_scroll", false)
                    .putExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING));
        }
    }
}
