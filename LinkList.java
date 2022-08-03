


class LinkList{

    private node head;
    private node tail;
    private int size;
    //constructors 
    LinkList(){
        this.size=0;
    }
    
     //insertion from front
      public void insertionFirst(int val)
      {
        node node=new node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=node;
        }
         size+=1;
      }

      //insertion from last of linklistt
      public void insertionLast(int val){
       
        if(tail==null)
        {
           insertionFirst(val);
            size+=1;
            return;
        }
        node node=new node(val);
        tail.next=node;
        tail=node;
        size+=1;
      }

      //insertion in between the list 
      public void insertion(int value,int index)
      {
        int i=1;
        node temp=head;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        node node =new node( value,temp.next);
         temp.next=node;
        size+=1;

      }

private class node{

    int val;
    node next;

    //constructors 
     public node (int value){
        this.val=value;
     }
     public node(int value,node next){
        this.val=value;
        this.next=next;
     }

}


//method for displaying whole linkedlist
public void display(){
    node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.val);
        temp=temp.next;
    }
}

public static void main(String[] args)
{
    LinkList ll=new LinkList();
    ll.insertionFirst(23);
    ll.insertionFirst(24);
    ll.insertionFirst(28);
    ll.insertionFirst(29);
    ll.insertionLast(100);
    ll.insertionLast(743);
    ll.insertion(1,3);
    ll.display();
}

}