package br.com.messoretech

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)


        listerner()

    }

    private fun listerner() {
       binding.cvButtons.setOnClickListener {
           startActivity(ButtonsActivity.createIntent(this))
       }

       binding.cvTextFields.setOnClickListener {
            startActivity(TextFieldsActivity.createIntent(this))
       }

       binding.cvSnackBar.setOnClickListener {
            startActivity(SnackbarActivity.createIntent(this))
       }
    }
}
