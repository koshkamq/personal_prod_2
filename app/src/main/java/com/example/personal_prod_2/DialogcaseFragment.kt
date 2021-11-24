package com.example.personal_prod_2

import android.content.Context
import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.personal_prod_2.databinding.FragmentDialogcaseBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class DialogcaseFragment : Fragment() {

    private var _binding: FragmentDialogcaseBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDialogcaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nomalbutton.setOnClickListener {
            showDialog(requireContext())
        }
        binding.bluedialog.setOnClickListener {
            val themedContext = ContextThemeWrapper(
                requireContext(),
                R.style.ThemeOverlay_Personal_prod_2_Dialog_blue
            )
            showDialog(themedContext)
        }
        binding.greendialog.setOnClickListener {
            val themedContext = ContextThemeWrapper(
                requireContext(),
                R.style.ThemeOverlay_Personal_prod_2_Dialog_green
            )
            showDialog(themedContext)
        }
        binding.yellowdialog.setOnClickListener {
            val themedContext = ContextThemeWrapper(
                requireContext(),
                R.style.ThemeOverlay_Personal_prod_2_Dialog_yellow
            )
            showDialog(themedContext)
        }
        binding.reddialog.setOnClickListener {
            val themedContext = ContextThemeWrapper(
                requireContext(),
                R.style.ThemeOverlay_Personal_prod_2_Dialog_red
            )
            showDialog(themedContext)
        }


        binding.bluecustom.setOnClickListener {
            val themedContext =
                ContextThemeWrapper(
                    requireContext(),
                    R.style.ThemeOverlay_Personal_prod_2_Dialog_blue
                )
            showDialogWithCustomView(themedContext)
        }
        binding.greencustom.setOnClickListener {
            val themedContext =
                ContextThemeWrapper(
                    requireContext(),
                    R.style.ThemeOverlay_Personal_prod_2_Dialog_green
                )
            showDialogWithCustomView(themedContext)
        }
        binding.yellowcustom.setOnClickListener {
            val themedContext =
                ContextThemeWrapper(
                    requireContext(),
                    R.style.ThemeOverlay_Personal_prod_2_Dialog_yellow
                )
            showDialogWithCustomView(themedContext)
        }
        binding.redcustom.setOnClickListener {
            val themedContext =
                ContextThemeWrapper(
                    requireContext(),
                    R.style.ThemeOverlay_Personal_prod_2_Dialog_red
                )
            showDialogWithCustomView(themedContext)
        }

    }

    private fun showDialog(context: Context){
        MaterialAlertDialogBuilder(context)
            .setTitle("ダイアログ")
            .setMessage("メッセージです")
            .setPositiveButton("はい") {dialog, _ -> dialog.dismiss()}
            .setNegativeButton("いいえ") {dialog, _ -> dialog.dismiss()}
            .show()
    }

    private fun showDialogWithCustomView(context: Context){

        val themedInflater = layoutInflater.cloneInContext(context)
        val customView = themedInflater.inflate(R.layout.view_dialog_body, null, false)

        MaterialAlertDialogBuilder(context)
            .setTitle("カスタムビューを使ってます")
            .setView(customView)
            .setPositiveButton("はい") { dialog, _ -> dialog.dismiss() }
            .setNegativeButton("いいえ") { dialog, _ -> dialog.dismiss() }
            .show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}