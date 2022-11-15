package br.com.messoretech

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.messoretech.databinding.ActivityTextViewBinding

class TextFieldsActivity : AppCompatActivity() {
    private val binding by lazy { ActivityTextViewBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }

    companion object{
        fun createIntent(context: Context): Intent = Intent(context, TextFieldsActivity::class.java)
    }
}