package com.example.multipageapp.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.multipageapp.databinding.FragmentHomeBinding
import com.example.multipageapp.home.viewmodel.HomeViewModel

//mvvm ->model -> Repo data source, view(fragment or activity), vm->viewModel
//api calling

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding


    private val homeViewModel:HomeViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         homeViewModel.passingData.value ="fromHomeFragment"



        binding.btn.setOnClickListener {
            homeViewModel.fetchData()
        }

        homeViewModel.userLiveData.observe(viewLifecycleOwner, Observer {userModel->

            binding.tv.text = userModel.data?.get(0)?.email ?:"No Data"
        })






    }

}