package com.msum.csis365.androidkotlinnotifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createNotificationChannel()

        // TODO - Step 5 - Send the Notification when the Floating Action Button is clicked

    }

    private fun createNotificationChannel() {
        // TODO - Step 2 - Create a Notification Channel

        // TODO - Step 3 - Retrieve the Notification Manager System Service

    }

    private fun buildNotification() {
        // TODO - Step 4 - Build a Notification

    }
}
