package lab.agent;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class HelloAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Hello from Java Agent premain! Agent Args = " + agentArgs);

        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className,
                    Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                    byte[] classfileBuffer) {

                // System.out.println("class name: " + className);
                if ("lab/test/HelloAgentDemo".equals(className)) {
                    System.out.println("Transforming class: " + className);
                }
                return classfileBuffer;

            }
        });
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("Hello from Java Agent agentmain! Agent Args = " + agentArgs);
        premain(agentArgs, inst);
    }
}
