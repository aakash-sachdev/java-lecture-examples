package chapter04;

public class ObjectPractice {

    public String message = "Hello World";

    public void sayHello() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        ObjectPractice hello = new ObjectPractice(); //CREATING INSTANCE
        hello.sayHello();
    }
}

//----------------------------------------------------------------------------------------------------------------------

/*
different conditions -
Modifier	Class	Package	    World
public	     Yes	  Yes	     Yes
protected	 Yes	  Yes	      No
(no modifier, aka package-private or default)-
             Yes	  Yes	      No
private	     Yes	   No	      No
 */

//----------------------------------------------------------------------------------------------------------------------

/*
Condition for default access -

Removing the Public will set to default if no access modifier is set.

    public class HelloWorld {

        String message = "Hello World";

        void sayHello() {
            System.out.println(message);
        }
    }
*/

//----------------------------------------------------------------------------------------------------------------------

/*
    public class HelloWorld {

        private String message = "Hello World";

        public void sayHello() {
            System.out.println(message);
   }
}
 */

//----------------------------------------------------------------------------------------------------------------------
