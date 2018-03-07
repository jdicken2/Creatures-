JFLAGS = -g 
JC = javac 
JE= java 
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
        Thing.java \
        Creature.java \
        Tiger.java \
        Ant.java \
        Flyer.java \
        Fly.java \
        Bat.java \
        TestCreature.java \
    	TestRunner.java \
        testCreatureJUnitTest.java 

default: classes run

classes: $(CLASSES:.java=.class)

run:
		 $(JE) TestCreature
test: 	
		 $(JE) TestRunner
	
clean:
		$(RM) *.class