package br.com.messoretech

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.messoretech.databinding.ActivitySnackbarBinding
import com.google.android.material.snackbar.Snackbar

class SnackbarActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySnackbarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        listener()


    }

    private fun listener() {
       binding.buttonSnack1.setOnClickListener {
           Snackbar.make(it, "Clicado snackbar1", Snackbar.LENGTH_LONG).show()
       }
       binding.buttonSnack2.setOnClickListener {
           Snackbar.make(it, "Clicado snackbar2", Snackbar.LENGTH_LONG)
               .setAction("ok"){
                   Log.i("TAG", "Snack 2 clicado")
               }
               .show()
        }
    }

    companion object{
        fun createIntent(context: Context): Intent = Intent(context, SnackbarActivity::class.java)
    }
}