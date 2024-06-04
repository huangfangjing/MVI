package com.example.mvi

/**
 *@author : hfj
 */
sealed class UserIntent(open var action: String) {


    data class Sing(override var action: String) : UserIntent(action)

    data class Dance(override var action: String) : UserIntent(action)

    data class Study(override var action: String) : UserIntent(action)
}