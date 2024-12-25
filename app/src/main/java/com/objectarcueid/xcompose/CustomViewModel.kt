package com.objectarcueid.xcompose

import androidx.lifecycle.ViewModel
import com.objectarcueid.xcompose.base.log.echoLogD
import com.objectarcueid.xcompose.user.MeUserService
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel

class CustomViewModel @AssistedInject constructor(
    private val meUserService: MeUserService,
    @Assisted private val str: String,
) : ViewModel() {
    fun test(): String {
        return "nickname:${meUserService.nickname};str:$str".also {
            echoLogD("nickname:${meUserService.nickname};str:$str")
        }
    }
}

@AssistedFactory
interface CustomViewModelFactory {
    fun create(str: String): CustomViewModel
}