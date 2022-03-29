package com.generation.todo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todo.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel

class MainViewModel @Inject constructor(val repository: Repository): ViewModel() {

    private var _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: MutableLiveData<Response<List<Categoria>>> =
        _myCategoriaResponse


    fun listCategoria(){
    viewModelScope.launch {
        try{

            val response = repository.listCategoria()
            _myCategoriaResponse.value = response
        } catch (e: Exception){

            Log.d("ErroRequisicao", e.message.toString())
        }

    }
    }
}