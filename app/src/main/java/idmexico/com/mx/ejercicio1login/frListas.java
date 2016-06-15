package idmexico.com.mx.ejercicio1login;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Adaptador.AdapterItemsList;
import Modelos.modeloItems;

/**
 * Created by Administrator on 15/06/2016.
 */
public class frListas extends Fragment implements View.OnClickListener {

    private ListView listview;
    private List<modeloItems> array = new ArrayList<>();
    private Boolean isVal=true;
    private int cont=0;
    private EditText texto;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);

        listview = (ListView) view.findViewById(R.id.listitem);
        texto= (EditText) view.findViewById(R.id.txt_listas);

        view.findViewById(R.id.btnAgregar_listas).setOnClickListener(this);


        return view;//super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAgregar_listas:
                AgregarItem();
                break;
        }
    }

    private void AgregarItem() {

        String escrito = texto.getText().toString();

        if (!TextUtils.isEmpty(escrito)){
            modeloItems objeto = new modeloItems();
            objeto.texto=escrito;
            objeto.descrip = "descripcion: " + cont;
            objeto.idImagen = isVal ? R.drawable.ic_action_action_3d_rotation : R.mipmap.ic_launcher;
            array.add(objeto);
            listview.setAdapter(new AdapterItemsList(getActivity(),array));
            isVal =!isVal;
            cont++;
        }
    }
}
