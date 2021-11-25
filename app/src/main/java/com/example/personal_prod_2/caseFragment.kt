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
            (activity as? MainActivity)?.setActionBar("#4ba3c7")
            val themedInflater: LayoutInflater = inflater.cloneInContext(
                ContextThemeWrapper(requireContext(), R.style.Personal_prod_2_blue)
            )
            _binding = FragmentCaseBinding.inflate(themedInflater,container,false)
            return binding.root
        }else if(args.color == "red"){
            (activity as? MainActivity)?.setActionBar("#b61827")
            val themedInflater: LayoutInflater = inflater.cloneInContext(
                    ContextThemeWrapper(requireContext(), R.style.Personal_prod_2_red)
            )
            _binding = FragmentCaseBinding.inflate(themedInflater,container,false)
            return binding.root
        }else if(args.color == "green"){
            (activity as? MainActivity)?.setActionBar("#087f23")
            val themedInflater: LayoutInflater = inflater.cloneInContext(
                    ContextThemeWrapper(requireContext(), R.style.Personal_prod_2_green)
            )
            _binding = FragmentCaseBinding.inflate(themedInflater,container,false)
            return binding.root
        }else if(args.color == "grey"){
            (activity as? MainActivity)?.setActionBar("#808e95")
            val themedInflater: LayoutInflater = inflater.cloneInContext(
                    ContextThemeWrapper(requireContext(), R.style.Personal_prod_2_grey)
            )
            _binding = FragmentCaseBinding.inflate(themedInflater,container,false)
            return binding.root
        }else if(args.color == "yellow"){
            (activity as? MainActivity)?.setActionBar("#ff9800")
            val themedInflater: LayoutInflater = inflater.cloneInContext(
                    ContextThemeWrapper(requireContext(), R.style.Personal_prod_2_yellow)
            )
            _binding = FragmentCaseBinding.inflate(themedInflater,container,false)
            return binding.root
        }
        return null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (args.color == "blue"){
            binding.rgbtext.setText("RGB #81d4fa")
            binding.rgbdarktext.setText("Dark-#4ba3c7")
        }else if(args.color == "red"){
            binding.rgbtext.setText("RGB #ef5350")
            binding.rgbdarktext.setText("Dark-#b61827")
        }else if(args.color == "green"){
            binding.rgbtext.setText("RGB #4caf50")
            binding.rgbdarktext.setText("Dark-#087f23")
        }else if(args.color == "grey"){
            binding.rgbtext.setText("RGB #b0bec5")
            binding.rgbdarktext.setText("Dark-#808e95")
        }else if(args.color == "yellow"){
            binding.rgbtext.setText("RGB #ffc947")
            binding.rgbdarktext.setText("Dark-#c66900")
        }
    }
}