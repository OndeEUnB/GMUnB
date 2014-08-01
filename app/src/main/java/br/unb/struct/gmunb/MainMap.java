package br.unb.struct.gmunb;

/**
 * Created by Fraps on 30/07/2014.
 */

import java.text.DecimalFormat;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View;


//Menu Principal
public class MainMap extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        //Doing he Instance
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa_principal);

        Button indice = (Button) findViewById(R.id.indice);
        indice.setBackgroundResource(R.drawable.bt_botoes2_anim);
        indice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View mapa) {
                finish();
                startActivity(new Intent(MainMap.this, Indice.class));
                //Efeito de Transição
                overridePendingTransition(R.anim.move_left, 0);
            }
        });


    }


    //Resolve Memory Leak App
    //Override the onKeyDown method
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        //replaces the default 'Back' button action
        if(keyCode==KeyEvent.KEYCODE_BACK)
        {
            //do whatever you want the 'Back' button to do
            //as an example the 'Back' button is set to start a new Activity named 'NewActivity'
            finish();
            this.startActivity(new Intent(MainMap.this,MainMenu.class));
        }
        return true;
    }

}