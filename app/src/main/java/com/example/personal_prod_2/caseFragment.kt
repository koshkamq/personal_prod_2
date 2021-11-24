package com.example.personal_prod_2

import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.personal_prod_2.databinding.FragmentCaseBinding

class caseFragment : Fragment() {

    private var _binding: FragmentCaseBinding? = null
    private val binding get() = _binding!!

    private val args: caseFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if(args.color == "blue"){
            val themedInflater: LayoutInflater = inflater.cloneInContext(
                ContextThemeWrapper(requireContext(), R.style.Personal_prod_2_blue)
            )
            _binding = FragmentCaseBinding.inflate(themedInflater,container,false)
            return binding.root
        }
        return null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}