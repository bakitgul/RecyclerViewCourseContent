package com.example.recyclerviewkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewkullanimi.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private  lateinit var tasarim:FragmentAnasayfaBinding

    private lateinit var  adapter: KisilerAdapter
    private lateinit var kisilerListesi:ArrayList<Kisiler>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        //RecyclerView Görünümü
        //tasarim.rv.layoutManager = LinearLayoutManager(requireContext())

        //tasarim.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        kisilerListesi = ArrayList()
        val k1 = Kisiler(1,"kubra","999999")
        val k2 = Kisiler(2,"burcu","777777")
        val k3 = Kisiler(3,"ihsan","2222222")
        val k4 = Kisiler(4,"bakıt","3333333")
        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)
        kisilerListesi.add(k4)

        adapter = KisilerAdapter(requireContext(),kisilerListesi)

        //tasarim.rv.adapter = adapter
        tasarim.kisilerAdapter =adapter

        return tasarim.root
    }

}