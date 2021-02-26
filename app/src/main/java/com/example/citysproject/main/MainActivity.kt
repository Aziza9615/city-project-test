package com.example.citysproject.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.citysproject.R
import com.example.citysproject.city.CityFragment
import com.example.citysproject.favorites.FavoriteFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: MainViewPagerAdapter
    private lateinit var repository: MainRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewPager()
        setupBottomNavigationView()
    }

    private fun setupViewPager() {
        adapter = MainViewPagerAdapter(this)
        adapter.addFragment(CityFragment())
        adapter.addFragment(FavoriteFragment())
        view_pager.adapter = adapter
        view_pager.offscreenPageLimit = 2
        view_pager.isEnabled = false
        view_pager.isUserInputEnabled = false
    }

    private fun setupBottomNavigationView() {
        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.city -> changeCurrentItem(0)
                R.id.favorite -> changeCurrentItem(1)
            }
            true
        }
    }

    private fun changeCurrentItem(position: Int) {
        view_pager.setCurrentItem(position, false)
    }
}