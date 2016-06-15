package idmexico.com.mx.ejercicio1login;

import android.app.Fragment;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 15/06/2016.
 */
public class profile extends Fragment {

    /*en fragment no hay comunicacion por intent*/

    public static profile NuevaInstancia(String nombre){
        profile p = new profile();
        Bundle b = new Bundle();
        b.putString("usuarioKey",nombre);
        p.setArguments(b);
        return  p;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        ImageView imgprofile, imgprofile_2;
        View view = inflater.inflate(R.layout.profile_l,container,false);
        Bundle b = getArguments();
        String usuario = usuario=b.getString("usuarioKey");

        imgprofile = (ImageView) view.findViewById(R.id.img_profile);
        imgprofile_2 = (ImageView) view.findViewById(R.id.img_profile_2);

        if (usuario.equals("gsevilla")){
            imgprofile.setVisibility(view.VISIBLE);
            imgprofile_2.setVisibility(view.INVISIBLE);
        }
        else{
            imgprofile.setVisibility(view.INVISIBLE);
            imgprofile_2.setVisibility(view.VISIBLE);
        }

        TextView txt = (TextView) view.findViewById(R.id.txt_profile);

        //if (b !=null){

        //}
        //else{
        //    usuario="sin datos";
        //}
        txt.setText(usuario);

        return view;//super.onCreateView(inflater, container, savedInstanceState);
    }

}
