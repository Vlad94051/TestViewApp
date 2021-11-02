package ru.tms.testviewapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class FragmentData(
    @DrawableRes
    val iconId: Int,
    @StringRes
    val stringId: Int
)
