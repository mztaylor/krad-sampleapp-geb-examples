## Background

This is a example of geb testing for kuali rice.  After a series of manual testing events 
I thought it would be fun to start experimenting with lighter selenium testing frameworks.  
Since the project being testing is using maven and java I wanted to stay compatible, hence geb.

## Goal
The goal of this project is to setup a series of tests that can be run on the 
- krad-sampleapp (2.4.x)

These test should be able to run in:
- chrome
- firefox
- phantomjs (headless browser with ghostdriver for quick testing)

My preferences for testing on this project:
- develop all access to pages through page and module objects
- separate navigation from page functionality

My future goals are:
- incorporating screenshots and pxdiff
- incorporating better reporting on failed and passed tests (for comparison using pxdiff)

