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
import kotlinx.android.synthetic.main.activity_tertiary_color.*
import kotlinx.android.synthetic.main.instruction_dialog.view.*

class TertiaryColor : AppCompatActivity() {

    private val tertiarylist1= arrayOf("Amber", "Vermilion", "Magenta", "Blue-Violet", "Teal", "Lime")
    private val tertiarylist2= arrayOf("Amber", "Vermilion", "Magenta", "Blue-Violet", "Teal", "Lime")

    override fun onCreate(savedInstanceState: Bundle?) {

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tertiary_color)

        val hbt = findViewById(R.id.homebtnt) as ImageButton

        hbt.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val tertiaryadapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, tertiarylist1)
        val tertiaryadapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, tertiarylist2)

        val bc = findViewById(R.id.tertiarymainbg) as ConstraintLayout

        val b1 = findViewById(R.id.tertiaryconfirm) as Button
        val b2 = findViewById(R.id.tertiaryinstruction) as Button

        tertiaryadapter1.setDropDownViewResource(android.R.layout.simple_spinner_item)
        tertiaryadapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        tertiaryspinner.adapter = tertiaryadapter1
        tertiaryspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (tertiaryspinner.selectedItemPosition == 0) {
                    tertiarypick1.text = " " + tertiaryspinner.selectedItem
                }
                if (tertiaryspinner.selectedItemPosition == 1) {
                    tertiarypick1.text = " " + tertiaryspinner.selectedItem
                }
                if (tertiaryspinner.selectedItemPosition == 2) {
                    tertiarypick1.text = " " + tertiaryspinner.selectedItem
                }
                if (tertiaryspinner.selectedItemPosition == 3) {
                    tertiarypick1.text = " " + tertiaryspinner.selectedItem
                }
                if (tertiaryspinner.selectedItemPosition == 4) {
                    tertiarypick1.text = " " + tertiaryspinner.selectedItem
                }
                if (tertiaryspinner.selectedItemPosition == 5) {
                    tertiarypick1.text = " " + tertiaryspinner.selectedItem
                }
            }
        }

        tertiaryspinner2.adapter = tertiaryadapter2
        tertiaryspinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (tertiaryspinner2.selectedItemPosition == 0) {
                    tertiarypick2.text = " " + tertiaryspinner2.selectedItem
                }
                if (tertiaryspinner2.selectedItemPosition == 1) {
                    tertiarypick2.text = " " + tertiaryspinner2.selectedItem
                }
                if (tertiaryspinner2.selectedItemPosition == 2) {
                    tertiarypick2.text = " " + tertiaryspinner2.selectedItem
                }
                if (tertiaryspinner2.selectedItemPosition == 3) {
                    tertiarypick2.text = " " + tertiaryspinner2.selectedItem
                }
                if (tertiaryspinner2.selectedItemPosition == 4) {
                    tertiarypick2.text = " " + tertiaryspinner2.selectedItem
                }
                if (tertiaryspinner2.selectedItemPosition == 5) {
                    tertiarypick2.text = " " + tertiaryspinner2.selectedItem
                }
            }
        }

        b1.setOnClickListener {
            if (tertiaryspinner.selectedItemPosition == 0 && tertiaryspinner2.selectedItemPosition == 0) {
                tertiaryresult.setText("Color: Amber - #FFBF00")
                bc.setBackgroundColor(Color.parseColor("#FFBF00"))
            }
            if (tertiaryspinner.selectedItemPosition == 0 && tertiaryspinner2.selectedItemPosition == 1) {
                tertiaryresult.setText("Color: Dark Orange - #FF8600")
                bc.setBackgroundColor(Color.parseColor("#FF8600"))
            }
            if (tertiaryspinner.selectedItemPosition == 0 && tertiaryspinner2.selectedItemPosition == 2) {
                tertiaryresult.setText("Color: Brink Pink - #FF6080")
                bc.setBackgroundColor(Color.parseColor("#FF6080"))
            }
            if (tertiaryspinner.selectedItemPosition == 0 && tertiaryspinner2.selectedItemPosition == 3) {
                tertiaryresult.setText("Color: Contessa - #C57571")
                bc.setBackgroundColor(Color.parseColor("#C57571"))
            }
            if (tertiaryspinner.selectedItemPosition == 0 && tertiaryspinner2.selectedItemPosition == 4) {
                tertiaryresult.setText("Color: Sushi - #80A040")
                bc.setBackgroundColor(Color.parseColor("#80A040"))
            }
            if (tertiaryspinner.selectedItemPosition == 0 && tertiaryspinner2.selectedItemPosition == 5) {
                tertiaryresult.setText("Color: Chartreuse Yellow - #D4DF00")
                bc.setBackgroundColor(Color.parseColor("#D4DF00"))
            }

            if (tertiaryspinner.selectedItemPosition == 1 && tertiaryspinner2.selectedItemPosition == 0) {
                tertiaryresult.setText("Color: Dark Orange - #FF8600")
                bc.setBackgroundColor(Color.parseColor("#FF8600"))
            }
            if (tertiaryspinner.selectedItemPosition == 1 && tertiaryspinner2.selectedItemPosition == 1) {
                tertiaryresult.setText("Color: Vermilion - #FF4D00")
                bc.setBackgroundColor(Color.parseColor("#FF4D00"))
            }
            if (tertiaryspinner.selectedItemPosition == 1 && tertiaryspinner2.selectedItemPosition == 2) {
                tertiaryresult.setText("Color: Wild Strawberry - #FF2780")
                bc.setBackgroundColor(Color.parseColor("#FF2780"))
            }
            if (tertiaryspinner.selectedItemPosition == 1 && tertiaryspinner2.selectedItemPosition == 3) {
                tertiaryresult.setText("Color: Royal Health - #C53C71")
                bc.setBackgroundColor(Color.parseColor("#C53C71"))
            }
            if (tertiaryspinner.selectedItemPosition == 1 && tertiaryspinner2.selectedItemPosition == 4) {
                tertiaryresult.setText("Color: Yellow Metal - #806740")
                bc.setBackgroundColor(Color.parseColor("#806740"))
            }
            if (tertiaryspinner.selectedItemPosition == 1 && tertiaryspinner2.selectedItemPosition == 5) {
                tertiaryresult.setText("Color: Gamboge - #D4A600")
                bc.setBackgroundColor(Color.parseColor("#D4A600"))
            }

            if (tertiaryspinner.selectedItemPosition == 2 && tertiaryspinner2.selectedItemPosition == 0) {
                tertiaryresult.setText("Color: Brink Pink - #FF6080")
                bc.setBackgroundColor(Color.parseColor("#FF6080"))
            }
            if (tertiaryspinner.selectedItemPosition == 2 && tertiaryspinner2.selectedItemPosition == 1) {
                tertiaryresult.setText("Color: Wild Strawberry - #FF2780")
                bc.setBackgroundColor(Color.parseColor("#FF2780"))
            }
            if (tertiaryspinner.selectedItemPosition == 2 && tertiaryspinner2.selectedItemPosition == 2) {
                tertiaryresult.setText("Color: Magenta - #FF00FF")
                bc.setBackgroundColor(Color.parseColor("#FF00FF"))
            }
            if (tertiaryspinner.selectedItemPosition == 2 && tertiaryspinner2.selectedItemPosition == 3) {
                tertiaryresult.setText("Color: Electric Purple - #C516F1")
                bc.setBackgroundColor(Color.parseColor("#C516F1"))
            }
            if (tertiaryspinner.selectedItemPosition == 2 && tertiaryspinner2.selectedItemPosition == 4) {
                tertiaryresult.setText("Color: Dark Orchid - #8040C0")
                bc.setBackgroundColor(Color.parseColor("#8040C0"))
            }
            if (tertiaryspinner.selectedItemPosition == 2 && tertiaryspinner2.selectedItemPosition == 5) {
                tertiaryresult.setText("Color: Sea Pink - #D48080")
                bc.setBackgroundColor(Color.parseColor("#D48080"))
            }

            if (tertiaryspinner.selectedItemPosition == 3 && tertiaryspinner2.selectedItemPosition == 0) {
                tertiaryresult.setText("Color: Contessa - #C57571")
                bc.setBackgroundColor(Color.parseColor("#C57571"))
            }
            if (tertiaryspinner.selectedItemPosition == 3 && tertiaryspinner2.selectedItemPosition == 1) {
                tertiaryresult.setText("Color: Royal Health - #C53C71")
                bc.setBackgroundColor(Color.parseColor("#C53C71"))
            }
            if (tertiaryspinner.selectedItemPosition == 3 && tertiaryspinner2.selectedItemPosition == 2) {
                tertiaryresult.setText("Color: Electric Purple - #C516F1")
                bc.setBackgroundColor(Color.parseColor("#C516F1"))
            }
            if (tertiaryspinner.selectedItemPosition == 3 && tertiaryspinner2.selectedItemPosition == 3) {
                tertiaryresult.setText("Color: Blue-Violet - #8A2BE2")
                bc.setBackgroundColor(Color.parseColor("#8A2BE2"))
            }
            if (tertiaryspinner.selectedItemPosition == 3 && tertiaryspinner2.selectedItemPosition == 4) {
                tertiaryresult.setText("Color: Free Speech Blue - #4556B1")
                bc.setBackgroundColor(Color.parseColor("#4556B1"))
            }
            if (tertiaryspinner.selectedItemPosition == 3 && tertiaryspinner2.selectedItemPosition == 5) {
                tertiaryresult.setText("Color: Gurkha - #9A9571")
                bc.setBackgroundColor(Color.parseColor("#9A9571"))
            }

            if (tertiaryspinner.selectedItemPosition == 4 && tertiaryspinner2.selectedItemPosition == 0) {
                tertiaryresult.setText("Color: Sushi - #80A040")
                bc.setBackgroundColor(Color.parseColor("#80A040"))
            }
            if (tertiaryspinner.selectedItemPosition == 4 && tertiaryspinner2.selectedItemPosition == 1) {
                tertiaryresult.setText("Color: Yellow Metal - #806740")
                bc.setBackgroundColor(Color.parseColor("#806740"))
            }
            if (tertiaryspinner.selectedItemPosition == 4 && tertiaryspinner2.selectedItemPosition == 2) {
                tertiaryresult.setText("Color: Dark Orchid - #8040C0")
                bc.setBackgroundColor(Color.parseColor("#8040C0"))
            }
            if (tertiaryspinner.selectedItemPosition == 4 && tertiaryspinner2.selectedItemPosition == 3) {
                tertiaryresult.setText("Color: Free Speech Blue - #4556B1")
                bc.setBackgroundColor(Color.parseColor("#4556B1"))
            }
            if (tertiaryspinner.selectedItemPosition == 4 && tertiaryspinner2.selectedItemPosition == 4) {
                tertiaryresult.setText("Color: Teal - #008080")
                bc.setBackgroundColor(Color.parseColor("#008080"))
            }
            if (tertiaryspinner.selectedItemPosition == 4 && tertiaryspinner2.selectedItemPosition == 5) {
                tertiaryresult.setText("Color: Apple - #55C040")
                bc.setBackgroundColor(Color.parseColor("#55C040"))
            }

            if (tertiaryspinner.selectedItemPosition == 5 && tertiaryspinner2.selectedItemPosition == 0) {
                tertiaryresult.setText("Color: Chartreuse Yellow - #D4DF00")
                bc.setBackgroundColor(Color.parseColor("#D4DF00"))
            }
            if (tertiaryspinner.selectedItemPosition == 5 && tertiaryspinner2.selectedItemPosition == 1) {
                tertiaryresult.setText("Color: Gamboge - #D4A600")
                bc.setBackgroundColor(Color.parseColor("#D4A600"))
            }
            if (tertiaryspinner.selectedItemPosition == 5 && tertiaryspinner2.selectedItemPosition == 2) {
                tertiaryresult.setText("Color: Sea Pink - #D48080")
                bc.setBackgroundColor(Color.parseColor("#D48080"))
            }
            if (tertiaryspinner.selectedItemPosition == 5 && tertiaryspinner2.selectedItemPosition == 3) {
                tertiaryresult.setText("Color: Gurkha - #9A9571")
                bc.setBackgroundColor(Color.parseColor("#9A9571"))
            }
            if (tertiaryspinner.selectedItemPosition == 5 && tertiaryspinner2.selectedItemPosition == 4) {
                tertiaryresult.setText("Color: Apple - #55C040")
                bc.setBackgroundColor(Color.parseColor("#55C040"))
            }
            if (tertiaryspinner.selectedItemPosition == 5 && tertiaryspinner2.selectedItemPosition == 5) {
                tertiaryresult.setText("Color: Lime - #A9FF00")
                bc.setBackgroundColor(Color.parseColor("#A9FF00"))
            }
        }

        b2.setOnClickListener {

            val view = View.inflate(this@TertiaryColor, R.layout.instruction_dialog, null)
            val builder = AlertDialog.Builder(this@TertiaryColor)
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