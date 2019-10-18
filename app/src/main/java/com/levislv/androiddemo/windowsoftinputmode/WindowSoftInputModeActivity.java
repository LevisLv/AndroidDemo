package com.levislv.androiddemo.windowsoftinputmode;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.levislv.androiddemo.R;

public class WindowSoftInputModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getIntent().getBooleanExtra("with_scroll", false) ? R.layout.activity_windowsoftinputmode_with_scroll : R.layout.activity_windowsoftinputmode_without_scroll);

        getWindow().setSoftInputMode(getIntent().getIntExtra("soft_input_adjust", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED));
    }
}
