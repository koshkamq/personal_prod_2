package com.example.personal_prod_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.personal_prod_2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? MainActivity)?.setActionBar("#FF6200EE")

        binding.dialogcasebutton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_dialogcaseFragment)
        }

        //checkbox
        binding.bluecheck.setOnClickListener {
            binding.greencheck.isChecked = false; binding.yellowcheck.isChecked = false; binding.redcheck.isChecked = false; binding.greycheck.isChecked = false
        }
        binding.greencheck.setOnClickListener {
            binding.bluecheck.isChecked = false; binding.yellowcheck.isChecked = false; binding.redcheck.isChecked = false; binding.greycheck.isChecked = false
        }
        binding.yellowcheck.setOnClickListener {
            binding.bluecheck.isChecked = false; binding.greencheck.isChecked = false; binding.redcheck.isChecked = false; binding.greycheck.isChecked = false
        }
        binding.redcheck.setOnClickListener {
            binding.bluecheck.isChecked = false; binding.greencheck.isChecked = false; binding.yellowcheck.isChecked = false; binding.greycheck.isChecked = false
        }
        binding.greycheck.setOnClickListener {
            binding.bluecheck.isChecked = false; binding.greencheck.isChecked = false; binding.yellowcheck.isChecked = false; binding.redcheck.isChecked = false
        }


        binding.casebutton.setOnClickListener {
            if (binding.bluecheck.isChecked == true) {
                val color = "blue"
                val action = HomeFragmentDirections.actionHomeFragmentToCaseFragment(color)
                findNavController().navigate(action)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}