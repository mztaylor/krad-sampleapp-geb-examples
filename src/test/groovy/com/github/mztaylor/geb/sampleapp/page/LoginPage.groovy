package com.github.mztaylor.geb.sampleapp.page

import geb.Page
import com.github.mztaylor.geb.sampleapp.module.*
     
class LoginPage extends Page {
    static at = { heading.text() == "Login" }
    static content = {
        navbar { module NavigationModule } 
        heading { $("h1") }
        loginForm { $("form.kualiForm") }
	loginButton(to: KradMainPage) { $("button[id='Rice-LoginButton']") }
	userNameField { $("input[id='Rice-UserName_control']") }
    }

    void login(String userName) {
        userNameField.value(userName)
        loginButton.click()
    }    

}
