package net.gdgmisantla.listaspersonalizadas;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class InformacionActivity extends Activity
{
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        TextView t2 = (TextView) findViewById(R.id.url_cine);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    //Lllamada al menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.informacion:
                Toast.makeText(InformacionActivity.this,"Pantalla Actual",Toast.LENGTH_LONG).show();
                return true;

            case R.id.cartelera:
                finish();
                startActivity(new Intent(this, MainActivity.class));
                return true;

            case R.id.salir:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void irtwitter(View view)
    {
        goToUrl ("http://www.twitter.com");
    }

    public void irfacebook(View view)
    {
        goToUrl ("http://www.facebook.com");
    }

    private void goToUrl (String url)
    {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}