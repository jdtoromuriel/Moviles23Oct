package com.example.library;

import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Instanciar los objetos que tienen ID en el archivo XML
    EditText idBook, name, author;
    Spinner editorial;
    Switch savailable;
    ImageButton bSave, bSearch, bEdit, bList;
    // Generar array con las opciones del spinner
    String[] arrayEditorial = {"Oveja negra", "Prentice Hall"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /* Referenciar los objetos con cada id respecto del archivo xml*/
        idBook = findViewById(R.id.etIdBook);
        name = findViewById(R.id.etName);
        author = findViewById(R.id.etAuthor);
        editorial = findViewById(R.id.spEditorial);
        savailable = findViewById(R.id.swAvailable);
        bSave = findViewById(R.id.ibSave);
        bSearch = findViewById(R.id.ibSearch);
        bEdit = findViewById(R.id.ibEdit);
        bList = findViewById(R.id.ibList);
        // Poblar el spinner con Array y luego con el array adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, arrayEditorial);
        editorial.setAdapter(arrayAdapter);
    }
}