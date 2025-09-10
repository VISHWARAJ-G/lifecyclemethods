# Ex.No:1 To create a HelloWorld Activity using all lifecycles methods to display messages.


## AIM:

To create a HelloWorld Activity using all lifecycles methods to display messages using Android Studio.

## EQUIPMENTS REQUIRED:

Latest Version Android Studio

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as HelloWorld and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Display message give in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
```
/*
Program to print the text “Hello World”.
Developed by: Vishwaraj G.  
Registeration Number : 212223220125
*/

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
```

## OUTPUT
#### Oncreate Popup
![alt text](<Output Images/OnCreate_Image.jpg>)
#### OnStart Popup
![alt text](<Output Images/OnStart_Image.jpg>)
#### OnResume Popup
![alt text](<Output Images/OnResume_Image.jpg>)
#### OnRestart Popup
![alt text](<Output Images/OnRestart_Image.jpg>)
#### OnStop Popup
![alt text](<Output Images/OnStop_Image.jpg>)
#### OnPause Popup
![alt text](<Output Images/OnPause_Image.jpg>)
#### OnDestroy Popup
![alt text](<Output Images/OnDestroy_Image.jpg>)



## RESULT
Thus a Simple Android Application create a HelloWorld Activity using all lifecycles methods to display messages using Android Studio is developed and executed successfully.
