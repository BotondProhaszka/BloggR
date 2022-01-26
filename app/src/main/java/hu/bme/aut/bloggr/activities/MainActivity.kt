package hu.bme.aut.bloggr.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.bme.aut.bloggr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}