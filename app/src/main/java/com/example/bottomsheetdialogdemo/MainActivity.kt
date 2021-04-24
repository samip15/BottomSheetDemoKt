package com.example.bottomsheetdialogdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var bottomSheetDialog: BottomSheetDialog
    lateinit var bottomSheetView: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonShow).setOnClickListener {
            bottomSheetDialog =  BottomSheetDialog(this,R.style.BottomSheetDialogTheme)
            bottomSheetView = LayoutInflater.from(applicationContext)
                .inflate(R.layout.layout_bottom_sheet,findViewById<LinearLayout>(R.id.bottomSheetContainer))
            bottomSheetView.findViewById<Button>(R.id.bottonShare).setOnClickListener {
                Toast.makeText(this, "Share....", Toast.LENGTH_SHORT).show()
                bottomSheetDialog.dismiss()
            }
            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()
        }
    }
}
