package com.javatrap2020_full_examples_java_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Logger;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class AllCollectionJava {

    private final static Logger logger = Logger.getLogger(AllCollectionJava.class.getName());

    final static String dashed = "----------------------";
    static int count = 0;
    final static NamesEnum nameOne = NamesEnum.ITERABLE;
    final static NamesEnum nameTwo = NamesEnum.COLLECTION;
    final static NamesEnum nameThree = NamesEnum.COLLECTION_SET;
    final static NamesEnum nameFour = NamesEnum.COLLECTION_SET_HASH_SET;
    final static NamesEnum nameFive = NamesEnum.COLLECTION_SET_LINKED_HASH_SET;
    final static NamesEnum nameSix = NamesEnum.COLLECTION_SET_TREE_SET;
    final static NamesEnum nameSeven = NamesEnum.COLLECTION_LIST;
    final static NamesEnum nameEight = NamesEnum.COLLECTION_LIST_ARRAY_LIST;
    final static NamesEnum nameNine = NamesEnum.COLLECTION_LIST_LINKED_LIST;
    final static NamesEnum nameTen = NamesEnum.COLLECTION_LIST_VECTOR;
    final static NamesEnum nameEleven = NamesEnum.COLLECTION_LIST_VECTOR_STACK;

    public static void main(String[] args) {
        NamesAll n = new NamesAll(nameOne);
        n.tellName();
        numDashedLine();
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
            System.out.println(element);
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

        Person personOne = new Person("Javatrap2020", "Java", 20);
        Person personTwo = new Person("John", "Jo", 30);
        Persons personsList = new Persons();
        personsList.addPerson(personOne);
        personsList.addPerson(personTwo);
        for (Person person : personsList) {
            System.out.println(person);
        }
        /*
        Java Collection Framework offers the capability to Java Collection to
        represent a group of elements in classes and Interfaces

        Java Collection Framework enables the user to perform various data
        manipulation operations like storing data, searching, sorting, insertion,
        deletion, and updating of data on the group of elements.
         */

        /*
        METHODS OF COLLECTION INTERFACE
        -------------------------------

        1.public boolean add(E e)      Add objects to collection.

        2.public boolean addAll(Collection<? extends E> c) It is used to insert the
                                                        specified collection elements
                                                        in the invoking collection.

        3.public boolean remove(Object element)  It is used to delete an element
                                               from the collection

        4.default boolean removeAll(Collection<?> c)  It is used to delete all
                                                    the elements off the specified
                                                    collection from the invoking
                                                    collection.

        5.default boolean removeIf(Predicate<? super E> filter) It is used to delete
                                                              all the elements of
                                                              the collection that
                                                              satisfy the specified.

        6.public boolean retainAll(Collection<?> c)  It is used to delete all the
                                                     elements of invoking collection
                                                     except the specified collection.

        7.public int size()    It returns the total number of elements in the collection.

        8.public void clear()  It removes the total number of elements from the collection.

        9.public boolean contains(Object element) It is used to search an element.

        10.public boolean containsAll(Collection<?> c) It is used to search the
                                                       specified collection in the
                                                       collection.

        11.public Iterator iterator()   It returns an iterator.

        12.public Object[] toArray()    It converts collection into array.

        13.public <T> T[] toArray(T[] a)  It converts collection into
                                          array. Here, the runtime type
                                          of the returned array is that
                                          of the specified array.

        14.public boolean isEmpty()  It checks if collection is empty.

        15.default Stream<E> parallelStream() It returns a possibly parallel Stream
                                              with the collection as its source.

        16.default Stream<E> stream()    It returns a sequential Stream with
                                         the collection as its source.

        17.default Spliterator<E> spliterator()  It generates a Spliterator over
                                                 the specified elements in the
                                                 collection.

        18.public boolean equals(Object element) It matches two collections.

        19.public int hashCode() It returns the hash code number of the collection.

         */
        /*
        Set interface
        The set interface is inherited from the Java collection interface a Set interface
        cannot store duplicate/redundant elements in it. Here's an example based on a set interface
         */

        NamesAll n2 = new NamesAll(nameThree);
        n2.tellName();
        numDashedLine();

        int count[] = {21, 23, 43, 53, 22, 65, 22};

        Set<Integer> set = new HashSet<>();

        try {
            for (int i = 0; i <= count.length - 1; i++) {
            //for (int i = 0; i <= 7; i++) { //ERROR BOOM!
                set.add(count[i]);
            }
            System.out.println(set);
            TreeSet<Integer> sortedSet = new TreeSet<>(set);
            System.out.println("The sorted list is");
            System.out.println(sortedSet);
            System.out.println("First element of the set is: " + sortedSet.first());
            System.out.println("last element of the set is: " + sortedSet.last());
        } catch (Exception e) {
            logger.info("BOOM!" + e.getMessage());
        }
                /*
        Set interface
        Set Interface in Java is present in java.util package. It extends the Collection interface.
        It represents the unordered set of elements which doesn't allow us to store the duplicate
        items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet,
        and TreeSet.
        Set can be instantiated as:
        Set<data-type> s1 = new HashSet<data-type>();
        Set<data-type> s2 = new LinkedHashSet<data-type>();
        Set<data-type> s3 = new TreeSet<data-type>();
         */
        NamesAll n3 = new NamesAll(nameFour);
        n3.tellName();
        numDashedLine();

        /*
        HashSet
        HashSet class implements Set Interface. It represents the collection that
        uses a hash table for storage. Hashing is used to store the elements
        in the HashSet. It contains unique items.
         */
        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Trap");
        set1.add("Java");
        set1.add("ABC");
        set1.add("D");
        set1.add("F");
        set1.add("J");
        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        NamesAll n4 = new NamesAll(nameFive);
        n4.tellName();
        numDashedLine();
        /*
        LinkedHashSet
        LinkedHashSet class represents the LinkedList implementation of Set Interface. It
        extends the HashSet class and implements Set interface. Like HashSet, it also
        contains unique elements. It maintains the insertion order and permits null elements.
         */
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Java");
        set2.add("Trap");
        set2.add("Java");
        set2.add("ABC");
        set2.add("D");
        set2.add("F");
        Iterator<String> itr2 = set2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        NamesAll n5 = new NamesAll(nameSix);
        n5.tellName();
        numDashedLine();

        /*
        SortedSet Interface
        SortedSet is the alternate of Set interface that provides a total ordering
        on its elements. The elements of the SortedSet are arranged in the
        increasing (ascending) order. The SortedSet provides the additional methods
        that inhibit the natural ordering of the elements.
        SortedSet<data-type> set = new TreeSet();

         */
        /*
        TreeSet
        Java TreeSet class implements the Set interface that uses a tree for storage.
        Like HashSet, TreeSet also contains unique elements. However, the access and
        retrieval time of TreeSet is quite fast. The elements in TreeSet stored
        in ascending order.
         */
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("Java");
        set3.add("Trap");
        set3.add("Java");
        set3.add("ABC");
        set3.add("F");
        set3.add("D");
        set3.add("A");
        Iterator<String> itr3 = set3.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        dashedLine();
        SortedSet set4 = new TreeSet();
        set4.add("John");
        set4.add("Bob");
        set4.add("Smith");
        Iterator iterator1 = set4.iterator();
        while (iterator1.hasNext()) {
            Object element = iterator1.next();
            System.out.println(element.toString());
        }

        NamesAll n6 = new NamesAll(nameSeven);
        n6.tellName();
        numDashedLine();

        /*
        List interface
        List interface is the child interface of Collection interface. It
        inhibits a list type data structure in which we can store the
        ordered collection of objects. It can have duplicate values.
        List interface is implemented by the class ArrayList, LinkedList, Vector, and Stack.
        List <data-type> list1 = new ArrayList();
        List <data-type> list1 = new LinkedList();
        List <data-type> list1 = new Vector();
        List <data-type> list1 = new Stack();
        Methods in List interface that can be used to insert, delete, and access the elements
        from the list.

         */
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Trap");
        stringList.add("Java");
        stringList.add("ABC");
        stringList.add("A");
        stringList.add("A");
        for (String allList : stringList)
            System.out.println(allList);

        NamesAll n7 = new NamesAll(nameEight);
        n7.tellName();
        numDashedLine();
        /*
        ArrayList
        The ArrayList class implements the List interface. It uses a dynamic array to store
        the duplicate element of different data types. The ArrayList class maintains
        the insertion order and is non-synchronized. The elements stored in the ArrayList
        class can be randomly accessed.
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Trap");
        arrayList.add("Java");
        arrayList.add("ABC");
        arrayList.add("F");
        arrayList.add("A");

        Iterator iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        NamesAll n8 = new NamesAll(nameNine);
        n8.tellName();
        numDashedLine();
        /*
        LinkedList
        LinkedList implements the Collection interface. It uses a doubly linked list
        internally to store the elements. It can store the duplicate elements.
        It maintains the insertion order and is not synchronized. In LinkedList,
        the manipulation is fast because no shifting is required.

         */

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Trap");
        linkedList.add("Java");
        linkedList.add("ABC");
        linkedList.add("F");
        linkedList.add("A");
        Iterator<String> iterator3 = linkedList.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        NamesAll n9 = new NamesAll(nameTen);
        n9.tellName();
        numDashedLine();
        /*
        Vector
        Vector uses a dynamic array to store the data elements. It is similar to ArrayList.
        However, it is synchronized and contains many methods that are not the part of
        Collection framework.
         */
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Trap");
        vector.add("Java");
        vector.add("ABC");
        vector.add("F");
        vector.add("A");
        Iterator<String> iterator4 = vector.iterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }

        NamesAll n10 = new NamesAll(nameEleven);
        n10.tellName();
        numDashedLine();
        /*
        Stack
        The Stack is the subclass of Vector. It implements the last-in-first-out data
        structure, i.e., Stack. The Stack contains all of the methods of
        Vector class and also provides its methods like boolean push(),
        boolean peek(), boolean push(object o), which defines its properties.
         */
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Trap");
        stack.push("Java");
        stack.push("ABC");
        stack.push("A");
        stack.push("F");
        stack.push("W");
        stack.pop();

        Iterator<String> iterator5 = stack.iterator();
        while (iterator5.hasNext()) {
            System.out.println(iterator5.next());
        }

        dashedLine();
        /*
        Array-Based Stack Implementation
        As our first implementation of the stack ADT, we store elements in
        an array, named data, with capacity N for some fixed N. We
        oriented the stack so that the bottom element of the stack
        is always stored in cell data[0], and the top element of the
        stack in cell data[t] for index t that is equal to one
        less that the current size of the stack.
         */

        StackInterface<Integer> stackInterface = new ArrayStack<>();
        stackInterface.push(5);
        stackInterface.push(3);
        System.out.println("Size " + stackInterface.size());
        System.out.println("pop " + stackInterface.pop());
        System.out.println("Is empty ? " + stackInterface.isEmpty());
        System.out.println("pop " + stackInterface.pop());
        System.out.println("Is empty ? " + stackInterface.isEmpty());
        System.out.println("pop " + stackInterface.pop());
        stackInterface.push(7);
        stackInterface.push(9);
        System.out.println("top " + stackInterface.top());
        stackInterface.push(4);
        System.out.println("Size " + stackInterface.size());
        System.out.println("pop " + stackInterface.pop());
        stackInterface.push(6);
        stackInterface.push(8);
        System.out.println("Size " + stackInterface.size());
        System.out.println("pop " + stackInterface.pop());

        dashedLine();
        /*
        Implementing a Stack with a Singly Linked List
        We demonstrate how the Stack interface can be easily implemented
        using a singly linked list for storage. Unlike our array-based
        implementation, the linked-list approach has memory usage
        that is always proportional to the number of actual elements currently
        in the stack, and without an arbitrary capacity limit.

        Singly Linked Lists
        The linked list instance must keep a reference to the first node
        of the list, known as the head. Without an explicit reference to the
        head, there would be no way to locate that node (or indirectly, any
        others). The last node of the list is known as the tail. The tail
        of a list can be found by traversing the linked list - starting at
        the head and moving from one node to another by following each
        node's next reference. We can identify the tail as the node
        having null as its next reference. This process is also known as link
        hopping or pointer hopping.
         */
        StackInterface<Integer> stackInterface2 = new LinkedStack<>();
        stackInterface2.push(6);
        stackInterface2.push(4);
        System.out.println("Size " + stackInterface2.size());
        System.out.println("pop " + stackInterface2.pop());
        System.out.println("Is empty ? " + stackInterface2.isEmpty());
        System.out.println("pop " + stackInterface2.pop());
        System.out.println("Is empty ? " + stackInterface2.isEmpty());
        System.out.println("pop " + stackInterface2.pop());
        stackInterface2.push(8);
        stackInterface2.push(10);
        System.out.println("top " + stackInterface2.top());
        stackInterface2.push(3);
        System.out.println("Size " + stackInterface2.size());
        System.out.println("pop " + stackInterface2.pop());
        stackInterface2.push(7);
        stackInterface2.push(9);
        System.out.println("Size " + stackInterface2.size());
        System.out.println("pop " + stackInterface2.pop());

        dashedLine();
        /*
        Java Stack Basics
        A Stack is a data structure where you add elements to the "top"
        of the stack, and also remove elements from the top again.
        This is also referred to as the "Last In First Out (LIFO)" principle.
        In contrast, a Java Queue uses a "First In First Out (FIFO)" principle,
        where elements are added to the end of the queue, and removed from
        the beginning of the queue.
        Stack stack = new Stack();

        Stack with a Generic Type
        Stack<String> stack = new Stack<String>();

        Push Element on Stack
        Once  you have a Java Stack instance, you can push elements to the top
        of the Stack. The elements you push onto the Stack must be Java
        objects.
        stack.push("1");

        Pop Element From Stack
        Once an element has been pushed onto a Java Stack, you can pop that element
        from the Stack again. Once an element is popped off the Stack, the element is
        removed from the Stack. The top element of the Stack is then whatever element
        that was pushed onto the Stack just before the element just popped.
         */
        Stack<String> stack2 = new Stack<>();
        stack2.push("Java");
        stack2.push("1");
        stack2.push("2");
        stack2.push("3");
        int index = stack2.search("2");
        int size = stack2.size();
        String topElement = stack2.pop();
        System.out.println(" top:" + topElement + " search:" + index + " size:" + size);
        Iterator iterator6 = stack2.iterator();
        while (iterator6.hasNext()) {
            Object value = iterator6.next();
            System.out.println(value);
        }
        /*
        Process Stack Using Stream
        It is also possible to process the elements on a Java Stack via
        the Java Stream Api. You do so by first obtaining a Stream
        from the Stack via the stream() method.
         */

        Stream stream = stack2.stream();
            stream.forEach((element) -> {
                System.out.println(element);
            });

        dashedLine();
        /*
        Reverse List Using Stack
        You can use a Java Stack to reverse a Java List. You do so
        by pushing all the elements from the List onto the Stack,
        starting with the element with index 0, then 1 etc. Each element
        is removed from the List, then pushed onto the Stack. Once all the elements
        are on the Stack, you pop the elements off one by one and add them
        back to the empty list.
         */

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        System.out.println(list2);
        Stack<String> stack3 = new Stack<>();

            while (list2.size() > 0) {
                stack3.push(list2.remove(0));
            }
            while (stack3.size() > 0) {
                list2.add(stack3.pop());
            }
            System.out.println("Revers List using Stack: " + list2);

        dashedLine();
        List<String> list3 = new ArrayList<>();
        list3.add("D");
        list3.add("E");
        list3.add("F");
        System.out.println(list3);
        List<String> listN = reverse((ArrayList<String>) list3);
        System.out.println("Revers List using Stack: " + listN);
    }

    public static List<String> reverse(ArrayList<String> n) {
        Stack<String> stack4 = new Stack<>();
        while (!n.isEmpty()) {
            stack4.push(n.get(0));
            n.remove(0);
        }
        while (!stack4.isEmpty()) {
            n.add(stack4.pop());
        }
        return n;
    }


    public static void numDashedLine() {
        count++;
        System.out.println(count + ". " + dashed);
    }

    public static void dashedLine() {
        System.out.println(dashed);
    }
}