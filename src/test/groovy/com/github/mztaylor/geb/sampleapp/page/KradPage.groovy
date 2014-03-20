package com.github.mztaylor.geb.sampleapp.page

import geb.Page

class KradPage extends Page {
    static at = { waitFor { title.beginsWith("Kuali") } }
    static content = {
        selectedTab(wait: true) { $("a.active") }
	homeTabLink { $("a[text='HOME']") }
	libraryTabLink { $("a[text='LIBRARY']") }
	demoTabLink { $("a[text='DEMO']") }
    }
}
