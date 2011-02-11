package com.fernferret.fourtywinks;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SlidingDrawer;
import android.widget.SlidingDrawer.OnDrawerCloseListener;
import android.widget.SlidingDrawer.OnDrawerOpenListener;

public class FourtyWinks extends Activity {
    
	private SlidingDrawer mDrawer;
	private Resources mResources;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mResources = getResources();
        
        
        
        mDrawer = (SlidingDrawer) findViewById(R.id.quick_drawer);

        mDrawer.setOnDrawerOpenListener(new OnDrawerOpenListener() {
			
			@Override
			public void onDrawerOpened() {
				ImageView button = (ImageView) findViewById(R.id.quick_drawer_button);
				button.setImageDrawable(mResources.getDrawable(R.drawable.drawer_open));
			}
		});
	
		mDrawer.setOnDrawerCloseListener(new OnDrawerCloseListener() {

			@Override
			public void onDrawerClosed() {
				ImageView button = (ImageView) findViewById(R.id.quick_drawer_button);
				button.setImageDrawable(mResources.getDrawable(R.drawable.drawer_closed));
			}
		});
        
    }
}