package kz.just_code.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.just_code.bottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private val stationDialog = StationBottomSheet(true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loc1.setOnClickListener{
            stationDialog.show(supportFragmentManager, "StationBottomSheet")
        }
        binding.loc2.setOnClickListener {
            stationDialog.show(supportFragmentManager, "StationBottomSheet")

        }
        binding.loc3.setOnClickListener {
            stationDialog.show(supportFragmentManager, "StationBottomSheet")
        }
    }
}