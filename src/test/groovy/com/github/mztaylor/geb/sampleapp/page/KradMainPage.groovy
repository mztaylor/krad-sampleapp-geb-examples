package com.github.mztaylor.geb.sampleapp.page

import geb.Page
import com.github.mztaylor.geb.sampleapp.module.*

class KradMainPage extends Page {
    static at = { waitFor { title == "Kuali" } }
    static content = {
	navbar { module NavigationModule } 
        selectedTab(wait: true) { $("a.active") }
    }
}
