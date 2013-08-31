The `de.jetwick.snacktory` is included here because it's not in the maven
central repository and I can't really sort out everything that's going on in the
instructions for hosting a local "mini repository". It may be fine but I just
haven't had time to sort it all out yet. See also:

* https://github.com/karussell/snacktory#usage
* http://cemerick.com/2010/08/24/hosting-maven-repos-on-github/

Also, when compiled I see the following errors which ... uh, Java? Meanwhile
trying to use `-Xlint:unchecked` as described below results in a whole other
world of Java/maven missing plugin errors because ... uh, Java?

	[WARNING] Note: /dropwizard-extruder/src/main/java/de/jetwick/snacktory/MapEntry.java uses unchecked or unsafe operations.
	[WARNING] Note: Recompile with -Xlint:unchecked for details.

