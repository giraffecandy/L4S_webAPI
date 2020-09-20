package app.babachan.l4s_webapi

import com.google.gson.annotations.SerializedName

data class User (
    val name: String,
    @SerializedName("long")val userId: String,
    @SerializedName("avatar_url")val avatarUrl: String,
    val following: Int,
    val followers: Int
)
