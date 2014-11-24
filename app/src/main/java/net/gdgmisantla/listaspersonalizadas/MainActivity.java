package net.gdgmisantla.listaspersonalizadas;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends ListActivity
{
    private MyAdapter mAdapter = null;

    public class Node
    {
        public String mTitle;
        public Integer mImageResource;
        public String mhorario;
        public String medades;
    }

    private static ArrayList<Node> mArray = new ArrayList<Node>();

    private void setData()
    {
        mArray.clear();

        // Pelicula0...
        Node mynode0 = new Node();
        mynode0.mTitle = this.getResources().getString(R.string.title0);
        mynode0.mImageResource = R.drawable.flight3d; //Aqui me creo las imagenes
        mynode0.mhorario = this.getResources().getString(R.string.horario0);
        mynode0.medades = this.getResources().getString(R.string.edades0);
        mArray.add(mynode0);

        // Pelicula1...
        Node mynode1 = new Node();
        mynode1.mTitle = this.getResources().getString(R.string.title1);
        mynode1.mImageResource = R.drawable.laboheme; //Aqui me creo las imagenes
        mynode1.mhorario = this.getResources().getString(R.string.horario1);
        mynode1.medades = this.getResources().getString(R.string.edades1);
        mArray.add(mynode1);

        // Pelicula2...
        Node mynode2 = new Node();
        mynode2.mTitle = this.getResources().getString(R.string.title2);
        mynode2.mImageResource = R.drawable.esmeralda; //Aqui me creo las imagenes
        mynode2.mhorario = this.getResources().getString(R.string.horario2);
        mynode2.medades = this.getResources().getString(R.string.edades2);
        mArray.add(mynode2);

        // Pelicula3...
        Node mynode3 = new Node();
        mynode3.mTitle = this.getResources().getString(R.string.title3);
        mynode3.mImageResource = R.drawable.la_flauta; //Aqui me creo las imagenes
        mynode3.mhorario = this.getResources().getString(R.string.horario3);
        mynode3.medades = this.getResources().getString(R.string.edades3);
        mArray.add(mynode3);

        // Pelicula4...
        Node mynode4 = new Node();
        mynode4.mTitle = this.getResources().getString(R.string.title4);
        mynode4.mImageResource = R.drawable.friends; //Aqui me creo las imagenes
        mynode4.mhorario = this.getResources().getString(R.string.horario4);
        mynode4.medades = this.getResources().getString(R.string.edades4);
        mArray.add(mynode4);

        // Pelicula5...
        Node mynode5 = new Node();
        mynode5.mTitle = this.getResources().getString(R.string.title5);
        mynode5.mImageResource = R.drawable.jack; //Aqui me creo las imagenes
        mynode5.mhorario = this.getResources().getString(R.string.horario5);
        mynode5.medades = this.getResources().getString(R.string.edades5);
        mArray.add(mynode5);

        // Pelicula6...
        Node mynode6 = new Node();
        mynode6.mTitle = this.getResources().getString(R.string.title6);
        mynode6.mImageResource = R.drawable.spring; //Aqui me creo las imagenes
        mynode6.mhorario = this.getResources().getString(R.string.horario6);
        mynode6.medades = this.getResources().getString(R.string.edades6);
        mArray.add(mynode6);

        // Pelicula7...
        Node mynode7 = new Node();
        mynode7.mTitle = this.getResources().getString(R.string.title7);
        mynode7.mImageResource = R.drawable.periodico; //Aqui me creo las imagenes
        mynode7.mhorario = this.getResources().getString(R.string.horario7);
        mynode7.medades = this.getResources().getString(R.string.edades7);
        mArray.add(mynode7);

        // Pelicula8...
        Node mynode8 = new Node();
        mynode8.mTitle = this.getResources().getString(R.string.title8);
        mynode8.mImageResource = R.drawable.anna; //Aqui me creo las imagenes
        mynode8.mhorario = this.getResources().getString(R.string.horario8);
        mynode8.medades = this.getResources().getString(R.string.edades8);
        mArray.add(mynode8);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setData();
        mAdapter = new MyAdapter (this);
        setListAdapter (mAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        switch (position)
        {
            case 0:
                finish();
                int foto = R.drawable.flight3d;
                Intent actividad = new Intent (this,PlantillaActivity.class);
                actividad.putExtra("titulo", this.getResources().getString(R.string.title0));
                actividad.putExtra("horario", this.getResources().getString(R.string.horario0));
                actividad.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis0));
                actividad.putExtra("url_video","https://www.youtube.com/watch?v=iJl92mOdLFE");
                actividad.putExtra("foto", foto );
                startActivity(actividad);
                return;

            case 1:
                finish();
                int foto1 = R.drawable.laboheme;
                Intent actividad1 = new Intent (this,PlantillaActivity.class);
                actividad1.putExtra("titulo", this.getResources().getString(R.string.title1));
                actividad1.putExtra("horario", this.getResources().getString(R.string.horario1));
                actividad1.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis1));
                actividad1.putExtra("url_video","http://www.youtube.com/watch?v=K-gWwDYjNU4");
                actividad1.putExtra("foto", foto1 );
                startActivity(actividad1);
                return;

            case 2:
                finish();
                int foto2 = R.drawable.esmeralda;
                Intent actividad2 = new Intent (this,PlantillaActivity.class);
                actividad2.putExtra("titulo", this.getResources().getString(R.string.title2));
                actividad2.putExtra("horario", this.getResources().getString(R.string.horario2));
                actividad2.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis2));
                actividad2.putExtra("url_video","http://www.youtube.com/watch?v=l8mnW96kHHg");
                actividad2.putExtra("foto", foto2 );
                startActivity(actividad2);
                return;

            case 3:
                finish();
                int foto3 = R.drawable.la_flauta;
                Intent actividad3 = new Intent (this,PlantillaActivity.class);
                actividad3.putExtra("titulo", this.getResources().getString(R.string.title3));
                actividad3.putExtra("horario", this.getResources().getString(R.string.horario3));
                actividad3.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis3));
                actividad3.putExtra("url_video","http://www.youtube.com/watch?v=CH2jQfip9Rg");
                actividad3.putExtra("foto", foto3 );
                startActivity(actividad3);
                return;

            case 4:
                finish();
                int foto4 = R.drawable.friends;
                Intent actividad4 = new Intent (this,PlantillaActivity.class);
                actividad4.putExtra("titulo", this.getResources().getString(R.string.title4));
                actividad4.putExtra("horario", this.getResources().getString(R.string.horario4));
                actividad4.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis4));
                actividad4.putExtra("url_video","http://www.youtube.com/watch?v=CH2jQfip9Rg");
                actividad4.putExtra("foto", foto4 );
                startActivity(actividad4);
                return;

            case 5:
                finish();
                int foto5 = R.drawable.jack;
                Intent actividad5 = new Intent (this,PlantillaActivity.class);
                actividad5.putExtra("titulo", this.getResources().getString(R.string.title5));
                actividad5.putExtra("horario", this.getResources().getString(R.string.horario5));
                actividad5.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis5));
                actividad5.putExtra("url_video","http://www.youtube.com/watch?v=LfmvTbVEj4w");
                actividad5.putExtra("foto", foto5 );
                startActivity(actividad5);
                return;

            case 6:
                finish();
                int foto6 = R.drawable.spring;
                Intent actividad6 = new Intent (this,PlantillaActivity.class);
                actividad6.putExtra("titulo", this.getResources().getString(R.string.title6));
                actividad6.putExtra("horario", this.getResources().getString(R.string.horario6));
                actividad6.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis6));
                actividad6.putExtra("url_video","http://www.youtube.com/watch?v=YK5e65-V9yc");
                actividad6.putExtra("foto", foto6 );
                startActivity(actividad6);
                return;

            case 7:
                finish();
                int foto7 = R.drawable.periodico;
                Intent actividad7 = new Intent (this,PlantillaActivity.class);
                actividad7.putExtra("titulo", this.getResources().getString(R.string.title7));
                actividad7.putExtra("horario", this.getResources().getString(R.string.horario7));
                actividad7.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis7));
                actividad7.putExtra("url_video","http://www.youtube.com/watch?v=4ELEEqohY3E");
                actividad7.putExtra("foto", foto7 );
                startActivity(actividad7);
                return;

            case 8:
                finish();
                int foto8 = R.drawable.anna;
                Intent actividad8 = new Intent (this,PlantillaActivity.class);
                actividad8.putExtra("titulo", this.getResources().getString(R.string.title8));
                actividad8.putExtra("horario", this.getResources().getString(R.string.horario8));
                actividad8.putExtra("sinopsis",this.getResources().getString(R.string.sinopsis8));
                actividad8.putExtra("url_video","http://www.youtube.com/watch?v=HaLEfHIRn18");
                actividad8.putExtra("foto", foto8 );
                startActivity(actividad8);
                return;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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
                Toast.makeText(MainActivity.this,"Pantalla Actual",Toast.LENGTH_LONG).show();
                return true;

            case R.id.salir:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public static class MyAdapter extends BaseAdapter
    {
        private Context mContext;

        public MyAdapter (Context c)
        {
            mContext = c;
        }

        public int getCount()
        {
            // TODO Auto-generated method stub
            return mArray.size();
        }

        public Object getItem(int position)
        {
            // TODO Auto-generated method stub
            return mArray.get(position);
        }

        public long getItemId(int position)
        {
            // TODO Auto-generated method stub
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            // TODO Auto-generated method stub
            View view = null;
            if (convertView == null)
            {
                LayoutInflater inflater = (LayoutInflater)
                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.activity_main, null);
            }
            else
            {
                view = convertView;
            }
            ImageView img = (ImageView) (ImageView) view.findViewById(R.id.logo);
            img.setImageDrawable(mContext.getResources().getDrawable(mArray.get(position).mImageResource));
            TextView tTitle = (TextView) view.findViewById(R.id.nomPelicula);
            tTitle.setText(mArray.get(position).mTitle);
            TextView hTitle = (TextView) view.findViewById(R.id.horaPelicula);
            hTitle.setText(mArray.get(position).mhorario);
            TextView eTitle = (TextView) view.findViewById(R.id.edadesPelicula);
            eTitle.setText(mArray.get(position).medades);
            return view;
        }
    }
}