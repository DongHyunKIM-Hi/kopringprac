package com.example.kopring.common.model.response

import com.fasterxml.jackson.annotation.JsonInclude

class ApiResponse<T> {
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    var data: T? = null
        private set

    constructor() {}

    constructor(data: T) {
        this.data = data
    }

    companion object {
        @JvmStatic
        fun <T: Any> ok(body: T?): ApiResponse<T> {
            val apiResponse: ApiResponse<T> = ApiResponse()
            apiResponse.data = body
            return apiResponse
        }
    }
}
