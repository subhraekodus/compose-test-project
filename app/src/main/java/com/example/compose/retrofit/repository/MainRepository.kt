package com.example.compose.retrofit.repository

import com.example.compose.retrofit.network.ApiService
import javax.inject.Inject

class MainRepository
@Inject
constructor(private val apiService: ApiService) {
}