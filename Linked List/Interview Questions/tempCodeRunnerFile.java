blic static void main(String[] args) {
        reverse_K_group list = new reverse_K_group();
        list.addLast(1);
        list.addLast(2); 
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.display();
       int length = list.getLength(list.head);
       System.out.println(length);
        Node newNode = list.reverseKGroup(list.head, 2);
        list.display();