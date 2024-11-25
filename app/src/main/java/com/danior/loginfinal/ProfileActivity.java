package com.danior.loginfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private ImageView profileImage;
    private TextView nameTextView, positionTextView, descriptionTextView, emailTextView, portfolioTextView;
    private Button editProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Asignar los elementos de la interfaz
        profileImage = findViewById(R.id.profileImage);
        nameTextView = findViewById(R.id.nameTextView);
        positionTextView = findViewById(R.id.positionTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        emailTextView = findViewById(R.id.emailTextView);
        portfolioTextView = findViewById(R.id.portfolioTextView);
        editProfileButton = findViewById(R.id.editProfileButton);

        // Simulando la asignación de información estática
        nameTextView.setText("Dani Ortiz");
        positionTextView.setText("Desarrollador Web, Diseñador 3D y Analista en Sistemas.");
        descriptionTextView.setText("Me especializo en Desarrollo Web, Diseño 3D y Análisis de Sistemas con pasión por crear soluciones digitales innovadoras.");
        emailTextView.setText("daniorperfxd@gmail.com");
        portfolioTextView.setText("Portafolio: https://portafolio-ashen-eta.vercel.app/");

        // Acción para el botón de edición de perfil
        editProfileButton.setOnClickListener(v -> {
            // Aquí abrirías una nueva actividad para editar los datos
            Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
            startActivity(intent);
            // También podrías hacer algo como un mensaje de Toast
            Toast.makeText(ProfileActivity.this, "Abriendo perfil para editar...", Toast.LENGTH_SHORT).show();
        });
    }
}
