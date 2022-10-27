package com.example.cheerup.firestoreDatabase

import com.example.cheerup.activities.Register
import com.example.cheerup.models.Users
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions

class firestoreClass {

    private val FirestoreDatebase = FirebaseFirestore.getInstance()

    fun registerUser(activity: Register, userInfo: Users) {

        FirestoreDatebase.collection("Users").document(userInfo.id)
            .set(userInfo, SetOptions.merge()).addOnSuccessListener {

            activity.userRegistrationSuccess()
        }

        fun getUserID(): String{

            val user = FirebaseAuth.getInstance().currentUser

            var UserID = ""
            if (user != null){


                UserID = user.uid
            }

            return UserID

        }


    }
}