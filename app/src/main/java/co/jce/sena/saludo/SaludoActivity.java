package co.jce.sena.saludo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/*
 * Created by jce on 30/07/15.
 */
public class SaludoActivity extends AppCompatActivity {

    private TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        saludo = ( TextView ) findViewById( R .id .tv_Saludo );
        saludo .setText( "Hola " + getIntent() .getStringExtra( "name" ) + "!" );

    }

}
