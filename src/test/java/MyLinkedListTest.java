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
    @Test
    public void given3NumbersWhenDeletedFirstElementShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode =new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode =new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.pop();
        boolean result=myLinkedList.head.equals(mySecondNode)&&
                myLinkedList.head.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenDeletedLastElementShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode =new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode =new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popLast();
        boolean result=myLinkedList.head.equals(myFirstNode)&&
                myLinkedList.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenSearchedShouldPassLinkedListResult()
    {
        INode tempNode;
        MyNode<Integer> myFirstNode =new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode =new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        tempNode=myLinkedList.search(30);
        Assert.assertEquals(30,tempNode.getKey());
    }
    @Test
    public void given3NumbersWhenInsertedOneElementAfterShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode =new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode =new MyNode<>(70);
        MyNode<Integer> myNewNode=new MyNode<>(40);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insertAfter(mySecondNode,myNewNode);
        boolean result=myLinkedList.head.equals(myFirstNode)&&
                myLinkedList.head.getNext().equals(mySecondNode)
                &&myLinkedList.head.getNext().getNext().equals(myNewNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenDeletedOneElementAfterShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode =new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode =new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.deleteAfter(myThirdNode);
        boolean result=myLinkedList.head.equals(myFirstNode)&&
                myLinkedList.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
    }

}


