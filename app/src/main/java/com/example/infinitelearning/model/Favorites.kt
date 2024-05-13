package com.example.infinitelearning.model

import android.provider.ContactsContract.CommonDataKinds.Photo

data class Favorites (
    val id: Int,
    val favorites: String,
    val name: String,
    val photo: Int
)


