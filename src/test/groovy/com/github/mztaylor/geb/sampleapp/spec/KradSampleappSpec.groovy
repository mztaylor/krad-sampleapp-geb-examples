/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import geb.spock.GebReportingSpec

import spock.lang.*
import com.github.mztaylor.geb.sampleapp.page.*

@Stepwise
class KradSampleappSpec extends GebReportingSpec {

    static url = "http://env14.rice.kuali.org/"
    
    def "login to krad main page"() {
        when:
        to LoginPage
	login "admin"
        then:
	assert(KradMainPage)	
    }
    
    def "go to library page"() {
        given:
	KradMainPage
	when:
	  navbar.libraryTabLink.click()
 	then:
	  assert(KradMainPage)
    }
    
}
