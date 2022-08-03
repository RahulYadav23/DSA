package com.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

    class Node{
        int data;
        Node leftchild;
        Node rightchild;
        Node(int data)
        {
            this.data=data;
            leftchild=rightchild=null;
        }
    }


    private Node root;

    Tree(){
        root=null;
    }
    //add the values in BST
    public void add(int value)
    {
        if(this.root==null)
        {
            this.root=new Node(value);
        }
        else
        {
            insert(this.root,value);
        }
    }
    //Inserting in BST manner duplicates are not allow
    private void insert(Node root,int value)
    {
        if(root.data==value)
        {
          return;
        }
        if(value< root.data)
        {
            if(root.leftchild==null)
            {
                root.leftchild= new Node(value);
            }
            else
            {
                insert(root.leftchild,value);
            }
        }
        else
        {
            if(root.rightchild==null)
            {
                root.rightchild= new Node(value);
            }
            else
            {
                insert(root.rightchild,value);
            }
        }
    }
    //traversal
    public void preorder()
    {
        System.out.println("Pre order");
        preorder(this.root);
    }
    private void preorder(Node root)
    {
        if(root==null)
            return;

        System.out.print(root.data+" ");
        preorder(root.leftchild);
        preorder(root.rightchild);
    }
    public void inorder()
    {   System.out.println("In order");
        inorder(this.root);
    }
    private void inorder(Node root)
    {
        if(root==null)
            return;

        inorder(root.leftchild);
        System.out.print(root.data+" ");
        inorder(root.rightchild);
    }
    public void postorder()
    {   System.out.println("post order");
        postorder(this.root);
    }
    private void postorder(Node root)
    {
        if(root==null)
            return;
        postorder(root.leftchild);
        postorder(root.rightchild);
        System.out.print(root.data+" ");
    }
    public void levelorder()
    {    System.out.println("level order");
        levelorder(this.root);
    }
    private void levelorder(Node root)
    {
        if(root==null)
        {
            System.out.println("the tree is empty");
        }
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty())
        {
            Node p = Q.remove();
            System.out.print(p.data+" ");
            if(p.leftchild!=null)
                Q.add(p.leftchild);
            if(p.rightchild!=null)
                Q.add(p.rightchild);

        }
    }
    //find the height of  tree BST
    public void height()
    {

        System.out.print(height(this.root));
    }
    private int height(Node root)
    {
        int lh,rh;
        if(root==null)
            return 0;
        lh = height(root.leftchild);
        rh= height(root.rightchild);

        if(lh>rh)
            return (1+lh);
        else
            return (1+rh);
    }
   //searching in tree
    public Boolean search(int key)
    {
        Node p = this.root;
        while (p!=null)
        {
            if(key<p.data)
                p=p.leftchild;
            else if(key> p.data)
                p=p.rightchild;
            else
                return true;
        }
        return false;
    }
    //find the min and maximum in binary search tree
    public Node min()
    {
        Node p = this.root;
        if(p!=null)
        {
            while (p.leftchild!=null)
                p=p.leftchild;
        }

        return p;
    }
    public Node max()
    {
        Node p =this.root;
        if(p!=null)
        {
            while (p.rightchild!=null)
                p=p.rightchild;
        }
        return p;
    }
    //count the total number of nodes in tree
    public int numbersOfNode()
    {   if(this.root==null)
        return 0;
        return numbersOfNode(this.root);
    }
    private int numbersOfNode(Node root)
    {
        if(root==null)
            return 0;
        return numbersOfNode(root.leftchild)+numbersOfNode(root.rightchild)+1;
    }
    //count the leaf nodes
    public int leafNode()
    {
        if(this.root==null)
            return 0;
        return leafNode(this.root);
    }
    private int leafNode(Node root)
    {
        if(root.leftchild==null&&root.rightchild==null)
            return 1;
        else if(root.leftchild==null)
            return leafNode(root.rightchild);
        else if(root.rightchild==null)
            return leafNode(root.leftchild);
        else
        return leafNode(root.leftchild)+leafNode(root.rightchild);
    }
    //delete the node
    public void delete(int key)
    {
        Node par = null;
        Node p = this.root;
        while (p!=null)
        {
            if(key==p.data)
                break;
            par=p;
            if(key>p.data)
                p=p.rightchild;
            else
                p=p.leftchild;
        }
        if(p==null)
            System.out.print("Element Not Found");
        else if(p.leftchild!=null&&p.rightchild!=null)
        {
             caseC(par,p);
        }
        else if(p.leftchild!=null||p.rightchild!=null)
        {
            caseB(par,p);
        }
        else
        {
            caseA(par,p);
        }
    }
    private void caseA(Node par, Node p)
    {
        if(par==null)
        {
            this.root=null;
        }
        if(par.leftchild==p)
        {
            par.leftchild=null;
        }
        else
        {
            par.rightchild=null;
        }
    }
    private void caseB(Node par,Node p)
    {   Node child;
        if(p.rightchild!=null)
        {
            child=p.rightchild;
        }
        else
        {
            child=p.leftchild;
        }
        if(par==null)
        {
            this.root=child;
        }
        if(par.leftchild==p)
        {
            par.leftchild=child;
        }
        else
        {
            par.rightchild=child;
        }
    }
    private void caseC(Node par,Node p)
    {
        Node succ = p.rightchild;
        Node parsucc = null;
        while (succ.leftchild!=null)
        {
            parsucc=succ;
            succ=succ.leftchild;
        }
        p.data=succ.data;

        if(succ.leftchild==null&&succ.rightchild==null)
        {
            caseA(parsucc,succ);
        }
        else
        {
            caseB(parsucc,succ);
        }

    }
    public void commonAssesctor1(int node_Data,int node_Data2)
    {
        System.out.println(commonAssesctor(this.root,node_Data,node_Data2).data);
    }

    private Node commonAssesctor(Node root,int node_Data,int node_Data2)
    {



        if(root==null)
            return null;

        if(root.data==node_Data||root.data==node_Data2)
          return root;


        Node leftside = commonAssesctor(root.leftchild,node_Data,node_Data2);
        Node rightside = commonAssesctor(root.rightchild,node_Data,node_Data2);

        if(leftside!=null && rightside!=null)
            return root;


        return leftside!=null?leftside:rightside;

    }

    public void call()
    {  ArrayList<Node> arr  = new ArrayList<>();
        hor(this.root,arr);

        right(this.root.rightchild,arr);

        for(Node x:arr)
        {
            System.out.print(x.data+" ");
        }
    }
    private void hor(Node root,ArrayList<Node> arr )
    {
        if(root==null)
            return;

        hor(root.leftchild,arr);
        arr.add(root);



    }
    private void right(Node root,  ArrayList<Node> arr )
    {
        if(root==null)
            return;
        arr.add(root);
        right(root.rightchild,arr);


    }

}
