package com.example.citysproject.favorites

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        deleteDialog()
    }

    private fun setupRecyclerView() {
        adapter = CityAdapter(this, requireActivity())
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

    override fun onItemClick(item: City) {
    }

    private fun deleteDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage("Вы уверены что хотите удалить из избранного?")
        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            Toast.makeText(context, android.R.string.yes, Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton(android.R.string.no) { dialog, which ->
            Toast.makeText(context, android.R.string.no, Toast.LENGTH_SHORT).show()
        }
        builder.show()
    }
}