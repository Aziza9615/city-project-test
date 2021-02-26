package com.example.citysproject.favorites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.citysproject.R
import com.example.citysproject.city.CityAdapter
import com.example.citysproject.city.RequestResult
import com.example.citysproject.main.MainRepository
import com.example.citysproject.data.model.City
import kotlinx.android.synthetic.main.fragment_city.*

class FavoriteFragment : Fragment(), CityAdapter. ClickListener, RequestResult {

    lateinit var adapter: CityAdapter
    private lateinit var repository: MainRepository
    private var cityArray = mutableListOf<City>()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        adapter = CityAdapter()
        res_view.adapter = adapter
        res_view.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onResume() {
        super.onResume()
        repository = MainRepository(this)
        repository.fetchFavorites()
    }

    override fun onFailure(fail: String) {
        TODO("Not yet implemented")
    }

    override fun onSuccess(result: MutableList<City>) {

    }
}