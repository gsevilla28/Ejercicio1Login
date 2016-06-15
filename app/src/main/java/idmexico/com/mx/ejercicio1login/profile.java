package idmexico.com.mx.ejercicio1login;

import android.app.Fragment;
import android.os.Bundle;
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


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.profile_l,container,false);

        ImageView imgprofile = (ImageView) view.findViewById(R.id.img_profile);
        TextView txt = (TextView) view.findViewById(R.id.txt_profile);
        Bundle b = getArguments();

        String usuario;
        if (b !=null){
            usuario=b.getString("usuarioKey");
        }
        else{
            usuario="sin datos";
        }
        txt.setText(usuario);

        return view;//super.onCreateView(inflater, container, savedInstanceState);
    }
}
