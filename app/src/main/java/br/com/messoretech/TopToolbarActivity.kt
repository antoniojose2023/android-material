package br.com.messoretech

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.messoretech.databinding.ActivityTopToolbarBinding

class TopToolbarActivity : AppCompatActivity() {
    private val binding by lazy { ActivityTopToolbarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.topAppBar.setNavigationOnClickListener {
            Toast.makeText(this, "Item de navegação clicado", Toast.LENGTH_LONG).show()
        }

        binding.topAppBar.setOnMenuItemClickListener {
             when(it.itemId){
                R.id.save -> {
                    Toast.makeText(this, "Item save", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.shared -> {
                     Toast.makeText(this, "Item shared", Toast.LENGTH_LONG).show()
                     true
                }
                R.id.editar -> {
                     Toast.makeText(this, "Item edit", Toast.LENGTH_LONG).show()
                     true
                }
                 else -> {false}
             }
        }
    }

    companion object{
        fun createIntent(context: Context): Intent = Intent(context, TopToolbarActivity::class.java)
    }
}