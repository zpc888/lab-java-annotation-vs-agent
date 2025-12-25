package lab.test;
import lab.anno.HelloAnnotation;

@HelloAnnotation("Annotation Processor")
public class HelloAnnotationDemo {
    public static void main(String[] args) {
        HelloAnnotationDemoGenerated.sayHello();
    }
}
