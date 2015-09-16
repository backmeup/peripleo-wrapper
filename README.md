# PERIPLEO Wrapper

A branch of the [Peripleo](http://pelagios.org/peripleo/map) spatio-temporal search engine from the
[Pelagios project](http://pelagios-project.blogspot.co.uk/2015/07/peripleo-sneak-preview.html), to
be repurposed for use with BackMeUp/THEMIS.

I'm bootstrapping this as a Play Framework (v 2.4.3) project. At a later stage the interfacing
functionality may be pulled into the client entirely, with no additional server dependencies.

## Installation

* Install [Play Framework v2.4.3](https://www.playframework.com/download) (note: current versions
  require Java JDK 8).
* In the project folder, type `activator run` to launch the application. Peripleo will be
  running at http://localhost:9000/peripleo
