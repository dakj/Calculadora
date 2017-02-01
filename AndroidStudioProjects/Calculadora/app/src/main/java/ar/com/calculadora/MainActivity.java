package ar.com.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    Double num1,num2, result;
    String operator;



    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        num1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }


    public void onClickIgual(View miView)
    {
        setEnablePoint();
        TextView tv = (TextView) findViewById(R.id.screen) ;
        String si = (String) tv.getText();

        if(si.equals("")){

        }else {
            num2 = Double.parseDouble(tv.getText().toString());
            if (num2.equals(0) && operator.equals("/")) {
                tv.setText("Error");
            }
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }
            tv.setText(result.toString());
        }
    }

    public void onSum(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen);
        String a = (String) tv.getText();
        if(a.equals("")) {

        }
        else {
            operator = "+";
            onClickOperacionCapturaNumero1(miView);
            setEnablePoint();
        }
    }
    public void onRest(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen);
        String a = (String) tv.getText();
        if(a.equals("")) {

        }
        else {
            operator = "-";
            onClickOperacionCapturaNumero1(miView);
            setEnablePoint();
        }
    }
    public void onMultiplication(View miView)
    {
       TextView tv = (TextView) findViewById(R.id.screen);
        String a = (String) tv.getText();
        if(a.equals("")) {

        }
       else {
            operator = "*";
            onClickOperacionCapturaNumero1(miView);
            setEnablePoint();
         }
        }
    public void onDivision(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen);
        String a = (String) tv.getText();
        if(a.equals("")) {

        }
        else {
            operator = "/";
            onClickOperacionCapturaNumero1(miView);
            setEnablePoint();
        }

    }

    public void onClickBtn1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt1));
    }
    public void onClickBtn2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt2));
    }
    public void onClickBtn3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt3));
    }
    public void onClickBtn4(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt4));
    }
    public void onClickBtn5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt5));
    }
    public void onClickBtn6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt6));
    }
    public void onClickBtn7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt7));
    }
    public void onClickBtn8(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt8));
    }
    public void onClickBtn9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt9));
    }
    public void onClickBtn0(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.butt0));
    }
    public void onClickBtnPoint(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.screen) ;
        tv.setText(tv.getText() + getString(R.string.buttPunto));
        setDisablePoint();


    }
    public void setEnablePoint(){
        Button punto = (Button) findViewById(R.id.buttPunto);
        punto.setEnabled(true);

    }

    public void setDisablePoint(){
        Button punto = (Button) findViewById(R.id.buttPunto);
        punto.setEnabled(false);

    }


    public void onClean (View v){

                num1 = 0.0;
                num2 = 0.0;
            TextView tv = (TextView) findViewById(R.id.screen);
            tv.setText("");
        }




}
