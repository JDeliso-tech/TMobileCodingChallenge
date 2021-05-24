package com.example.tmobilecodingchallenge.data.repos

import com.example.tmobilecodingchallenge.data.models.ResponseDTO
import com.example.tmobilecodingchallenge.data.remote.network.ResponseManager
import retrofit2.Response

class ResponseRepo {

    suspend fun getResponse(): Response<ResponseDTO> {
        return ResponseManager().getResponse()
    }

}