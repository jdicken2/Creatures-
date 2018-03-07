Julian-Dickens-CS-445-HW 1 Version 1.1 09/12/2017

Usage notes
---------------------------------------------------------------
-This program is to provide student experience with developing interfaces, concrete classes, abstract classes, and polymorphism by creating a hierarchy of Thing and Creature objects. Thing is a class that inherets from the java.lang.Object class to obtain methods such as toString(). Creature is an abstract class that is inherited by the Ant, Bat, Fly, and Tiger classes. The Creature contains move(),eat(), and whatDidYouEat() that are later overridden by the Ant, Bat, Fly, and Tiger classes to differentiate these objects. The TestCreature class is an acceptance test that simply creates and fills an array of Thing and Creatures, and displays the output of the move(),eat(), and whatDidYouEat() methods of Ant, Bat, Fly, and Tiger classes. The functionality of each method is shown below:
	move():Shows how the creature moves. This is different for each Creature.

	eat():Shows hoe the creature consumes other creatures. Some creatures only eat simple things, for example.

	whatDidYouEat():If the object has eaten an object recently, the eat whatDidYouEat() method displays that it has, along with the object that it ate. If not, it states the object did not eat anything.

The testCreatureJUnitTest class is a jUnit Test that tests the functionality of the move(),eat(), and whatDidYouEat() methods in all scenarios.
Finally, the makefile is a script that compiles and runs the Acceptance Test and jUnitTest.

Run
---------------------------------------------------------------
To run the Acceptance Test, type "make" in the command line.
To run the jUnit Test, type "make test" in the command line.
To clear the class files, type "make clean".

Without the makefile:
Compile:javac Thing.java Creature.java Ant.java Tiger.java Flyer.java Fly.java Bat.java javac TestCreature.java TestRunner.java testCreatureJUnitTest.java

Acceptance Test: java TestCreature
Unit Test: java TestRunner
Installation Notes
---------------------------------------------------------------
Install:
	jdk1.8.0_144
	junit-4.12.jar
	hamcrest-core-1.3.jar	
