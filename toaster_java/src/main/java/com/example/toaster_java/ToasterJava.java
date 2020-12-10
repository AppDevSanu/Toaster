package com.example.toaster_java;

import android.content.Context;
import android.widget.Toast;

public class ToasterJava {
    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
