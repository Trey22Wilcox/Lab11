public class BlueRayCollection {
    public Node head;
    public BlueRayCollection(){
        this.head = null;
    }
    public void add(String t, String d, int y, double c){
        BlueRayDisk data = new BlueRayDisk(t, d, y, c);
        Node newN = new Node(data);
        if(head == null){
            head = newN;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newN;
        }
    }
    public void show_all(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
