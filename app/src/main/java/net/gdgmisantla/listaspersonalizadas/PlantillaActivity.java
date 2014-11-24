package net.gdgmisantla.listaspersonalizadas;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlantillaActivity extends Activity
{
    TextView nombre;
    TextView hora;
    TextView sinopsis;
    String url_video;
    ImageView foto;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla);

        nombre = (TextView) findViewById(R.id.nombre);
        hora = (TextView) findViewById(R.id.horario);
        sinopsis = (TextView) findViewById(R.id.sinopsis);
        foto = (ImageView)findViewById(R.id.foto);

        Bundle extras = this.getIntent().getExtras();

        nombre.setText(extras.getString("titulo"));
        hora.setText(extras.getString("horario"));
        sinopsis.setText(extras.getString("sinopsis"));
        foto.setImageDrawable(getResources().getDrawable(extras.getInt("foto")));
        url_video = extras.getString("url_video");
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
                finish();
                startActivity(new Intent(this, InformacionActivity.class));
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

    public void irtrailer(View view)
    {
        goToUrl (url_video);
    }

    private void goToUrl (String url)
    {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void volver (View view)
    {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }
}