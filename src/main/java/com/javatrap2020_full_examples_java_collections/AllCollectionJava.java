package com.javatrap2020_full_examples_java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllCollectionJava {

    final static String dashed = "----------------------";
    static int count = 0;
    final static NamesEnum nameOne = NamesEnum.ITERABLE;
    final static NamesEnum nameTwo = NamesEnum.COLLECTION;

    public static void main(String[] args) {
        NamesAll n = new NamesAll(nameOne);
        n.tellName();
        dashedLine();
        /*
        The first way to iterable the elements of a Java Iterable is via the
        Java for-each loop.Below showing how iterate the elements of a java List
        via the Java for-each loop.Since the Java List interface extends the
        Collection interface, and the Collection interface extends the Iterable
        interface, a List Object can be used with the for-each loop.
        */

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        for (String element : list) {
            System.out.println(element.toString());
        }
        /*
        This example first creates a new List and adds 3 elements to it. Then it
        uses a for-each loop to iterate the elements of the List, and
        print out the toString() value of each element.
        */

        /*
        The second way you can iterate the elements of a Java Iterable is
        by obtaining a Java Iterator from it by calling the Iterable iterator()
        method. You can then iterate through that that Iterator like you would
        with any other Iterator. Here is an example of iterating the elements
        of a Java Iterable (a Java List in this example):
        */
        n.tellName();
        dashedLine();

        List<String> listTwo = new ArrayList<>();

        listTwo.add("one");
        listTwo.add("two");
        listTwo.add("three");

        Iterator<String> iterator = listTwo.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        n.tellName();
        dashedLine();

        /*
        The third way to iterate the elements of a Java Iterable is via its
        forEach() method. The forEach() method takes a Java Lambda Expresion
        as parameter. This lambda expression is called once for each element
        in the Iterable.
         */
        List<String> listThree = new ArrayList<>();

        listThree.add("one");
        listThree.add("two");
        listThree.add("three");

        listThree.forEach((element) -> {
            System.out.println(element);
        });
        /*
        The Java Iterable interface has three methods of which only one needs
        to be implemented. The other two have default implementations.

        public interface Iterable<T> {
            Iterator<T> iterator();
            Spliterator<T> spliterator();
            void forEach(Consumer<? super T> action);
        }

        The method you must implement is named iterator(). This method must return
        a Java Iterator which can be used to iterate the elements of the object
        implementing the Iterable interface. Obtaining the Iterator happens
        behind the scenes, so you don't see that done. The Java compiler takes
        care of generating the code for that, when you use a Iterable with the
        for-each loop.

        The Java Iterable interface (java.lang.Iterable) is one of the root interfaces
        of Java Collections API. Therefore, there are several classes in Java that
        implements the Java Iterable interface. These classes can thus have their
        internal elements iterated.
        There are also several Java interfaces that extends the Iterable interface.
        Classes implementing an interface which extends the Iterable interface thus
        also implement the Iterable interface. Such classes can also have their elements
        iterated.
        The Collection interface extends Iterable, so all subtypes of Collection also
        implement the Iterable interface. For instance, both the Java List and Set
        interfaces extend the Collection interface, and thereby also the Iterable
        interface.
        */

        /*
        How can we implement a custom iterable in Java?
        An Iterable interface is defined in java.lang package and introduced with
        Java 5 version. An object that implements this interface allows it to be
        the target of the "for-each" statement. This for-each loop is used
        for iterating over arrays and collections. An Iterable interface can
        also be implemented to create custom behavior.
         */

        n.tellName();
        dashedLine();

        Person personOne = new Person("Javatrap2020","Java", 20);
        Person personTwo = new Person("John","Jo", 30);
        Persons personsList = new Persons();
        personsList.addPerson(personOne);
        personsList.addPerson(personTwo);
        for(Person person : personsList) {
            System.out.println(person);
        }

    }

    public static void dashedLine() {
        count ++;
        System.out.println(count + ". " + dashed);
    }

}
