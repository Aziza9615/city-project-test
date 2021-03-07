package com.example.citysproject.city

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.Helper.showToast
import com.example.citysproject.R
import com.example.citysproject.main.MainRepository
import com.example.citysproject.data.model.City
import kotlinx.android.synthetic.main.fragment_city.*
import com.example.citysproject.city.CityAdapter as CityAdapter

interface RequestResult {
    fun onFailure(fail: String)
    fun onSuccess(result: MutableList<City>)
}

class CityFragment : Fragment(), CityAdapter.ClickListener, RequestResult {

    lateinit var adapter: CityAdapter
    private var cityArray: MutableList<City> = mutableListOf()
    private lateinit var repository: MainRepository

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_city, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RecyclerView()
        setupListener()
        setupRepository()
        showDialog()
    }

    private fun setupRepository(){
        repository = MainRepository(this)
    }

    private fun RecyclerView() {
        adapter = CityAdapter(this, requireActivity())
        res_view.layoutManager = LinearLayoutManager(requireContext())
        res_view.adapter = adapter
    }

    private fun setupListener() {
        search_btn.setOnClickListener {
            var name = field_edit_text.text.toString()
        }
    }

    override fun onFailure(fail: String) {
        showToast(requireContext(),"error")
    }

    override fun onSuccess(result: MutableList<City>) {
        cityArray = result as MutableList<City>
        adapter.addItems(cityArray)
    }

    override fun onItemClick(item: City) {
    }

    private fun showDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage("Добавить города?")
        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            Toast.makeText(context, android.R.string.yes, Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton(android.R.string.no) { dialog, which ->
            Toast.makeText(context, android.R.string.no, Toast.LENGTH_SHORT).show()
        }
        builder.show()
    }
}