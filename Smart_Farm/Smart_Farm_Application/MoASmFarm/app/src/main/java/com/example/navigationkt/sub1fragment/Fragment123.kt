package com.example.navigationkt.sub1fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationkt.R
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_103.*
import kotlinx.android.synthetic.main.fragment_123.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Fragment123 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_123, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var now = LocalDate.now()

        var Strnow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"))

        var Mixnow = now.plusDays(30)

        var Strnow1 = Mixnow.format(DateTimeFormatter.ofPattern("yyyy"))
        var Strnow2 = Mixnow.format(DateTimeFormatter.ofPattern("MM"))
        var Strnow3 = Mixnow.format(DateTimeFormatter.ofPattern("dd"))
        var Strnow4 = Mixnow.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"))

        fns3.setText(Strnow4)

        val database = Firebase.database

        val myRef = database.getReference("yyyy")

        myRef.setValue(Strnow1)

        val myReff = database.getReference("mm")

        myReff.setValue(Strnow2)

        val myRefff = database.getReference("dd")

        myRefff.setValue(Strnow3)

        val myReffff = database.getReference("ymd")

        myReffff.setValue(Strnow4)

        val myRef2 = database.getReference("plantname")

        myRef2.setValue("바질을")

        val myRef3 = database.getReference("Smartfarm").child("plantNumber")

        myRef3.setValue("3")

        val myRef4 = database.getReference("remember")

        myRef4.setValue("3")

        //btn_back.setOnClickListener {
        //val intent = Intent(getActivity(), MainActivity::class.java)
        //startActivity(intent)
        //}

    }

}