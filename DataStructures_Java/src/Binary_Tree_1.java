
import java.util.*;
public class Binary_Tree_1 {

	static class Node{
		Node lc,rc;
		int data;
	}
	static Scanner s=new Scanner(System.in);
	static int count=0;
	static public void main(String[] args) {
		int ch;
		Node root=new Node();
		do {
		System.out.print("\n\tMENU:-\n1)INSERT\n2)TRAVERSE(Inorder)\n3)WIDTH\n4)HEIGHT\n7)EXIT\nCHOICE:");
		ch=s.nextInt();
		switch(ch) {
		case 1:
			System.out.print("\nINSERT:-\n");
			System.out.print("\nENTER THE DATA:");
			int d=s.nextInt();
			if(count==0) {
				root.data=d;
				count++;
				System.out.print("\nROOT NODE INSERTED!");
			}else {
				insert(root,d);
			}
			break;
			
		case 2:
			System.out.print("\n\tTRAVERSAL:-\n");
			if(count==0) {
				System.out.print("\nNo Nodes To Traverse!");
			}else {
				traverse(root);
			}
			break;
		default:
			System.out.print("\nINVALID CHOICE!");
		}
		}while(ch!=7);
	}
	
	static void insert(Node root,int data) {
		if(root==null)
			return;
		if(root.lc == null) {
			System.out.print("\nEnter Node as LC of "+root.data+":");
			int c=s.nextInt();
			if(c==1) {
				Node tmp=new Node();
				tmp.data=data;
				root.lc=tmp;
				System.out.print("\nNODE INSERTED AS LC !");
				count++;
			}
		}
		if(root.rc == null) {
			System.out.print("\nEnter Node as RC of "+root.data+":");
			int c=s.nextInt();
			if(c==1) {
				Node tmp=new Node();
				tmp.data=data;
				root.rc=tmp;
				System.out.print("\nNODE INSERTED AS RC !");
				count++;
			}
		}
		insert(root.lc,data);
		insert(root.rc,data);
	}
	//-------TRAVERSAL--------------------
	static void traverse(Node root) {
		if(root==null)
			return;
		
		traverse(root.lc);
		System.out.print("\t"+root.data);
		traverse(root.rc);
	}
}
