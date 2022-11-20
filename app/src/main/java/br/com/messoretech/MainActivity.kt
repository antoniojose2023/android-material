package br.com.messoretech

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityMainBinding
import br.com.messoretech.fragment.BottonSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


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

       binding.cvBottomSheets.setOnClickListener {
            val modalSheet = BottonSheetDialog()
            modalSheet.show(supportFragmentManager, BottonSheetDialog.TAG)
        }
    }
}
