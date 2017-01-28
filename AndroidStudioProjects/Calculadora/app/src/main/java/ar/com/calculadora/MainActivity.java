package ar.com.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.R.xml;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {
    String message = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    Double num1,num2,resultado;
    String operador;



    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        num1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }


    public void onClickIgual(View miView)
    {
        setEnablePunto();
        TextView tv = (TextView) findViewById(R.id.screen) ;
        num2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= num1+num2;
        }
        else if(operador.equals("-"))
        {
            resultado= num1-num2;
        }
        else if(operador.equals("*"))
        {
            resultado= num1*num2;
        }
        else if(operador.equals("/"))
        {
            resultado= num1/num2;
        }
        tv.setText(resultado.toString());
    }

    public void onClickSuma(View miView)
    {
        setEnablePunto();
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
        setEnablePunto();
    }
    public void onClickMultiplicacion(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
        setEnablePunto();
    }
    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
        setEnablePunto();

    }

    public void onClickBtn1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickBtn2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickBtn3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickBtn4(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickBtn5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickBtn6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickBtn7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickBtn8(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickBtn9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickBtn0(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + "0");
    }
    public void onClickBtnPunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + ".");
        setDisablePunto();


    }
    public void setEnablePunto(){
        Button punto = (Button) findViewById(R.id.buttPunto);
        punto.setEnabled(true);

    }

    public void setDisablePunto(){
        Button punto = (Button) findViewById(R.id.buttPunto);
        punto.setEnabled(false);

    }


        public void onDEl(View v) {
            //Primero que nada, declaramos las variables.
            TextView cadena = (TextView) findViewById(R.id.screen);
           String cad = (String) cadena.getText();
           double cadi = Double.parseDouble(cad);

                cad = cad.substring(0, cad.length() - 1);
                int ca = Integer.parseInt(cad);

                TextView tv = (TextView) findViewById(R.id.screen);
                tv.setText(cad);



        }


        public void onClean (View v){

            TextView cadena = (TextView) findViewById(R.id.screen);
            cadena.setText(0);
        }




}
