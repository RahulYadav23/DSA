package com.LinkedList;

public class LinkedListCustom {

    private  int size;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    LinkedListCustom()
    {
        this.size=0;
    }
    private Node head;
    public void addback(int data)
    {
          Node newNode = new Node(data);
          if(this.head==null)
          {
              this.head=newNode;
          }else {
                Node p1 = this.head;
              while (p1.next!=null)
              {
                  p1=p1.next;
              }
              p1.next=newNode;
          }
          this.size++;
    }
    public Node removeback()
    {    Node ans =null;
        if(head==null)
        {
            System.out.print("Empty list");
            return null;
        }
        if(this.size==1)
        {
           ans = this.head;
            this.head=null;
            this.size--;

        }
        else
        {
            Node p1=head;
            Node p2 = p1.next;
            while(p2.next!=null)
            {
                p2=p2.next;
                p1=p1.next;
            }
            ans =p2;
            p1.next=null;
            this.size--;

        }
        return ans;
    }
    public void addfront(int data)
    {  Node newNode = new Node(data);
        if(this.head==null)
        {
            this.head=newNode;
            this.size++;
        }
        else
        {
            Node p1 = this.head;
            this.head=newNode;
            newNode.next=p1;
            this.size++;
        }
    }
    public void removeFront()
    {
        if(this.head==null)
        {
            System.out.println("Empty list");
        }
        if(this.head.next==null)
        {
            this.head=null;
            this.size--;
        }
        else
        {
            Node p1 = this.head;
            this.head=this.head.next;
            p1.next=null;
            this.size--;
        }

    }
    public int printMiddle()
    {   Node slow=this.head;
        Node fast=this.head;
        if(this.head==null)
            return -1;
        else
        {
            while (fast!=null&&fast.next!=null)
            {
               slow=slow.next;
               fast=fast.next.next;
            }
        }
        return slow.data;
    }
    public void deleteNPos(int n)
    {
        if(this.head==null||n>this.size||n<0)
        {
            System.out.println("Not vaild");
        }
        if(n==1)
        {
            Node p1 = this.head;
            this.head=this.head.next;
            p1.next=null;
        }
        else {
            Node p1 = this.head;
            int i=1;
            while (i<n-1)
            {   i++;
                p1 = p1.next;
            }
            Node p2 =p1.next;
            p1.next=p1.next.next;
            p2.next=null;

        }
    }
    public int getat(int pos)
    {   Node node;
        if((this.head==null)||pos>this.size||pos<0)
            return -1;
        else {
            Node p1 = this.head;
            int i=1;
            while (i<pos)
            {   i++;
                p1=p1.next;
            }
            node =p1;
        }
        return node.data;
    }

    public void displaylist()
    {
        if(this.head==null)
            System.out.println("Empty list");
        else {
            Node p1 = this.head;
            while (p1!=null)
            {
                System.out.print(p1.data+"->");
                p1=p1.next;

            }
            System.out.print("null");
        }
        System.out.println();
    }
    public void insertPos(int data,int pos)
    {
        Node newNode = new Node(data);
        if(pos<1||pos>this.size)
            System.out.println("Invalid pos");
        if(pos==1)
        {
            addfront(data);
        }
        else
        {
            Node p1  =this.head;
                int i=1;
                while(i<pos-1)
                {   //System.out.println(p1.data+"    "+i);
                    p1=p1.next;
                    i++;
                }
                newNode.next=p1.next;
                p1.next=newNode;
                this.size++;

        }
    }
    public  void reverse()
    {
        Node curr =this.head;
        Node prev =  null;
        Node next =null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        this.head=prev;
    }

}
