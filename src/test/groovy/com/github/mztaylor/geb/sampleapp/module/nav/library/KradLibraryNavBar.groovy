package com.github.mztaylor.geb.sampleapp.module.nav.library

import geb.Module
import com.github.mztaylor.geb.sampleapp.page.*
import com.github.mztaylor.geb.sampleapp.module.nav.library.elements.*

class KradLibraryNavBar extends Module {
    static content = {
	elementLink(to: KradLibraryPage) { $( "a[href='#ComponentLibrary-Nav-Elements_accordTitle']") }
	elementsSection { module KradLibraryElementsNavBar }
    }
}
