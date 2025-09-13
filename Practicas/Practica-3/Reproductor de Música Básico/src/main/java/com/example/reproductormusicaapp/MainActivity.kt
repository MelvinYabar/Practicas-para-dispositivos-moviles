package com.example.reproductormusicaapp

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    private lateinit var txtStatus: TextView
    private lateinit var btnPlay: Button
    private lateinit var btnPause: Button
    private lateinit var btnStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtStatus = findViewById(R.id.txtStatus)
        btnPlay = findViewById(R.id.btnPlay)
        btnPause = findViewById(R.id.btnPause)
        btnStop = findViewById(R.id.btnStop)

        updateButtons(isPlaying = false)

        btnPlay.setOnClickListener {
            if (mediaPlayer == null) initPlayer()
            if (mediaPlayer?.isPlaying == false) {
                mediaPlayer?.start()
                txtStatus.text = "Reproduciendo..."
                updateButtons(isPlaying = true)
            }
        }

        btnPause.setOnClickListener {
            if (mediaPlayer?.isPlaying == true) {
                mediaPlayer?.pause()
                txtStatus.text = "Pausado"
                updateButtons(isPlaying = false)
            }
        }

        btnStop.setOnClickListener {
            stopAndRelease()
            txtStatus.text = "Detenido"
            updateButtons(isPlaying = false)
        }
    }

    private fun initPlayer() {
        mediaPlayer = MediaPlayer.create(this, R.raw.musica).apply {
            setOnCompletionListener {
                // Cuando termina la canción, quedamos listos para reproducir de nuevo
                txtStatus.text = "Finalizado"
                stopAndRelease() // libera y deja null
                updateButtons(isPlaying = false)
            }
        }
    }

    private fun stopAndRelease() {
        mediaPlayer?.let { mp ->
            try {
                if (mp.isPlaying) mp.stop()
            } catch (_: IllegalStateException) { /* por si ya está parado */ }
            mp.release()
        }
        mediaPlayer = null
    }

    private fun updateButtons(isPlaying: Boolean) {
        btnPlay.isEnabled = !isPlaying
        btnPause.isEnabled = isPlaying
        btnStop.isEnabled = isPlaying
    }

    override fun onPause() {
        super.onPause()
        // Para esta práctica: si cambias de app, pausamos
        if (mediaPlayer?.isPlaying == true) {
            mediaPlayer?.pause()
            txtStatus.text = "Pausado (app en segundo plano)"
            updateButtons(isPlaying = false)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        stopAndRelease()
    }
}
