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
import kotlinx.android.synthetic.main.activity_primary_color.*
import kotlinx.android.synthetic.main.instruction_dialog.view.*

class PrimaryColor : AppCompatActivity() {

    private val primarylist1= arrayOf("Red", "Yellow", "Blue")
    private val primarylist2= arrayOf("Red", "Yellow", "Blue")

    override fun onCreate(savedInstanceState: Bundle?) {

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primary_color)

        val hbp = findViewById(R.id.homebtnp) as ImageButton

        hbp.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val primaryadapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, primarylist1)
        val primaryadapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, primarylist2)

        val bc = findViewById(R.id.primarymainbg) as ConstraintLayout

        val b1 = findViewById(R.id.primaryconfirm) as Button
        val b2 = findViewById(R.id.primaryinstruction) as Button

        primaryadapter1.setDropDownViewResource(android.R.layout.simple_spinner_item)
        primaryadapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        primaryspinner.adapter = primaryadapter1
        primaryspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (primaryspinner.selectedItemPosition == 0) {
                    primarypick1.text = " " + primaryspinner.selectedItem
                }
                if (primaryspinner.selectedItemPosition == 1) {
                    primarypick1.text = " " + primaryspinner.selectedItem
                }
                if (primaryspinner.selectedItemPosition == 2) {
                    primarypick1.text = " " + primaryspinner.selectedItem
                }
            }
        }

        primaryspinner2.adapter = primaryadapter2
        primaryspinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (primaryspinner2.selectedItemPosition == 0) {
                    primarypick2.text = " " + primaryspinner2.selectedItem
                }
                if (primaryspinner2.selectedItemPosition == 1) {
                    primarypick2.text = " " + primaryspinner2.selectedItem
                }
                if (primaryspinner2.selectedItemPosition == 2) {
                    primarypick2.text = " " + primaryspinner2.selectedItem
                }
            }
        }

        b1.setOnClickListener {
            if (primaryspinner.selectedItemPosition == 0 && primaryspinner2.selectedItemPosition == 0) {
                primaryresult.setText("Color: Red - #FF0000")
                bc.setBackgroundColor(Color.parseColor("#FF0000"))
            }
            if (primaryspinner.selectedItemPosition == 0 && primaryspinner2.selectedItemPosition == 1) {
                primaryresult.setText("Color: Orange - #FF8000")
                bc.setBackgroundColor(Color.parseColor("#FF8000"))
            }
            if (primaryspinner.selectedItemPosition == 0 && primaryspinner2.selectedItemPosition == 2) {
                primaryresult.setText("Color: Purple - #800080")
                bc.setBackgroundColor(Color.parseColor("#800080"))
            }

            if (primaryspinner.selectedItemPosition == 1 && primaryspinner2.selectedItemPosition == 0) {
                primaryresult.setText("Color: Orange - #FF8000")
                bc.setBackgroundColor(Color.parseColor("#FF8000"))
            }
            if (primaryspinner.selectedItemPosition == 1 && primaryspinner2.selectedItemPosition == 1) {
                primaryresult.setText("Color: Yellow - #FFFF00")
                bc.setBackgroundColor(Color.parseColor("#FFFF00"))
            }
            if (primaryspinner.selectedItemPosition == 1 && primaryspinner2.selectedItemPosition == 2) {
                primaryresult.setText("Color: Green - ##008000")
                bc.setBackgroundColor(Color.parseColor("#008000"))
            }

            if (primaryspinner.selectedItemPosition == 2 && primaryspinner2.selectedItemPosition == 0) {
                primaryresult.setText("Color: Purple - #800080")
                bc.setBackgroundColor(Color.parseColor("#800080"))
            }
            if (primaryspinner.selectedItemPosition == 2 && primaryspinner2.selectedItemPosition == 1) {
                primaryresult.setText("Color: Green - #008000")
                bc.setBackgroundColor(Color.parseColor("#008000"))
            }
            if (primaryspinner.selectedItemPosition == 2 && primaryspinner2.selectedItemPosition == 2) {
                primaryresult.setText("Color: Blue - #0000FF")
                bc.setBackgroundColor(Color.parseColor("#0000FF"))
            }
        }

        b2.setOnClickListener {

            val view = View.inflate(this@PrimaryColor, R.layout.instruction_dialog, null)
            val builder = AlertDialog.Builder(this@PrimaryColor)
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