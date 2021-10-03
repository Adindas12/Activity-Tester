package com.adindas.activitytester.modul

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(
    var id : Int,
    var name : String,
    var className : String,
) : Parcelable
