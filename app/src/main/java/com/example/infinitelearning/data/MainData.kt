package com.example.infinitelearning.data

import android.provider.ContactsContract.CommonDataKinds.Photo
import com.example.infinitelearning.R
import com.example.infinitelearning.model.Favorites
import com.example.infinitelearning.model.Keluarga
import com.example.infinitelearning.model.Photos

object MainData {
    val keluargaIkmal = listOf(
        Keluarga(
            id = 1,
            name = "Ikmal Akbar",
            panggilan = "Kemal Akcbar",
            status = "Anak Pertama",
            photos = R.drawable.ikmal_akbar
        ),
        Keluarga(
            id = 2,
            name = "La Abdullah",
            panggilan = "Abdullah",
            status = "Ayah",
            photos = R.drawable.abdullah
        ),
        Keluarga(
            id = 3,
            name = "Halima",
            panggilan = "Ima",
            status = "Ibu",
            photos = R.drawable.halima
        ),
        Keluarga(
            id = 4,
            name = "Ifgan Akash",
            panggilan = "Ifgan",
            status = "Anak Kedua",
            photos = R.drawable.ifgan
        ),
        Keluarga(
            id = 5,
            name = "Almira Zayan A",
            panggilan = "Ira",
            status = "Anak Ketiga",
            photos = R.drawable.almira
        ),
        Keluarga(
            id = 6,
            name = "Fathan El Khairy",
            panggilan = "Fathan",
            status = "Anak Keempat",
            photos = R.drawable.fathan
        ),
        Keluarga(
            id = 7,
            name = "Leon",
            panggilan = "Leon",
            status = "Peliharaan",
            photos = R.drawable.leon
        ),

    )

    val mobileFavorites = listOf(
        Favorites(
            id = 1,
            favorites = "Favorites",
            name = "Kesukaan",
            photo = R.drawable.p01
        ),
        Favorites(
            id = 2,
            favorites = "Not Favor",
            name = "Tidak suka",
            photo = R.drawable.p02
        ),
        Favorites(
            id = 3,
            favorites = "Favorites",
            name = "Kesukaan",
            photo = R.drawable.p01
        ),
        Favorites(
            id = 4,
            favorites = "Not Favor",
            name = "Tidak Suka",
            photo = R.drawable.p02
        ),
        Favorites(
            id = 5,
            favorites = "Favorites",
            name = "Kesukaan",
            photo = R.drawable.p01
        ),
        Favorites(
            id = 6,
            favorites = "Not Favor",
            name = "Tidak Suka",
            photo = R.drawable.p02
        ),
    )
    val photoGallery = listOf(
        Photos(
            id = 1,
            name = "Pap 1",
            photo = R.drawable.p01
        ),
        Photos(
            id = 2,
            name = "Pap 2",
            photo = R.drawable.p02
        ),
        Photos(
            id = 3,
            name = "Pap 3",
            photo = R.drawable.p03
        ),
        Photos(
            id = 4,
            name = "Pap 4",
            photo = R.drawable.p04
        ),
        Photos(
            id = 5,
            name = "Pap 5",
            photo = R.drawable.p05
        ),
        Photos(
            id = 6,
            name = "Pap 6",
            photo = R.drawable.p06
        ),
        Photos(
            id = 7,
            name = "Pap 7",
            photo = R.drawable.p07
        ),
        Photos(
            id = 8,
            name = "Pap 8",
            photo = R.drawable.p08
        ),
        Photos(
            id = 9,
            name = "Pap 9",
            photo = R.drawable.p09
        ),
        Photos(
            id = 10,
            name = "Pap 10",
            photo = R.drawable.p10
        ),

    )
}