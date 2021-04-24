package com.rina.uts_18090090.activity.data_barang.presenter

import com.rina.uts_18090090.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}