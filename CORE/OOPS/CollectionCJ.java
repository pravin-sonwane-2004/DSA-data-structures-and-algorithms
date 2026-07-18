import java.util.*;
class CollectionCJ {
  void main() {
    List<Integer>list = new ArrayList<>(Arrays.asList(2,3,45,6,788,9,0));
        IO.println(list);
    //to use listIterator we need to provide the size of the list in its constructor r
    ListIterator it = list.listIterator(list.size());
    while(it.hasPrevious()) {
      it.previous(); 
      it.remove();                     // Remove the element from the list
    }
    IO.println(list);
  }
}