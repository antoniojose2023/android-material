package br.com.messoretech.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.messoretech.databinding.FragmentBottomSheetDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottonSheetDialog: BottomSheetDialogFragment() {

    private val binding by lazy { FragmentBottomSheetDialogBinding.inflate(LayoutInflater.from(requireContext())) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater,  container: ViewGroup?, savedInstanceState: Bundle?): View? {
           return binding.root
    }

    companion object{
         const val TAG = "modalsheetDialog"
    }

}