package Adaptador;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import Modelos.modeloItems;
import idmexico.com.mx.ejercicio1login.R;

/**
 * Created by Administrator on 15/06/2016.
 */
public class AdapterItemsList extends ArrayAdapter<modeloItems>{

    public AdapterItemsList(Context context, List<modeloItems> objects) {
        super(context, 0 , objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView ==null)
        {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list,parent,false);
        }
        TextView txtTexto = (TextView) convertView.findViewById(R.id.texto_item);
        TextView textDescrip = (TextView) convertView.findViewById(R.id.txtDescrip_item);
        ImageView img = (ImageView) convertView.findViewById(R.id.img_row);

        modeloItems mod= getItem(position);
        txtTexto.setText(mod.texto);
        textDescrip.setText(mod.descrip);
        img.setImageResource(mod.idImagen);

        return convertView;
    }
}
