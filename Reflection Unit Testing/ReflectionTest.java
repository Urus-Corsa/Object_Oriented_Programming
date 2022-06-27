import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Sina Kalantar
 * @@version 1.00
 * @since 2/17/2022
 *
 * Below is the ReflectionTest class which implements main() method. In the body of the main() method
 * the written code only utilizes Java reflection libraries to perform the defined tests.
 *
 */
public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Method[] publicMethod_person = Class.forName("Person").getDeclaredMethods();

        System.out.println("Below all the methods of class Person are shown:");

        for (Method m : publicMethod_person) {

            String titleOfMethod = m.getName();

            Class[] parameters = m.getParameterTypes();

            if (parameters.length == 0)

                System.out.println(m + " has 0 parameters");

            else {

                System.out.println(m + " has " + parameters.length + " parameter(s) of the following types:");
            }

            for (Class clas : parameters)

                System.out.println("" + clas.getName());
        }

        Method[] publicMethod_address = Class.forName("Address").getMethods();

        System.out.println("Below all the methods of Address class are shown:");

        for (Method m : publicMethod_address) {

            String titleOfMethod = m.getName();

            Class[] parameters = m.getParameterTypes();

            if (parameters.length == 0)

                System.out.println(m + " has 0 parameters");

            else {

                System.out.println(m + " has " + parameters.length + " parameter(s) of the following types:");
            }

            for (Class p : parameters)

                System.out.println("" + p.getName());
        }

        System.out.println("-----------------------------");

        Field[] Field_person = Class.forName("Address").getDeclaredFields();

        System.out.println("Below all the fields of Address class are shown:");

        for (Field fild : Field_person)

            System.out.println(fild.getName());

        System.out.println("\nField names and types:");

        for (Field fildd : Field_person)

            System.out.println(fildd.toString());

        System.out.println("-----------------------------");

        try {

            Constructor<Address> addressConstructor;

            addressConstructor = Address.class.getConstructor(int.class, String.class,

                    String.class, String.class, String.class);

            Constructor<Person> personConstructor;

            personConstructor = Person.class.getConstructor(String.class, String.class, int.class,

                    String.class, Address.class);

            Address firstAddress = addressConstructor.newInstance(1, "124 Mains St", "San Jose", "CA", "95112");

            Person firstPersonInfo = personConstructor.newInstance("L", "Laura", 31, "55300357", firstAddress);

            Address secondAddress = addressConstructor.newInstance(2, "9863 Taft Ave", "San Jose", "CA", "95124");

            Person secondPersonInfo = personConstructor.newInstance("K", "Karen", 24, "852574331", secondAddress);

            Address thirdAddress = addressConstructor.newInstance(3, "748 ", "Gilroy", "CA", "95856");

            Person thirdPersonInfo = Person.class.newInstance();

            thirdPersonInfo.setFirstName("L");

            thirdPersonInfo.setLastName("Shenitzel");

            thirdPersonInfo.setAge(31);

            thirdPersonInfo.setSSN("55300357");

            thirdPersonInfo.setAddress(thirdAddress);

            System.out.println("Below are the information of the 3 Persons:");

            System.out.println("First Person: " + firstPersonInfo.toString());

            System.out.println("Second Person: " + secondPersonInfo.toString());

            System.out.println("Third Person: " + thirdPersonInfo.toString());

            Class p = firstPersonInfo.getClass();

            try {

                Class pClas = firstPersonInfo.getClass();

                Method setFirstNameMethod = pClas.getDeclaredMethod("setFirstName", String.class);

                setFirstNameMethod.invoke(firstPersonInfo, "Woody");

                Method setLastNameMethod = pClas.getDeclaredMethod("setLastName", String.class);

                setLastNameMethod.invoke(firstPersonInfo, "Allen");

                Method setAgeNameMethod = pClas.getDeclaredMethod("setAge", int.class);

                setAgeNameMethod.invoke(firstPersonInfo, 85);
            }
            catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {

                System.out.println("Warning: Problem Invoking the Method");
            }

            System.out.println("\nFirst Person: " + firstPersonInfo.toString());

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e)

        {
            e.printStackTrace();
        }

    }
}
