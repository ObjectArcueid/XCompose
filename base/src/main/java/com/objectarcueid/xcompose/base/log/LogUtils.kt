package com.objectarcueid.xcompose.base.log

import android.util.Log

fun Any.echoLogD(content: String) {
    Log.d(javaClass.simpleName, "======>$content")
}