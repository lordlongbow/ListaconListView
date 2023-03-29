package com.example.listaconlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EdificacionListAdapter extends ArrayAdapter<Edificacion> {

    private Context contexto;
    private List<Edificacion> listaEdificios;
    private LayoutInflater li;

    public EdificacionListAdapter(@NonNull Context context, int resource, @NonNull List<Edificacion> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.contexto = context;
        this.listaEdificios = objects;
        this.li = li;
    }
    //crear el getview
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
    //si es null crearlo con inflate
        if(itemView == null){
            itemView = li.inflate(R.layout.item,parent,false);
        }
        //traer cada edificio de la lista
        Edificacion edificio = listaEdificios.get(position);


        //traer los componentes del layuot
        ImageView imagen = itemView.findViewById(R.id.iv_ImagenEdificio);
        TextView domicilio= itemView.findViewById(R.id.tv_EdificioDomicilio);
        TextView precio = itemView.findViewById(R.id.tv_EdificioPrecio);

        //setearle los valores de los edificios de la lista
        imagen.setImageResource(edificio.getImagen());
        domicilio.setText(edificio.getDomicilio());
        precio.setText(edificio.getPrecio()+"");

        return itemView;

    }
}
