public class page148_ringQueue {

    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num; // 현재 데이터 개수

    // 큐가 비어있을 시
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    // 큐가 가득찼을 시
    public class OverflowQueueException extends RuntimeException {
        public OverflowQueueException() {
        }
    }

    public page148_ringQueue(int maxlen) {
        num = 0; // 현재 데이터 갯수, 가득 찼을 시 num = capacity
        front = 0;
        rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            capacity = 0;
        }
    }

    // 인큐
    public int enque(int x) throws OverflowQueueException {
        if (num >= capacity) {
            throw new OverflowQueueException();
        }
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    // 디큐
    public int deque() throws EmptyIntQueueException {
        if (num <= 0) {
            new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if (front == capacity) {
            front = 0;
        }

        return x;
    }

    // peek
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) {
            new EmptyIntQueueException();
        }
        return que[front];
    }

    // 큐 비움
    public void clear() {
        num = 0;
        front = 0;
        rear = 0;
    }

    // 인덱스 찾기 or 없으면 -1 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (front + i) % capacity;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

    // 큐 용량 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐에 쌓여있는 데이터 개수 반환
    public int size() {
        return num;
    }

    // 큐 비어있는지 확인
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득찼는지 확인
    public boolean isFull() {
        return num >= capacity;
    }

    // 큐 모든 데이터 출력
    public void dump() {

        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
}
