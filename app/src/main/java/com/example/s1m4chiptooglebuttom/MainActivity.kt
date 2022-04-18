package com.example.s1m4chiptooglebuttom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.s1m4chiptooglebuttom.databinding.ActivityMainBinding
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {

    private lateinit var bi: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bi.root)

        bi.chipGrupo.setOnCheckedChangeListener { group, checkedId ->
            val chip = bi.chipGrupo.findViewById<Chip>(checkedId)
            bi.chipGrupo.removeView(chip)
        }

        bi.toggleButton.setOnClickListener {
            Toast.makeText(this, "Selección: ${bi.toggleButton.text}", Toast.LENGTH_SHORT).show()
        }
    }
}

