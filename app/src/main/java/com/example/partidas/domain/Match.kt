package com.example.partidas.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match(
    @SerializedName("descricao")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("homeTeam")
    val homeTeam: Team,
    @SerializedName("awayTeam")
    val awayTeam: Team
) : Parcelable