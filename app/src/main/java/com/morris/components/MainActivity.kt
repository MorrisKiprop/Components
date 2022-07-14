package com.morris.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val myImage: ImageView = findViewById(R.id.imgWater)
        val checkFootball: CheckBox = findViewById(R.id.checkBoxFootball)
        val checkRugby: CheckBox = findViewById(R.id.checkBoxRugby)
        val toggleWifi: ToggleButton = findViewById(R.id.toggleButtonWifi)
        val switchDisplayMode: Switch = findViewById(R.id.switchLightMode)
        val groupGender:RadioGroup=findViewById(R.id.groupGender)

        var original = true
        myImage.setOnClickListener { }
        checkFootball.setOnCheckedChangeListener { checkbox, ischecked ->
            if (ischecked) {
                Toast.makeText(this, "Football Selected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Not Selected", Toast.LENGTH_SHORT).show()

            }
            checkRugby.setOnCheckedChangeListener { checkbox, ischecked ->
                if (ischecked) {
                    Toast.makeText(this, "Rugby Selected", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Not Selected", Toast.LENGTH_SHORT).show()

                }
            }
            toggleWifi.setOnCheckedChangeListener { _, isTurnedOn ->

                if (isTurnedOn) {
                    Toast.makeText(this, "Wifi is On", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Wifi is off", Toast.LENGTH_SHORT).show()
                }
            }

            switchDisplayMode.setOnCheckedChangeListener { _, isChecked ->

                if (isChecked) {
                    Toast.makeText(this, "Dark mode is on", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Dark mode is off", Toast.LENGTH_SHORT).show()
                }
            }


        }
      groupGender.setOnCheckedChangeListener { _, id ->
          if (id==R.id.radioMale){
              Toast.makeText(this,"I am Male",Toast.LENGTH_SHORT).show()
          }
          else if (id==R.id.radioFemale){
              Toast.makeText(this,"I am Female",Toast.LENGTH_SHORT).show()
          }
          else if (id==R.id.radioOther){
              Toast.makeText(this,"I am neither Male nor Female",Toast.LENGTH_SHORT).show()
          }
      }


    }
}