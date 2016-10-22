package ec.edu.upse.mytestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hola Android", Toast.LENGTH_LONG).show();

        //Codigo
        Button b = (Button) findViewById(R.id.btnIngreso);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Funcion Anonima", Toast.LENGTH_LONG).show();
                TextView tvMensaje = (TextView) findViewById(R.id.textView2);
                tvMensaje.setText(getResources().getString(R.string.alertaInicio));
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException ie)
                {
                    Toast.makeText(MainActivity.this,"Error maldito", Toast.LENGTH_LONG);
                }
            }
        });
    }

    public void presionarBoton(View vista)
    {
        Toast.makeText(MainActivity.this, "Funcion normal",Toast.LENGTH_LONG).show();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ie)
        {
            Toast.makeText(MainActivity.this,"Error maldito 2", Toast.LENGTH_LONG);
        }
    }
}
