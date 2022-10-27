package com.example.cheerup.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.cheerup.R
import com.google.firebase.firestore.FirebaseFirestore



class Suggestion : AppCompatActivity() {


    private lateinit var suggestionTxt: EditText
    private lateinit var suggestionBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suggestion)

        suggestionTxt = findViewById(R.id.suggestionTxt)
        suggestionBtn = findViewById(R.id.suggestionBtn)

        suggestionTxt.addTextChangedListener(textChecker)

        suggestionBtn.setOnClickListener {

            val CenterName = suggestionTxt.text.toString()

            Toast.makeText(this, "Suggestion Submitted! thank you for your suggestion!",Toast.LENGTH_SHORT).show()
            suggestionTxt.text.clear()

            firebaseSave(CenterName)


        }

    }

    private fun firebaseSave(CenterName: String) {

        val instance =  FirebaseFirestore.getInstance()
        val center : MutableMap<String, Any> = HashMap()
        center["CenterName"] = CenterName

        instance.collection("Suggestions").add(center).addOnSuccessListener {

        }


    }


    private val textChecker = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {


        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            val suggestion = suggestionTxt.text.toString().trim()

            suggestionBtn.isEnabled = suggestion.isNotEmpty()


        }

        override fun afterTextChanged(s: Editable?) {}



    }

}

