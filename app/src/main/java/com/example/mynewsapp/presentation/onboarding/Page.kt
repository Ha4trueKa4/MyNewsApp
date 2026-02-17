package com.example.mynewsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.mynewsapp.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image : Int
)

val pages = listOf<Page>(
    Page(
        title="Lorem ipsum",
        description = "Lorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsum",
        image= R.drawable.onboarding1
    ),
    Page(
        title="Lorem ipsum",
        description = "Lorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsum",
        image= R.drawable.onboarding2
    ),
    Page(
        title="Lorem ipsum",
        description = "Lorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsum",
        image= R.drawable.onboarding3
    )
)
