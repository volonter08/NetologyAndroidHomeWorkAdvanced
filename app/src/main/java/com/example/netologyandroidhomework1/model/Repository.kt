package com.example.netologyandroidhomework1.model

import androidx.lifecycle.LiveData

interface  Repository<T> {
    fun getAll():List<Post>
}