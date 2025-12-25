package lab.test;

// HelloAgentDemo.java
public class HelloAgentDemo {
    public static void main(String[] args) {
        System.out.println("Hello from main application!");
        
        // Try to get agent info
        String agentClass = System.getProperty("sun.java.command");
        if (agentClass == null) {
            System.out.println("Running without agent!!!");
        } else {
            System.out.println("Running with agent: " + agentClass);
        }
    }
}
