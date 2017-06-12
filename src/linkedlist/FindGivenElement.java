package linkedlist;

import com.sun.scenario.effect.impl.state.LinearConvolveKernel;

/**
 * Created by Shailendra on 2/11/2017.
 */
public class FindGivenElement {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList(10);
        linkedList.next= new LinkedList(20);
        linkedList.next.next= new LinkedList(30);
        linkedList.next.next.next=new LinkedList(40);

        boolean result = findGivenElement(linkedList,50);
        System.out.println(result);
    }

    public static boolean findGivenElement(LinkedList headNode, int data) {

        if(headNode==null) {
            return false;
        }

        //LinkedList currentNode=headNode;

        while(headNode!=null) {
            if(headNode.data==data) {
                return true;
            }else {
                headNode=headNode.next;
            }
        }
        return false;
    }
}


