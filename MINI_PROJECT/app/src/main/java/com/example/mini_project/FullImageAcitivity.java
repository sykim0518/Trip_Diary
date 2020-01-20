package com.example.mini_project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageAcitivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullimage);

        // Selected image
        Intent intent= getIntent();
        ListViewItem item = (ListViewItem) intent.getSerializableExtra("ITEM");

        ImageView imageView = (ImageView) findViewById(R.id.imageView_full);
        imageView.setImageURI(Uri.parse(item.getPath()));
    }

}