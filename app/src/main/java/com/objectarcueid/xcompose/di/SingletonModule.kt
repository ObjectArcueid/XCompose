package com.objectarcueid.xcompose.di

import com.objectarcueid.xcompose.user.MeUserService
import com.objectarcueid.xcompose.user.MeUserServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface SingletonModule {
    @Binds
    @Singleton
    fun bindMeUserService(meUserService: MeUserServiceImpl): MeUserService
}