echo "Run without agent"
echo "------------------------------------------------------------------"
java -cp build/classes lab.test.HelloAgentDemo
echo "=================================================================="

echo ""
echo "Run with hello-agent"
echo "------------------------------------------------------------------"
java -javaagent:./build/lib/HelloAgent.jar -cp build/classes lab.test.HelloAgentDemo
echo "=================================================================="
