import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class StudentIntrospector {
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(StudentBean.class);

        System.out.println("StudentBean Properties:");
        for (PropertyDescriptor property : info.getPropertyDescriptors()) {
            System.out.println(property.getName());
        }

        System.out.println("\nStudentBean Methods:");
        for (Method method : StudentBean.class.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}
