JC=javac
CLASSES=\
	MergeSort.java test.java
JFLAGS=-g
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm  *.class
