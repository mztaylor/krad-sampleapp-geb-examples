package com.github.mztaylor.geb.sampleapp.module

import geb.Module

class NavigationModule extends Module {
    static content = {
        selectedTab(wait: true) { $("a.active") }
        homeTabLink { $( "a", text: contains("HOME") ) }
        libraryTabLink { $( "a", text: contains("LIBRARY") ) }
        demoTabLink { $( "a", text: contains("DEMO") ) }
    }
}
