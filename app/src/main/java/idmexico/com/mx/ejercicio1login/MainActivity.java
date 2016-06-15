package idmexico.com.mx.ejercicio1login;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText user;
    private EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user= (EditText) findViewById(R.id.txtusuario_login);
        pwd = (EditText) findViewById(R.id.txtpwd_login);

        findViewById(R.id.btn_login).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                DoLogin();
                break;
        }
    }

    private void DoLogin() {
        String usuario= user.getText().toString();
        String contra = pwd.getText().toString();

        if ((usuario.equals("gsevilla") || usuario.equals("ricardo")) && contra.equals("123")){
            Toast.makeText(getApplicationContext(), "Acceso Correcto", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),view_principal.class);
            intent.putExtra("usuarioKey", usuario);
            startActivity(intent);
        }



    }
}
