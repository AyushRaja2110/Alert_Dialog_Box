package com.example.alertbox;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class onpressed extends AppCompatActivity {
    public void OnBackPrassed(View view) {
        new AlertDialog.Builder(onpressed.this)
                .setIcon(R.drawable.alert)
                .setTitle("Exit..")
                .setMessage("Are you want to exit")

                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })

                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })

                .setNeutralButton("help", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(onpressed.this, "Yes yo exit..", Toast.LENGTH_LONG).show();
                    }
                }).show();
    }
}
