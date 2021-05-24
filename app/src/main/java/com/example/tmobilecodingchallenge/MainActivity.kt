package com.example.tmobilecodingchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tmobilecodingchallenge.databinding.MainActivityBinding
import com.example.tmobilecodingchallenge.ui.main.MainFragment
import com.example.tmobilecodingchallenge.ui.main.MainViewModel
import com.example.tmobilecodingchallenge.ui.main.adapters.MyAdapter
import java.lang.reflect.Array.newInstance

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment.newInstance())
                .commitNow()
        }
    }
}