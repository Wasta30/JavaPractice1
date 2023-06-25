package day48_Collection;

import java.util.*;

public class ListIntro {
    // in order to use list import it first from java util

    public static void main(String[] args) {

        // i can only give wrapper class if want to use
        //list can be referenced to these three because of polymorphism and it has is a relationship
      //  List<Integer>list1 = new Stack<>();
      //  List<Integer> list1 = new Vector<>();
      //  List<Integer> list1 = new ArrayList<>();


        /*
        means whatever the behaviiour of list applies to all these three
        they do jave different use cases also
        ArrayList internally uses the array means it store the element in the same way as array
        array is faster so arraylist is faster than vector stack
        accesing element is faster in array list
        List has get method so all the three has
         */



        /*
        LinkedList : doublylinked list : elements have pointer towards each other
        LinkedList internally uses the doublyLinked list
        and whnever u want to increase and decrease the size the linkedList is faster
        Add and remove method is faster in LinkedList

        the moement that u add element its going to move pointer towards the next element and the same goes when u remove the elemnt
        Lets say if B is removed i have to use the pointer towards C
        however in the arrayList0 can i keep the gaap ? between 10 and 30 ? no  u need to connect them



 VECTOR class : its simliar to arrayList , it internally uses the array the only difference is vector is synchronized
 means whenever this data structure is used in multi threading environment then its going to be thread safe


Process :
Waht is process :every single applicatiojjn / instance of application
instance of the programing running  in your computer for ex when u open power point u open a power point window which is a instance
ex : zoom ,when i opend it i am running the instance of that application
Is is possible that multiple instance can be opened ffrom one application ?
Can i have 4 differennt power point that are opened or two diff window are open : yes u can have multiple instance of one program and operating system is behind which is schedlhing these process
so the better term for process is the execution instance of the program
program can be discord zoom etc



Every single process have some innternal action for ex making slide in power point , making classes in intellij
how do u think these action are done ? by cretaing thread so the defination of thread is it is the just sequence of execution with a process
so is atleast one thread for each process otherwise the process wont exist
any execution in a process is done by creating thread
for ex my process is chrome and i opned the new tab so do new tab has all resources of chrome yes it does so it means it shares all the resources of the process
so multiple thread can be created form the process and process can be any runnign application
thread will not exist
Any instance of programm is a process and any action that are done in the instance of the program is known as thread
thread can be multiple : one process can have one thread : this is calledmulti thread
in order to ensure the thread safety we need to synchronized it : means process of controlling multiplee thread :
for ex if there are multi thread do u want all of them to access the resource at the same time or one thread accesing the resoruce at one time
so one thread accessing the resources is callled synchronized
so when on threads access the resources its get locked and other thread can not access the resource , these resource will only be unlocked when the thread is finsihed executing , and once this thread completed the next thread will be locked by the resrouce , synhconized means : one thread at a time

for ex atm machine (husband and widfe example)
when u open the chrome browser u navigate to specfic website how do u thibbk we  navigate to specigic website by creating thread

each vector gets the resoure on at the time and the disadvantage is its slower compare to others like arrayList


STACK CLASS: it is the child of vector








         */


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50));

        // so when we use get method ( means access element array list is faster)
        System.out.println("list.get(0) = " + list.get(0));

        // so now u are insterting linkedList has the fastest performance
        List<Integer>list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println("list1.get(0) = " + list1.get(0));


        // it provide thread safe ( methods are synchronized)
        List<Integer> list2 = new Vector<>();
         list2.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println("list2.get(0) = " + list2.get(0));


        List<Integer>list3 = new Stack<>();
         list3.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println("list3.get(0) = " + list3.get(0));

//

        // what is the difference between stack and vector ?
        // the only difference is the order of stack ( this stack has last in first out order (LIFO)
        //



        ((Stack)list3).pop(); // i did downcasting here because the parent here is LIST

        // when we use the pop action it removes the last element
        System.out.println(list3);

        // we will use array list most commonly , for containg element , or accessing element and forr this purpose
        // when thread safety is main concern we hahve to use vector \
        // what if if u want to insert or delet : use linkedList



        // how many child interface of collection do we have ?
        /*
        SET:
        the other child interface of collection is
        Set : it does not allow duplicate , like list allow duplicate
        if u have 5 same element only one will be accepted , the insertion order is not preserved , like its reserved in list
        // there are no index number

        so its oposite of list
        it has  a classes Hash Set, it does have a child called linkedhashset and a child interfac Sorted Set
  sorted set is implemnted by three set
  HASH set : its fastest one
  its does not keep order , it has random order so order not guarante
  u can also add nul value and it accept it , its best to remove element
  the second class : linkedhashset : maintain the order , means maintain the insertion order which ever element u set first will be the first one
  tree set : arrange in ascending order, not accept null value


         */









    }

public synchronized void method1(){
        // method in vector class are synchronized
    // thats is the only diffeerece between arraylist anf vector and also vector has a child class stack
    // so it means method in stack is also synchronized
}








}
