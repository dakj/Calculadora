package ar.com.honduras_kiva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        JsonObjectRequest jor = new JsonObjectRequest(
                // url
                "http://api.kivaws.org/v1/loans/newest.json",
                //json object
                null,
                //json object response listener.
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray loans = response.getJSONArray("loans");

                            JSONObject firstLoan = loans.getJSONObject(0);

                            text = firstLoan.getString("name") + " - " +firstLoan.getJSONObject("location").getString("country");

                            TextView tv = (TextView) findViewById(R.id.title);

                            tv.setText(text);

                            tv = (TextView) findViewById(R.id.body);
                            tv.setText(firstLoan.getString("use"));

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                //error listener
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //todo salio mal!!
                    }
                });
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jor);


    }
}
