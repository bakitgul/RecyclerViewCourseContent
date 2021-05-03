package com.example.recyclerviewkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.recyclerviewkullanimi.databinding.FragmentDetaySayfaBinding
import com.example.recyclerviewkullanimi.databinding.FragmentFilmDetayBinding

class FilmDetayFragment : Fragment() {

    private lateinit var tasarim:FragmentFilmDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_film_detay, container, false)

        val b:FilmDetayFragmentArgs by navArgs()
        val gelenFilm = b.filmnesne

        tasarim.imageViewFilmResim.setImageResource(
            resources.getIdentifier(gelenFilm.film_resim_adi,"drawable", requireContext().packageName))

        tasarim.textViewFilmBaslik.text = gelenFilm.film_adi
        tasarim.textViewYil.text = gelenFilm.film_yil.toString()
        tasarim.textViewKategori.text = gelenFilm.kategori
        tasarim.textViewYonetmen.text = gelenFilm.yonetmen


        return tasarim.root
    }

}