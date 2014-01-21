package com.gurgel.mapas;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	MenuInflater menuInflater = getMenuInflater();
    	menuInflater.inflate(R.menu.main, menu);
        //getMenuInflater().inflate(R.menu.main, menu);
    	overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
		case R.id.action_mapa:
			mostrarMapa();
			return true;
		

		default:
			return super.onOptionsItemSelected(item);
		}
    	
    	
    }
    
    
    public void mostrarMapa(){
    	Intent  i =  new Intent(this,MapaActivity.class);
    	startActivity(i);
    	overridePendingTransition(R.anim.rotatein, R.anim.rotatein);

    	
    }
    
    
}
