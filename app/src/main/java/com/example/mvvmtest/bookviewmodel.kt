package com.example.mvvmtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class bookviewmodel : ViewModel() {

    // get data from repository
    val getbookslivedata = MutableLiveData<String>()

    init {
        getallbooks()
    }
    fun getallbooks(){
        val allbooks = repository.data
        getbookslivedata.value=allbooks
    }
}