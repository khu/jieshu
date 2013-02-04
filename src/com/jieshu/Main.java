package com.jieshu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.zxing.client.android.CaptureActivity;

public class Main extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(getApplicationContext(), CaptureActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                String contents = data.getStringExtra("SCAN_RESULT"); //this is the result
            } else
            if (resultCode == RESULT_CANCELED) {
                // Handle cancel
            }
        }
    }
}
