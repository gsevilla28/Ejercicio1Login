package idmexico.com.mx.ejercicio1login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 15/06/2016.
 */
/** esta clase se declara en manifet para poder acceder a ella*/
public class view_principal extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_principal);

        findViewById(R.id.btnPerfil_principal).setOnClickListener(this);
        findViewById(R.id.btnLista_principal).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPerfil_principal:
                mostrarPerfil();
                break;
            case  R.id.btnLista_principal:
                GeneraLista();
                break;
        }
    }
    /**funcion para mostrar 2do frgamento*/
    private void GeneraLista() {
        getFragmentManager().beginTransaction().replace(R.id.Fholder,new frListas()).commit();
    }

    /*funcion para mostrar primer frgamento*/
    private void mostrarPerfil() {
        String nomAux=getIntent().getExtras().getString("usuarioKey");

        profile instancia = profile.NuevaInstancia(nomAux);

        getFragmentManager().beginTransaction().replace(R.id.Fholder, instancia).commit();
    }


}
