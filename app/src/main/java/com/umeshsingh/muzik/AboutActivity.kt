package com.umeshsingh.muzik

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.umeshsingh.muzik.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return "Welcome\nto\nMuzik" + "\n\nMuzik app is a music player to listen songs. We can play our songs in this app, we can add them to our favorite list and also we can create our playlists."+ "\n\n\nDeveloped\n\nby\n\nUmesh Singh" + "\n\n\n\n\n\n\n\n\n\n\n\n\nCopyright © 2021 by Umesh Singh"
    }
}