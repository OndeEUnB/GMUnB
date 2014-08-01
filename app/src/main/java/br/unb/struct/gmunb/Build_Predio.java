package br.unb.struct.gmunb;

/**
 * Created by Fraps on 31/07/2014.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

import br.unb.struct.gmunb.R.id;


public class Build_Predio extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa_especifico);

        //Pega o numero de pavimentos
        final int pavimento = getIntent().getIntExtra("pavimento",1);
        //Pega a informação do prédio
        final int info_predio = getIntent().getIntExtra("info_predio",1);

        PreparaXML(info_predio,pavimento);

    }

    private void PreparaXML (int info_predio, int pavimento){
        int i,j;
        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(id.imageView);
        //Escolhe a opção correspondente ao prédio
        switch(info_predio){
            //ICC - Sul
            case 1:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        imageView.setImageAsset("ICC/Sul/icc_sul_ss.png");
                        break;
                    //Térreo
                    case 2:
                        imageView.setImageAsset("ICC/Sul/icc_sul_ter.png");
                        break;
                    //1º Andar
                    case 3:
                        imageView.setImageAsset("ICC/Sul/icc_sul_pav1.png");
                        break;
                }
                break;
            //ICC - Centro
            case 2:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        imageView.setImageAsset("ICC/Centro/icc_centro_ss.png");
                        break;
                    //Térreo
                    case 2:
                        imageView.setImageAsset("ICC/Centro/icc_centro_ter.png");
                        break;
                    //1º Andar
                    case 3:
                        imageView.setImageAsset("ICC/Centro/icc_centro_pav1.png");
                        break;
                }
                break;
            //ICC - Norte
            case 3:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        imageView.setImageAsset("ICC/Norte/icc_norte_ss.png");
                        break;
                    //Térreo
                    case 2:
                        imageView.setImageAsset("ICC/Norte/icc_norte_ter.png");
                        break;
                    //1º Andar
                    case 3:
                        imageView.setImageAsset("ICC/Norte/icc_norte_pav1.png");
                        break;
                }
                break;
            //FA
            case 4:
                switch(pavimento){
                    //Térreo
                    case 1:
                        imageView.setImageAsset("FA/fa_ter.png");
                        break;
                    //1º Andar
                    case 2:
                        imageView.setImageAsset("FA/fa_pav1.png");
                        break;
                }
                break;
            //FE
            case 5:
                switch(pavimento){
                    //Prédio 1
                    case 1:
                        imageView.setImageAsset("FE/fe_1_ter.png");
                        break;
                    //Prédio 2 SS
                    case 2:
                        imageView.setImageAsset("FE/fe_3_ss.png");
                        break;
                    //Prédio 2 TER
                    case 3:
                        imageView.setImageAsset("FE/fe_3_ter.png");
                        break;
                    //Prédio 3
                    case 4:
                        imageView.setImageAsset("FE/fe_5_ter.png");
                        break;
                }
                break;
            //FMFS
            case 6:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        imageView.setImageAsset("FS/fs_ss.png");
                        break;
                    //Térreo
                    case 2:
                        imageView.setImageAsset("FS/fs_ter.png");
                        break;
                    //1º Andar
                    case 3:
                        imageView.setImageAsset("FS/fs_pav1.png");
                        break;
                    //2º Andar
                    case 4:
                        imageView.setImageAsset("FS/fs_pav2.png");
                        break;
                }
                break;

            // TODO  Colocar plantas do IB
            /*//IB
            case 7:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        imageView.setImageAsset("IB/ib_ss.png");
                        break;
                    //Térreo
                    case 2:
                        imageView.setImageAsset("IB/ib_ter.png");
                        break;
                    case 3:
                        imageView.setImageAsset("IB/ib_pav1.png");
                        break;
                }
                break;
            */
            //IQ
            case 8:
                switch(pavimento){
                    //Térreo
                    case 1:
                        imageView.setImageAsset("IQ/iq_ter.png");
                        break;
                    //1º Andar
                    case 2:
                        imageView.setImageAsset("IQ/iq_pav1.png");
                        break;
                }
                break;
            //PAT
            case 9:
                switch(pavimento){
                    case 1:
                        imageView.setImageAsset("PAT/pat.png");
                        break;
                }
                break;
            //PJC
            case 10:
                switch(pavimento){
                    //Térreo
                    case 1:
                        imageView.setImageAsset("PJC/pjc.png");
                        break;
                }
                break;
			//PMU I
			case 11:
				switch(pavimento){
					//Térreo
					case 1:
                        imageView.setImageAsset("PMU I/pmu1_ter.png");
                        break;
					//1º Andar
					case 2:
                        imageView.setImageAsset("PMU I/pmu1_pav1.png");
                        break;
				}
				break;
			//PMU II
			case 12:
				switch(pavimento){
					//Térreo
					case 1:
                        imageView.setImageAsset("PMU II/pmu2_ter.png");
                        break;
					//1º Andar
					case 2:
                        imageView.setImageAsset("PMU II/pmu2_pav1.png");
                        break;
				}
				break;
            //BCE
            case 13:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        imageView.setImageAsset("BCE/bce_ss1.png");
                        break;
                    //Térreo
                    case 2:
                        imageView.setImageAsset("BCE/bce_ter.png");
                        break;
                    //1º Andar
                    case 3:
                        imageView.setImageAsset("BCE/bce_pav1.png");
                        break;
                }
                break;
            //FT
            case 14:
                switch(pavimento){
                    //Térreo
                    case 1:
                        imageView.setImageAsset("FT/ft_ter.png");
                        break;
                    //1º Andar
                    case 2:
                        imageView.setImageAsset("FT/ft_pav1.png");
                        break;
                }
                break;
            //Reitoria
            case 15:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        imageView.setImageAsset("Reitoria/rt_ss.png");
                        break;
                    //Térreo
                    case 2:
                        imageView.setImageAsset("Reitoria/rt_ter.png");
                        break;
                    //1º Andar
                    case 3:
                        imageView.setImageAsset("Reitoria/rt_pav1.png");
                        break;
                    //2º Andar
                    case 4:
                        imageView.setImageAsset("Reitoria/rt_pav2.png");
                        break;
                    //3º Andar
                    case 5:
                        imageView.setImageAsset("Reitoria/rt_pav3.png");
                        break;
                }
                break;
        }
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
        }
        return true;
    }
}