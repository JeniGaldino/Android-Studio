package com.generation.apptodo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todo.model.Categoria
import kotlinx.coroutines.launch
import repository.Repository
import retrofit2.Response

class MainViewModel

    ( val repository: Repository

): ViewModel(
){

    private val _responseListCategoria =
        MutableLiveData<Response<List<Categoria>>>()

    val responseListCategoria: LiveData<Response<List<Categoria>>> =
        _responseListCategoria

    init {
        listCategoria()
    }


    fun listCategoria(){

        viewModelScope.launch {
            try {
                val response = repository.listCategoria()
                _responseListCategoria.value = response
            }catch (e: Exception){
                Log.d("ErroRequisicao", e.message.toString())
            }
        }
    }



}