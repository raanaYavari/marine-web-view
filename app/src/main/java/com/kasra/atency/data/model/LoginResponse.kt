package com.kasra.atency.data.model

data class LoginResponse(
    var access_token: String,
    var token_type: String,
    var expires_in: String,
    var refresh_token: String
)