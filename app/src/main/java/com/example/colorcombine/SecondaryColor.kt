package com.example.colorcombine

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_secondary_color.*
import kotlinx.android.synthetic.main.instruction_dialog.view.*

class SecondaryColor : AppCompatActivity() {

    private val secondarylist1= arrayOf("Orange", "Green", "Purple")
    private val secondarylist2= arrayOf("Orange", "Green", "Purple")

    override fun onCreate(savedInstanceState: Bundle?) {

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary_color)

        val hbs = findViewById(R.id.homebtns) as ImageButton

        hbs.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val secondaryadapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, secondarylist1)
        val secondaryadapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, secondarylist2)

        val bc = findViewById(R.id.secondarymainbg) as ConstraintLayout

        val b1 = findViewById(R.id.secondaryconfirm) as Button
        val b2 = findViewById(R.id.secondaryinstruction) as Button

        secondaryadapter1.setDropDownViewResource(android.R.layout.simple_spinner_item)
        secondaryadapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        secondaryspinner.adapter = secondaryadapter1
        secondaryspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (secondaryspinner.selectedItemPosition == 0) {
                    secondarypick1.text = " " + secondaryspinner.selectedItem
                }
                if (secondaryspinner.selectedItemPosition == 1) {
                    secondarypick1.text = " " + secondaryspinner.selectedItem
                }
                if (secondaryspinner.selectedItemPosition == 2) {
                    secondarypick1.text = " " + secondaryspinner.selectedItem
                }
            }
        }

        secondaryspinner2.adapter = secondaryadapter2
        secondaryspinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (secondaryspinner2.selectedItemPosition == 0) {
                    secondarypick2.text = " " + secondaryspinner2.selectedItem
                }
                if (secondaryspinner2.selectedItemPosition == 1) {
                    secondarypick2.text = " " + secondaryspinner2.selectedItem
                }
                if (secondaryspinner2.selectedItemPosition == 2) {
                    secondarypick2.text = " " + secondaryspinner2.selectedItem
                }
            }
        }

        b1.setOnClickListener {
            if (secondaryspinner.selectedItemPosition == 0 && secondaryspinner2.selectedItemPosition == 0) {
                secondaryresult.setText("Color: Orange - #FFA500")
                bc.setBackgroundColor(Color.parseColor("#FFA500"))
            }
            if (secondaryspinner.selectedItemPosition == 0 && secondaryspinner2.selectedItemPosition == 1) {
                secondaryresult.setText("Color: Olive - #809300")
                bc.setBackgroundColor(Color.parseColor("#809300"))
            }
            if (secondaryspinner.selectedItemPosition == 0 && secondaryspinner2.selectedItemPosition == 2) {
                secondaryresult.setText("Color: Grenadier - #C05340")
                bc.setBackgroundColor(Color.parseColor("#C05340"))
            }

            if (secondaryspinner.selectedItemPosition == 1 && secondaryspinner2.selectedItemPosition == 0) {
                secondaryresult.setText("Color: Olive - #809300")
                bc.setBackgroundColor(Color.parseColor("#809300"))
            }
            if (secondaryspinner.selectedItemPosition == 1 && secondaryspinner2.selectedItemPosition == 1) {
                secondaryresult.setText("Color: Green - #008000")
                bc.setBackgroundColor(Color.parseColor("#008000"))
            }
            if (secondaryspinner.selectedItemPosition == 1 && secondaryspinner2.selectedItemPosition == 2) {
                secondaryresult.setText("Color: Eclipse - #404040")
                bc.setBackgroundColor(Color.parseColor("#404040"))
            }

            if (secondaryspinner.selectedItemPosition == 2 && secondaryspinner2.selectedItemPosition == 0) {
                secondaryresult.setText("Color: Grenadier - #C05340")
                bc.setBackgroundColor(Color.parseColor("#C05340"))
            }
            if (secondaryspinner.selectedItemPosition == 2 && secondaryspinner2.selectedItemPosition == 1) {
                secondaryresult.setText("Color: Eclipse - #404040")
                bc.setBackgroundColor(Color.parseColor("#404040"))
            }
            if (secondaryspinner.selectedItemPosition == 2 && secondaryspinner2.selectedItemPosition == 2) {
                secondaryresult.setText("Color: Purple - #800080")
                bc.setBackgroundColor(Color.parseColor("#800080"))
            }
        }

        b2.setOnClickListener {

            val view = View.inflate(this@SecondaryColor, R.layout.instruction_dialog, null)
            val builder = AlertDialog.Builder(this@SecondaryColor)
            builder.setView(view)
            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.setCancelable(false)

            view.okaybtn.setOnClickListener {
                dialog.dismiss()
            }
        }
    }
}