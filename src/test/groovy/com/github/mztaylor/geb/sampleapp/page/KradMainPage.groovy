package com.github.mztaylor.geb.sampleapp.page

import geb.Page
import com.github.mztaylor.geb.sampleapp.module.nav.*

class KradMainPage extends Page {
    static at = { waitFor { title == "Kuali" } }
    static content = {
	navbar { module KradNavBar } 
        selectedTab(wait: true) { $("a.active") }
    }
}
