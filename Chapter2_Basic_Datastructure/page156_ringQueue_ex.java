public class page156_ringQueue_ex {

    public static void main(String[] args) {

        page148_ringQueue ringQue = new page148_ringQueue(64);

        System.out.println(ringQue.isEmpty());
        System.out.println(ringQue.isFull());
        System.out.println("--------------------");

        ringQue.enque(1);
        ringQue.enque(21);
        ringQue.enque(5);
        ringQue.enque(17);
        ringQue.enque(8);
        ringQue.enque(1);
        System.out.println(ringQue.isEmpty());
        System.out.println(ringQue.isFull());
        ringQue.dump();
        System.out.println("--------------------");

        int int_deque = 0;
        int_deque = ringQue.deque();
        System.out.println(int_deque + "반환");
        System.out.println(5 + "의 인덱스 : " + ringQue.indexOf(5));
        int_deque = ringQue.deque();
        System.out.println(int_deque + "반환");
        System.out.println(5 + "의 인덱스 : " + ringQue.indexOf(5));
        ringQue.dump();
        System.out.println("--------------------");

        System.out.println(5 + "의 인덱스 : " + ringQue.indexOf(5));
        System.out.println("peek: " + ringQue.peek());

        System.out.println("--------------------");
        ringQue.dump();
        System.out.println("최대용량: " + ringQue.getCapacity());
        System.out.println("현재 용량: " + ringQue.size());

        System.out.println("--------------------");
        ringQue.clear();
        ringQue.dump();
        ringQue.enque(33);
        ringQue.dump();
        System.out.println(33 + "의 인덱스 : " + ringQue.indexOf(33));
        System.out.println(5 + "의 인덱스 : " + ringQue.indexOf(5));

    }
}
