package com.example.mvi

import android.app.Application

/**
 *@author : hfj
 */
class App : Application() {

    companion object {
        private var instance: App? = null
            get() {
                if (field == null) {
                    field = App()
                }
                return field
            }

        @JvmStatic
        fun get(): App = instance!!
    }
}