package com.objectarcueid.xcompose.user

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MeUserServiceImpl @Inject constructor(
    @ApplicationContext private val application: Context
) : MeUserService {
    override val nickname: String
        get() = "朱月"
}