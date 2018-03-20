package newg.com.leaveeasy;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.EditText;

import java.net.HttpURLConnection;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {

    EditText et_email;
    EditText et_password;
    Boolean isLoggedIn = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_login);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.activity_login);
        et_email = (EditText) findViewById(R.id.editText_email);
        et_password = (EditText)findViewById(R.id.editText_password);
    }

    private class login extends AsyncTask<String,Void,String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection urlConnection;
            try{
                URL url = new URL("");
                urlConnection = (HttpURLConnection)url.openConnection();
                urlConnection.connect();
                if(urlConnection.getResponseCode()==HttpURLConnection.HTTP_OK){
                    isLoggedIn = true;
                    //Save Session data if required or save email and password
                }
            }catch (Exception e){
                Log.e("Asynctask Login",e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }
}
