package Alg.Hw3;

import Alg.Hw3.MyList.MyFirstLinkList;

public class Main {
    public static void main(String[] args) {
        MyFirstLinkList linkList = new MyFirstLinkList();

        linkList.myListAdd(1);
        linkList.myListAdd(2);
        linkList.myListAdd(3);
        linkList.myListAdd(4);
        linkList.myListAdd(5);
        linkList.myListAdd(1);
        linkList.myListAdd(1);
        linkList.myListAdd(6);
        linkList.myListAdd(1);
        linkList.myListAdd(7);
        linkList.myListAdd(1);


//        linkList.myAddFirst(1);
//        linkList.myAddFirst(2);
//        linkList.myAddFirst(3);
//        linkList.myAddFirst(4);
//        linkList.myAddFirst(5);
        //linkList.myAddFirst(6);

        linkList.print();

        //linkList.reverse();
        //linkList.print();

        linkList.myDelete(1);
        linkList.print();

        linkList.reverse();
        linkList.print();
    }
}
