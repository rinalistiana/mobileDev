package com.rina.uts_18090090.activity.login

import com.rina.uts_18090090.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}