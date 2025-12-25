mkdir -p build/classes
mkdir -p build/lib

javac --source-path src -d build/classes src/lab/agent/HelloAgent.java 
jar --create --file build/lib/HelloAgent.jar --manifest src/manifest.mf -C build/classes lab/agent/HelloAgent.class
javac --source-path src -d build/classes src/lab/test/HelloAgentDemo.java

