package calc.calculator;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
/**
 * Created by shyam on 12/7/2017.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
      /*  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    */}

    public void onClick(View view)
    {
        Intent i;
        if(view.getId()==R.id.button1)
        {
            i=new Intent(this,StandardCal.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button)
        {
            i=new Intent(this,ScientificCal.class);
            startActivity(i);
        }
       /* else if(view.getId()==R.id.button2)
        {
            i=new Intent(this,BinaryCal.class);
            startActivity(i);
        }*/
        else if(view.getId()==R.id.button3)
        {
            i=new Intent(this,PrefixCal.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button4)
        {
            i=new Intent(this,PostfixCal.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button5)
        {
            i=new Intent(this,InfixCal.class);
            startActivity(i);
        }
    }
}
