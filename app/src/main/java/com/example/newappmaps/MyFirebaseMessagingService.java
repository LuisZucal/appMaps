package com.example.newappmaps;
import android.util.Log;


import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMessaging";

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);

        Log.d(TAG, "Token: " + token);

        // Utiliza el token como desees (enviarlo al servidor, almacenarlo localmente, etc.)
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        // Aquí puedes manejar la recepción de mensajes si lo deseas
    }
}

