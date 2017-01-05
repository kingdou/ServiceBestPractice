package com.example.servicebestpractice;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/2 0002.
 */
/*public class LongRunningService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent , int flags , int startId){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("LongRunningService","executed at"+ new Date().toString());
            }
        }).start();
        AlarmManager manager = (AlarmManager)getSystemService(ALARM_SERVICE);
        int anHour = 60 * 60 * 1000;
        long triggerAtTime = SystemClock.elapsedRealtime()+anHour;
        Intent i= new Intent(this, AlarmReceiver.class);
        PendingIntent pi= PendingIntent.getBroadcast(this,0,i,0);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, pi);
        return super.onStartCommand(intent,flags,startId);
    }
}*/
public class LongRunningService extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    /*public int onStartCommand(Intent intent, int flags ,int startId){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("LongRunningService","executed at"+ new Date().toString());
            }
        }).start();
        AlarmManager manager = (AlarmManager)getSystemService(ALARM_SERVICE);
        int anHour = 60* 60 *1000;
        long triggerAtTime = SystemClock.elapsedRealtime()+anHour;
        Intent i = new Intent(this , AlarmReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(this,0,i,0);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTime,pi);
        return super.onStartCommand(intent,flags,startId);
    }*/
/*    public int onstartCommand(Intent intent, int flags, int startId){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("LongRunningService","executed at"+new Date().toString());
            }
        }).start();
        AlarmManager manager = (AlarmManager)getSystemService(ALARM_SERVICE);
        int anHour = 60*60*1000;
        long triggerAtTime = SystemClock.elapsedRealtime() +anHour;
        Intent intent1= new Intent(this , AlarmReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(this,0,intent,0);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTime,pi);
        return super.onStartCommand(intent,flags,startId);
    }*/
   /* public int onStartCommand(Intent intent ,int flags, int startId){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("LongRunningService","ececuted at"+ new Date().toString());
            }
        }).start();
        AlarmManager manager = (AlarmManager)getSystemService(ALARM_SERVICE);
        int anHour = 60*60*1000;
        long triggerAtTinme = SystemClock.elapsedRealtime() +anHour;
        Intent intent1 = new Intent(this,AlarmReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(this , 0 ,intent ,0);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTinme,pi)
        return super.onStartCommand(intent , flags , startId);
    }*/
    /*public int onStartCommand(Intent intent , int flags ,int startId){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("LongRuunnigService","executed at "+new Date().toString());
            }
        }).start();
        AlarmManager manager = (AlarmManager)getSystemService(ALARM_SERVICE);
        int anhHour = 60 * 60*1000;
        long triggerAtTime = SystemClock.elapsedRealtime() + anhHour;
        Intent intent1 = new Intent(this , AlarmReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(this , 0 ,intent ,0);
        manager .set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTime,pi);
        return super.onStartCommand(intent,flags,startId);
    }*/
    public int onStartCommand(Intent intent ,int flags , int startId){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("LongRunningService","execute at"+new Date().toString());
            }
        }).start();
        AlarmManager manager = (AlarmManager)getSystemService(ALARM_SERVICE);
        int anHour = 60*60*1000;
        long triggerAtTime =SystemClock.elapsedRealtime()+anHour;
        Intent intent2 = new Intent(this , AlarmReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(this ,0,intent2,0);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTime,pi);
        return onStartCommand(intent ,flags ,startId);

    }
}