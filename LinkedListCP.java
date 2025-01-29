package java_code.linked_list;
import java.util.LinkedList;

public class LinkedListCP {
    public static void main(String[] args){
        LinkedList <String> list=new LinkedList <String>();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        System.out.println(list.reversed()); //it do not actually reverse the list .....just print the reversed list;

        list.removeFirst();
        System.out.println(list);
        

    }
}
