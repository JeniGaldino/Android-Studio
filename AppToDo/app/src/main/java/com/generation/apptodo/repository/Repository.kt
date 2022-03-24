package repository

import api.RetrofitInstance
import com.generation.todo.model.Categoria
import retrofit2.Response
import retrofit2.Retrofit

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{

        return RetrofitInstance.api.listCategoria()
    }
}