## Background

This is a sample geb testing of the kuali rice sampleapp.  After a series of manual testing events 
I thought it would be fun to start experimenting with lighter selenium testing frameworks.  
Since the project being testing is using maven and java I wanted to stay compatible, hence geb.

## Goal
The goal of this project is to setup a series of tests that can be run on the 
- krad-sampleapp (2.4.x)

These test should be able to run in:
- chrome
- firefox
- phantomjs (headless browser with ghostdriver for quick testing)

Current plan is to:
- develop access to pages through page and module objects
- keep structure simple to read and understand
- experiment with additional tools (pxdiff, cucumber, etc...)

### Future Goals
- identify ui problems sooner using screenshots and pxdiff
- generate page and module objects from krad spring beans
