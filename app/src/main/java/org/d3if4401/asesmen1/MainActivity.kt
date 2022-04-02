package org.d3if4401.asesmen1

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.d3if4401.asesmen1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.rv) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }

        binding.btnSearch.setOnClickListener { validate() }

//        val navView: BottomNavigationView = binding.navView
//
//        val navController = findNavController(R.id.nav_host_fragment_activity_main)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
//            )
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)

//        val rv: RecyclerView = findViewById(R.id.rv)
//        rv.layoutManager = LinearLayoutManager(this)
//        rv.adapter = MainAdapter(getData())
    }

    private fun validate() {
        val hasil = "Hasil Pencarian: "
        val key = binding.keyword.text.toString()

        if (key == null || key.trim() == "")
            Toast.makeText(this@MainActivity, "Tidak ada hasil", Toast.LENGTH_SHORT).show()
        else
            binding.textBase.setText(hasil + key)
    }

    private fun getData(): List<Item> {
        return listOf(
            Item("Angsa", R.drawable.angsa),
            Item("Ayam", R.drawable.ayam),
            Item("Bebek", R.drawable.bebek),
            Item("Domba", R.drawable.domba),
            Item("Kalkun", R.drawable.kalkun),
            Item("Kambing", R.drawable.kambing),
            Item("Kelinci", R.drawable.kelinci),
            Item("Kerbau",  R.drawable.kerbau),
            Item("Kuda", R.drawable.kuda),
            Item("Sapi", R.drawable.sapi),
        )
    }
}