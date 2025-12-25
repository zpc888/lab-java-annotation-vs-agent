# DEMO java annotation processor VS java agent

## Java Annotation Processor
- It happens compile time
- It generates / modifies code during compilation
- javax.annotation.processing
- It outputs source files / class files
- It is used code gen, validation, metadata processing

## Java Agent
- It happens Runtime (JVM startup or after)
- It instruments/modifies bytecode at runtime
- java.lang.instrument
- It modifies bytecode
- It is used to profiling, monitoring, AOP or debugging

## Demo
```shell
# clean up
./clean.sh

#build annotation-related classess
./build-annotation.sh

#run annotation-demo
./run-annotation.sh

#build agent-related classess
./build-agent.sh

#run agent-demo
./run-agent.sh
```

