package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> listaCanciones;
    ArrayAdapter<String> adaptador;
    // Declaramos un arreglo bidimensional para encontrar de forma más rápida las canciones (El artista será el valor del renglo del arreglo).
    // Artistas: Mago de Oz, NCS, Imagine Dragons, Skillet, James Arthur, Eminem, Breaking Benjamin y Bruno Mars(En ese orden).
    String[][] canciones = new String[][]{
            {"Fiesta Pagana", "Molinos de Viento", "La Danza del Fuego", "Hasta que el Cuerpo Aguante", "Hoy toca ser feliz", "La Costa del Silencio"},
            {"Falling", "Mortals", "Iris", "Heroes Tonight", "Undone", "I remember U"},
            {"Believer", "Thunder", "Natural", "Radioactive", "Demons", "Whatever it Takes"},
            {"Monster", "Hero", "Awake and Alive", "Feel Invincible", "Not Gonna Die", "Legendary"},
            {"Say you won´t let go", "Train Wreck", "Impossible", "Rewrite the Stars", "Empty Space, Naked","Safe inside"},
            {"Rap God", "Lose Yourself", "Godzilla", "Without me", "Not Afraid, Stan","Till I Colapse"},
            {"The Diary of Jane", "I will not bow", "Angels Fall", "So cold", "Dance wiht the Devil", "Far Away"},
            {"Uptown Funk", "That´s what I like", "Locked out of the Heaven", "When I was your man", "The lazy song, Grenade","24K Magic"}
    };
    //La variable resultado se va a encargar de guardar el valor que introduzcamos en la caja de texto.
    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Variables para hacer referencia a los campos en el diseño.
        Button btn_busqueda = (Button) findViewById(R.id.btn_buscar);
        EditText et_artista = (EditText) findViewById(R.id.et_buscarArtista);
        ListView lv_canciones = (ListView) findViewById(R.id.lv_canciones);


        btn_busqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = et_artista.getText().toString().toUpperCase();
                try {
                    // En  cada uno de los métodos se realiza la búsqueda en base a la información dentro del EditText.
                    if(resultado.equals("MAGO DE OZ"))
                    {
                        //Se crea un ArrayList para guardar las canciones que se encuentran dentro del array bidimensional.
                        listaCanciones = new ArrayList<>();
                        for (byte i = 0; i <= 5 ;i++){
                            listaCanciones.add(canciones[0][i]);
                        }
                        //El adaptador es un puente entre el componente de interfaz de usuario y el origen de datos que nos ayuda a rellenar los datos en el componente de interfaz de usuario.
                        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                        lv_canciones.setAdapter(adaptador);
                    }
                    if(resultado.equals("NCS"))
                    {
                        listaCanciones = new ArrayList<>();
                        for (byte i = 0; i <= 5 ;i++){
                            listaCanciones.add(canciones[1][i]);
                        }
                        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                        lv_canciones.setAdapter(adaptador);
                    }
                    if(resultado.equals("IMAGINE DRAGONS"))
                    {
                        listaCanciones = new ArrayList<>();
                        for (byte i = 0; i <= 5 ;i++){
                            listaCanciones.add(canciones[2][i]);
                        }
                        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                        lv_canciones.setAdapter(adaptador);
                    }
                    if(resultado.equals("SKILLET"))
                    {
                        listaCanciones = new ArrayList<>();
                        for (byte i = 0; i <= 5 ;i++){
                            listaCanciones.add(canciones[3][i]);
                        }
                        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                        lv_canciones.setAdapter(adaptador);
                    }
                    if(resultado.equals("JAMES ARTHUR"))
                    {
                        listaCanciones = new ArrayList<>();
                        for (byte i = 0; i <= 5 ;i++){
                            listaCanciones.add(canciones[4][i]);
                        }
                        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                        lv_canciones.setAdapter(adaptador);
                    }
                    if(resultado.equals("EMINEM"))
                    {
                        listaCanciones = new ArrayList<>();
                        for (byte i = 0; i <= 5 ;i++){
                            listaCanciones.add(canciones[5][i]);
                        }
                        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                        lv_canciones.setAdapter(adaptador);
                    }
                    if(resultado.equals("BREAKING BENJAMIN"))
                    {
                        listaCanciones = new ArrayList<>();
                        for (byte i = 0; i <= 5 ;i++){
                            listaCanciones.add(canciones[6][i]);
                        }
                        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                        lv_canciones.setAdapter(adaptador);
                    }
                    if(resultado.equals("BRUNO MARS"))
                    {
                        listaCanciones = new ArrayList<>();
                        for (byte i = 0; i <= 5 ;i++){
                            listaCanciones.add(canciones[7][i]);
                        }
                        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                        lv_canciones.setAdapter(adaptador);
                    }

                }catch (Exception ex){
                    Toast.makeText(MainActivity.this, ex.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
        //Este método se utiliza para cuando se realiz un cambio en el EditText.
        et_artista.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            //Método que se produce despues de que exista algún cambio en el EditText.
            @Override
            public void afterTextChanged(Editable s) {
                listaCanciones = new ArrayList<>();
                listaCanciones.add("");
                adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listaCanciones);
                lv_canciones.setAdapter(adaptador);
            }
        });
    }
}