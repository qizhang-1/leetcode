JC=javac
JR=java
CLASSES=\
	*.java
JFLAGS=-g
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

default: classes

classes: $(CLASSES:.java=.class)

jnuit:
	$(JC) $(JFLAGS) $(CLASSPATH) $(CLASSES)
test:
	$(JR) org.junit.runner.JUnitCore test 
clean:
	rm  *.class
