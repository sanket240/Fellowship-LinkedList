import org.junit.Assert;
import org.junit.Test;
public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenLinkedShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenLinkedShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenInsertingInBetweenShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode =new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode =new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        boolean result=myLinkedList.head.equals(myFirstNode)&&
                myLinkedList.head.getNext().equals(mySecondNode)
                &&myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

}


