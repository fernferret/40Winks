package com.fernferret.fourtywinks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FourtyAlarmService extends Service {

	@Override
	public void onCreate() {
		// TODO: Actions to perform when service is created.
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO: Replace with service implementation.
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}

}
