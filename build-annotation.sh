mkdir -p build/classes
mkdir -p build/src

javac --source-path src -d build/classes src/lab/anno/HelloAnnotation.java
javac -cp build/classes --source-path src -d build/classes src/lab/processor/HelloAnnotationProcessor.java
cp -R src/META-INF build/classes
javac -cp build/classes -processorpath build/classes --source-path src -s build/src -d build/classes src/lab/test/HelloAnnotationDemo.java
echo "INFO: generated class under build/src folder"
