public class Stack {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data){
        Node newNode= new Node(data);
        if(head==null)
            head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void print(){
        Node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+"--->");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }

    public static void main(String[] args){
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.print();

    }
}
