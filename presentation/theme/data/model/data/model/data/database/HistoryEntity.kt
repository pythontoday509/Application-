package com.instagramreset.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "history")
data class HistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val resetLink: String,
    val success: Boolean,
    val password: String?,
    val username: String?,
    val userId: String?,
    val error: String?,
    val timestamp: Long = System.currentTimeMillis()
)
