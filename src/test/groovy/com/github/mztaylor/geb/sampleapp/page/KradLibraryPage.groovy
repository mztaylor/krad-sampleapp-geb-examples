package com.github.mztaylor.geb.sampleapp.page

import geb.Page
import com.github.mztaylor.geb.sampleapp.module.nav.*
import com.github.mztaylor.geb.sampleapp.module.nav.library.*

class KradLibraryPage extends Page {
    static at = { waitFor { title == "Kuali" } }
    static content = {
	navbar { module KradNavBar }
	libraryNavbar { module KradLibraryNavBar } 
        selectedTab(wait: true) { $("a.active") }
    }
}
