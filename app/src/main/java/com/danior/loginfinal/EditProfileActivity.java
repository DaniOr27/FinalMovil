package com.danior.loginfinal;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfileActivity extends AppCompatActivity {

    private EditText nameEditText, positionEditText, descriptionEditText, emailEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        // Inicializar los elementos de la interfaz
        nameEditText = findViewById(R.id.nameEditText);
        positionEditText = findViewById(R.id.positionEditText);
        descriptionEditText = findViewById(R.id.descriptionEditText);
        emailEditText = findViewById(R.id.emailEditText);
        saveButton = findViewById(R.id.saveButton);

        // Acción para el botón de guardar cambios
        saveButton.setOnClickListener(v -> {
            finish(); // Esto cierra la actividad actual (EditProfileActivity) y regresa a la anterior (ProfileActivity)
        });
    }
}
