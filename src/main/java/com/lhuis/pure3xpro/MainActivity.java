package com.lhuis.pure3xpro;

import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ocultar ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Tela cheia - Ocultar barra de status e navegação
        getWindow().getDecorView().setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_FULLSCREEN |
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        // Referência ao VideoView
        videoView = findViewById(R.id.videoView);

        // Caminho do vídeo
        String videoPath = "/storage/emulated/0/Movies/videos/pure3x_xmb_boot.mp4";

        // Definir vídeo
        videoView.setVideoPath(videoPath);
        videoView.requestFocus();
        videoView.start();

        // Quando terminar o vídeo
        videoView.setOnCompletionListener(mp -> {
            android.util.Log.d("VIDEO", "✅ Vídeo terminado!");
            // Você pode repetir o vídeo ou fazer outra ação aqui
            videoView.start(); // Repetir vídeo infinitamente
        });

        // Se der erro
        videoView.setOnErrorListener((mp, what, extra) -> {
            android.util.Log.e("VIDEO", "Erro: " + what + " " + extra);
            return true;
        });
    }
}
