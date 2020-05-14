import java.util.LinkedList;
public class daySeven {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        // list1.add("Testing");
        // 1
        System.out.println(isItEmpty(list1));
        // 2
        addNode(list1, "Testing our second method");
        System.out.print(list1);
        // 3
        makeEmpty(list1, null);
        System.out.print(list1);
        //4
        listNode(list1);

    }
    // creating method for #1
    // void only executes code, doesn't return a value ^^^
    // methods like this dont have have to be defined before main method, just have
    // to be within the class scope (*public class daySeven here*)
    public static boolean isItEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void addNode(LinkedList<String> list, String nodeData) {
        list.add(nodeData);
    }
    public static void makeEmpty(LinkedList<String> list, String response) {
        if (list.size() == 0) {
            System.out.println("List was already empty");
        } else {
            list.clear();
            System.out.println("The list is now empty");
        }
    }
    public static void listNode(LinkedList<String> list){
        for(int i = 1; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    //Answer 5
    public static void deleteSpecificNode(LinkedList<String> list, int i){
        for (int j = 0; j < list.size(); i++){
            if (list.get(j) == i){
                list.remove(j);
            }
        }
    }
    //Answer 6
    public static void removeOccurance(LinkedList<String> list, String occurance){
        list.remove(occurance);
    }
    //Answer 7
    public static void addNodeBeg(LinkedList<String> list, String head){
        list.addFirst(head);
    }
    //Answer 8
    public static void addNodeInd(LinkedList<String> list, int index, String node){
        list.add(index, node);
    }
    //Answer 9
    public static addList(LinkedList<String> listOne, LinkedList<String> listTwo){
        if (listOne.size() == 0){
            return;
        } else{
            for (int i = 0; i < listOne.size(); i++){
                addNode(listTwo, listOne.get(i));
            }
        }
        return listOne;
    }
    //Answer 10
}   public static void reversePrint(LinkedList<String> list){
    for (int i = list.size()-1; i >= 0; i--){
        System.out.println(list.get(i));
    }
}