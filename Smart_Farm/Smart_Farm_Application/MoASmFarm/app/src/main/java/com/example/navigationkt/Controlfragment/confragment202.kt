package com.example.navigationkt.Controlfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationkt.R
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_confragment101.*
import kotlinx.android.synthetic.main.fragment_confragment201.*
import kotlinx.android.synthetic.main.fragment_confragment202.*

class confragment202 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confragment202, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pumpon.setOnClickListener {
            val database = Firebase.database
            val myRef3 = database.getReference("Smartfarm").child("plantNumber")

            myRef3.setValue("100")

            pumptext.setText("Pump ON")
        }

        pumpoff.setOnClickListener {
            val database = Firebase.database
            val myRef3 = database.getReference("Smartfarm").child("plantNumber")

            myRef3.setValue("101")

            pumptext.setText("Pump OFF")
        }
    }

}