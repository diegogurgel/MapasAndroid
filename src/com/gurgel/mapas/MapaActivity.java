package com.gurgel.mapas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mapa);
	    //getActionBar().setDisplayHomeAsUpEnabled(true);
		
	    // If your minSdkVersion is 11 or higher, instead use:
	    getActionBar().setDisplayHomeAsUpEnabled(true);
	}
}
