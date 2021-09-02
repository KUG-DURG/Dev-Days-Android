package com.example.multipageapp.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.multipageapp.databinding.FragmentSearchBinding
import com.example.multipageapp.home.viewmodel.HomeViewModel

class SearchFragment : Fragment() {

    lateinit var binding: FragmentSearchBinding

    private val homeViewModel: HomeViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //api
//        homeViewModel.userLiveData.observe(viewLifecycleOwner, Observer { userModel->
//
//            binding.nameTv.text =  userModel.data?.get(0)?.firstName ?:"No Data"
//        })

        //sharing data b/w
        homeViewModel.passingData.observe(viewLifecycleOwner, Observer {

            binding.nameTv.text = it
        })

    }

}