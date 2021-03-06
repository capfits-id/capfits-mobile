package com.ayamgorengenak.capfits.backend

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

class FileDetailResponse(
    @field:SerializedName("data")
    @Expose
    val data: ArrayList<ListDetailItem>,

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String
)

@Parcelize
data class ListDetailItem(
    @SerializedName("id_outfit")
    @Expose
    val id_outfit: Int,

    @SerializedName("foto")
    @Expose
    val foto: String,

    @SerializedName("warna")
    @Expose
    val warna: String,

    @SerializedName("nama_outfit")
    @Expose
    val nama_outfit: String,

    @SerializedName("deskripsi")
    @Expose
    val deskripsi: String,

    @SerializedName("detail_produk")
    @Expose
    val detailProduk: String,

    @SerializedName("size")
    @Expose
    val size: String,

    @SerializedName("nama")
    @Expose
    val nama: String,

    @SerializedName("waist")
    @Expose
    val waist: String,

    @SerializedName("hip")
    @Expose
    val hip: String,

    @SerializedName("length")
    @Expose
    val length: String,

    @SerializedName("harga_sewa")
    @Expose
    val harga_sewa: Int,

    @SerializedName("lokasi")
    @Expose
    val lokasi: String,

    @SerializedName("rating")
    @Expose
    val rating: Int

) : Parcelable