package com.tegarpenemuan.challengchapter6.data.api.auth

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Part

/**
 * com.tegarpenemuan.challengechapter7.data.api.auth
 *
 * Created by Tegar Penemuan on 02/06/2022.
 * https://github.com/tegarpenemuanr3
 *
 */

data class UpdateProfileRequest(
    @Part("name") var name: RequestBody? = null,
    @Part("job") var job: RequestBody? = null,
    @Part var data: MultipartBody.Part? = null
)