package com.example.latestnews

/**
 * @author CaptShiva007
 *
 *@author Admin
 */
import com.google.gson.annotations.SerializedName


data class Source (

    @SerializedName("id"   ) var id   : String? = null,
    @SerializedName("name" ) var name : String? = null

)