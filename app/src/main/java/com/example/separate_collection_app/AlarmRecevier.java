package com.example.separate_collection_app;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class AlarmRecevier extends BroadcastReceiver {
    public AlarmRecevier(){ }

        NotificationManager manager;
        NotificationCompat.Builder builder;

        private static String CHNNER_ID = "channel_id";
        private static String CHANNEL_NAME = "channel_name";


    @Override
    public void onReceive(Context context, Intent intent) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);

        builder = null;
        manager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            manager.createNotificationChannel(
                    new NotificationChannel(CHNNER_ID,CHANNEL_NAME,NotificationManager.IMPORTANCE_DEFAULT)
            );
            builder = new NotificationCompat.Builder(context,CHNNER_ID);
        }else {
            builder = new NotificationCompat.Builder(context);
        }

        Intent intent2 = new Intent(context,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context,101,intent2,PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setSmallIcon(R.drawable.ic_baseline_circle_notifications_24);
        builder.setAutoCancel(true);
        builder.setContentText("오늘은 분리수거 요일입니다.\n지구를위해 올바른 분리수거를 실천합시다.");
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText("오늘은 분리수거 요일입니다.\n지구를위해 올바른 분리수거를 실천합시다.")).setPriority(Notification.PRIORITY_DEFAULT);
       
        builder.setContentIntent(pendingIntent);

        Notification notification = builder.build();
        manager.notify(1,notification);

    }
}
