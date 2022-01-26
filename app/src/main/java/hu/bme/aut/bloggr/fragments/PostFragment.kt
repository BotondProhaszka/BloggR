package hu.bme.aut.bloggr.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hu.bme.aut.bloggr.R
import hu.bme.aut.bloggr.databinding.FragmentPostBinding
import hu.bme.aut.bloggr.model.Post

class PostFragment (val post : Post) : Fragment() {
    private lateinit var binding: FragmentPostBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPostBinding.inflate(LayoutInflater.from(context))

        return binding.root
    }

}