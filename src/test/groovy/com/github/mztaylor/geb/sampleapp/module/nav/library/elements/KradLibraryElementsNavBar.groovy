package com.github.mztaylor.geb.sampleapp.module.nav.library.elements

import geb.Module
import com.github.mztaylor.geb.sampleapp.page.*

class KradLibraryElementsNavBar extends Module {
    static content = {
	actionLink(to: KradLibraryPage) { $( "a[href='http://env14.rice.kuali.org/kr-krad/kradsampleapp?viewId=Demo-ActionView']") }
    }
}
