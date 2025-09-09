package com.example.my_first_app;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"OnCreate Method Called", Toast.LENGTH_LONG);
        t.show();
    }
    protected void onStart() {
        super.onStart();
        Toast t = Toast.makeText(getApplicationContext(),"OnStart Method Called", Toast.LENGTH_LONG);
        t.show();
    }
    protected void onResume() {
        super.onResume();
        Toast t = Toast.makeText(getApplicationContext(),"OnResume Method Called", Toast.LENGTH_LONG);
        t.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast t = Toast.makeText(getApplicationContext(),"OnRestart Method Called", Toast.LENGTH_LONG);
        t.show();
    }
    protected void onPause() {
        super.onPause();
        Toast t = Toast.makeText(getApplicationContext(),"OnPause Method Called", Toast.LENGTH_LONG);
        t.show();
    }
    protected void onStop(){
        super.onStop();
        Toast t = Toast.makeText(getApplicationContext(),"OnStop Method Called", Toast.LENGTH_LONG);
        t.show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast t = Toast.makeText(getApplicationContext(),"OnDestroy Method Called", Toast.LENGTH_LONG);
        t.show();
    }
}