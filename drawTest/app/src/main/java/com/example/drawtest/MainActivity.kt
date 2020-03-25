package com.example.drawtest

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var drawerLayout : androidx.drawerlayout.widget.DrawerLayout? = null
    var drawer : RelativeLayout? = null
    var bOpened : Boolean = false
    var layout_feed : RelativeLayout? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout_feed = findViewById<RelativeLayout>(R.id.layout_feed)

        layout_feed!!.setOnClickListener {

            println("---> layout_feed clicked")
        }

        drawerLayout = findViewById<androidx.drawerlayout.widget.DrawerLayout>(R.id.drawerLayout)

        drawer = findViewById<RelativeLayout>(R.id.drawer);

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {

            println("---> btn clicked")

            if(bOpened)
            {
                bOpened = false
                closeDraw()
            }
            else
            {
                bOpened = true
                openDraw()
            }
        }
    }

    private fun openDraw()
    {
        drawerLayout!!.openDrawer(drawer!!)
    }

    private fun closeDraw()
    {
        drawerLayout!!.closeDrawer(drawer!!)
    }
}
