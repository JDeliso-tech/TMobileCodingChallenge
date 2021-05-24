package com.example.tmobilecodingchallenge.data.remote.network

import com.example.tmobilecodingchallenge.data.models.ResponseDTO
import retrofit2.Response
import retrofit2.http.GET

class ResponseManager {
    private val service: ResponseService
    private val retrofit = RetrofitService.providesRetrofitService()

    init {
        service = retrofit.create(ResponseService::class.java)
    }

    suspend fun getResponse(): Response<ResponseDTO> {
        return service.getResponse()
    }

    interface ResponseService {
        @GET("/test/home")
        suspend fun getResponse(): Response<ResponseDTO>
    }

}