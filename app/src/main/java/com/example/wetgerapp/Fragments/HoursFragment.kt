package com.example.wetgerapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wetgerapp.R
import com.example.wetgerapp.adapters.VpAdapter
import com.example.wetgerapp.adapters.WeatherAdapter
import com.example.wetgerapp.adapters.WeatherModel
import com.example.wetgerapp.databinding.FragmentHoursBinding

class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(WeatherModel("", "", "Sunny", "", "25°C", "", "","","","",
            "","","12:00",)
        ,WeatherModel("", "", "Sunny", "", "27°C", "", "","","","",
                "","","13:00",),
            WeatherModel("", "", "Sunny", "", "28°C", "", "","","","",
                "","","14:00",))
        adapter.submitList(list)
    }
    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
            }
    }
