JC=javac
SOURCES=\
	Solution.java
JFLAGS=-g
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

default: classes

classes: $(SOURCES:.java=.class)

clean:
	rm  *.class
