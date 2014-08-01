package br.unb.struct.gmunb;

/**
 * Created by Fraps on 31/07/2014.
 */

import android.app.Activity;
import android.os.Bundle;
import br.unb.struct.gmunb.R.id;


public class Build_Predio extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa_especifico);

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(id.imageView);
        imageView.setImageAsset("icc_centro_ss.png");
        /*
        //Pega o numero de pavimentos
        final int pavimento = getIntent().getIntExtra("pavimento",1);
        //Pega a informação do prédio
        final int info_predio = getIntent().getIntExtra("info_predio",1);
        */
        //PreparaXML(info_predio,pavimento);

    }

  /*  private void PreparaXML (int info_predio, int pavimento){
        int i,j;
        //Escolhe a opção correspondente ao prédio
        switch(info_predio){
            //ICC - Sul
            case 1:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        mapa.setImageResource(R.drawable.icc_sul_ss);

                    //Térreo
                    case 2:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<7;j++){
                                s.append("<td> <img src=\"file:///android_asset/icc_sul/ter/icc_sul_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 3:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/icc_sul/pav1/icc_sul_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;*/
                }/*
                break;
            //ICC - Centro
            case 2:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<7;j++){
                                s.append("<td> <img src=\"file:///android_asset/icc_centro/ss/icc_centro_ss-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Térreo
                    case 2:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<9;j++){
                                s.append("<td> <img src=\"file:///android_asset/icc_centro/ter/icc_centro_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 3:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<7;j++){
                                s.append("<td> <img src=\"file:///android_asset/icc_centro/pav1/icc_centro_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //ICC - Norte
            case 3:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<7;j++){
                                s.append("<td> <img src=\"file:///android_asset/icc_norte/ss/icc_norte_ss-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Térreo
                    case 2:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/icc_norte/ter/icc_norte_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 3:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/icc_norte/pav1/icc_norte_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //FA
            case 4:
                switch(pavimento){
                    //Térreo
                    case 1:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<4;j++){
                                s.append("<td> <img src=\"file:///android_asset/fa/ter/fa_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 2:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<4;j++){
                                s.append("<td> <img src=\"file:///android_asset/fa/pav1/fa_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //FE
            case 5:
                switch(pavimento){
                    //Prédio 1
                    case 1:
                        for(i=1;i<3;i++){
                            s.append("<tr>");
                            for(j=1;j<4;j++){
                                s.append("<td> <img src=\"file:///android_asset/fe/fe1/fe1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Prédio 2 SS
                    case 2:
                        for(i=1;i<2;i++){
                            s.append("<tr>");
                            for(j=1;j<3;j++){
                                s.append("<td> <img src=\"file:///android_asset/fe/fe2_0/fe2_0-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Prédio 2 TER
                    case 3:
                        for(i=1;i<3;i++){
                            s.append("<tr>");
                            for(j=1;j<4;j++){
                                s.append("<td> <img src=\"file:///android_asset/fe/fe2_1/fe2_1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Prédio 3
                    case 4:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<6;j++){
                                s.append("<td> <img src=\"file:///android_asset/fe/fe3/fe3-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //FMFS
            case 6:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        for(i=1;i<3;i++){
                            s.append("<tr>");
                            for(j=1;j<9;j++){
                                s.append("<td> <img src=\"file:///android_asset/fs/ss/fs_ss-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Térreo
                    case 2:
                        for(i=1;i<5;i++){
                            s.append("<tr>");
                            for(j=1;j<6;j++){
                                s.append("<td> <img src=\"file:///android_asset/fs/ter/fs_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 3:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/fs/pav1/fs_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //2º Andar
                    case 4:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<14;j++){
                                s.append("<td> <img src=\"file:///android_asset/fs/pav2/fs_pav2-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //IB
            case 7:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/ib/ss/ib_ss-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Térreo
                    case 2:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<7;j++){
                                s.append("<td> <img src=\"file:///android_asset/ib/ter/ib_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    /********************************************FAltando Planta feita
                     * faltando planta feita
                     * faltando planta feita
                     * faltando planta feita
                     * faltando planta feita
                     /
                    //1º Andar
                    case 3:
                        s.append("<img src=\"file:///android_asset/ib_pav1.png\" />");
                        s.append("</body>");
                        s.append("</html>");
                        view.loadDataWithBaseURL(null, s.toString(), "text/html", "UTF-8", null);
                        view.setInitialScale(100);
                        break;
                }
                break;

            //IQ
            case 8:
                switch(pavimento){
                    //Térreo
                    case 1:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<7;j++){
                                s.append("<td> <img src=\"file:///android_asset/iq/ter/iq_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 2:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<6;j++){
                                s.append("<td> <img src=\"file:///android_asset/iq/pav1/iq_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //PAT
            case 9:
                switch(pavimento){
                    //Térreo
                    case 1:
                        for(i=1;i<3;i++){
                            s.append("<tr>");
                            for(j=1;j<7;j++){
                                s.append("<td> <img src=\"file:///android_asset/pat/pat-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //PJC
            case 10:
                switch(pavimento){
                    //Térreo
                    case 1:
                        for(i=1;i<3;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/pjc/pjc-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
		/*	//PMU I
			case 11:
				switch(pavimento){
					//Térreo
					case 1:
						   s.append("<img src=\"file:///android_asset/pmu1_ter.png\" />");
						   s.append("</body>");
						   s.append("</html>");
						   view.loadDataWithBaseURL(null, s.toString(), "text/html", "UTF-8", null);
						   view.setInitialScale(100);
						break;
					//1º Andar
					case 2:
						   s.append("<img src=\"file:///android_asset/pmu1_pav1.png\" />");
						   s.append("</body>");
						   s.append("</html>");
						   view.loadDataWithBaseURL(null, s.toString(), "text/html", "UTF-8", null);
						   view.setInitialScale(100);
						break;
				}
				break;
			//PMU II
			case 12:
				switch(pavimento){
					//Térreo
					case 1:
						   s.append("<img src=\"file:///android_asset/pmu2_ter.png\" />");
						   s.append("</body>");
						   s.append("</html>");
						   view.loadDataWithBaseURL(null, s.toString(), "text/html", "UTF-8", null);
						   view.setInitialScale(100);
						break;
					//1º Andar
					case 2:
						   s.append("<img src=\"file:///android_asset/pmu2_pav1.png\" />");
						   s.append("</body>");
						   s.append("</html>");
						   view.loadDataWithBaseURL(null, s.toString(), "text/html", "UTF-8", null);
						   view.setInitialScale(100);
						break;
				}
				break;
			/
            //BCE
            case 13:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/bce/ss/bce_ss-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Térreo
                    case 2:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/bce/ter/bce_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 3:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/bce/pav1/bce_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //FT
            case 14:
                switch(pavimento){
                    //Térreo
                    case 1:
                        for(i=1;i<5;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/ft/ter/ft_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 2:
                        for(i=1;i<5;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/ft/pav1/ft_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;
            //Reitoria
            case 15:
                switch(pavimento){
                    //Subsolo
                    case 1:
                        for(i=1;i<3;i++){
                            s.append("<tr>");
                            for(j=1;j<5;j++){
                                s.append("<td> <img src=\"file:///android_asset/ret/ss/rt_ss-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //Térreo
                    case 2:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<5;j++){
                                s.append("<td> <img src=\"file:///android_asset/ret/ter/rt_ter-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //1º Andar
                    case 3:
                        for(i=1;i<6;i++){
                            s.append("<tr>");
                            for(j=1;j<8;j++){
                                s.append("<td> <img src=\"file:///android_asset/ret/pav1/rt_pav1-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //2º Andar
                    case 4:
                        for(i=1;i<4;i++){
                            s.append("<tr>");
                            for(j=1;j<6;j++){
                                s.append("<td> <img src=\"file:///android_asset/ret/pav2/rt_pav2-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                    //3º Andar
                    case 5:
                        for(i=1;i<3;i++){
                            s.append("<tr>");
                            for(j=1;j<5;j++){
                                s.append("<td> <img src=\"file:///android_asset/ret/pav3/rt_pav3-" + i + "-" + j + ".png\" /> </td>");
                            }
                            s.append("</tr>");
                        }
                        break;
                }
                break;/
        }
    }
}
*/
