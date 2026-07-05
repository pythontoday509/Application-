package com.instagramreset.data.model

data class ResetResult(
    val success: Boolean,
    val password: String? = null,
    val userId: String? = null,
    val username: String? = null,
    val error: String? = null
)
