import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;

public class page133_stack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Stack<Integer> stack1 = new Stack<>();

        st = new StringTokenizer(br.readLine());

        // stack에 데이터 넣기
        int n = 0;
        for (int i = 0; i < 5; i++) {
            n = Integer.parseInt(st.nextToken());
            stack1.push(n);
        }

        Iterator iter;

        iter = stack1.iterator();

        bw.write("Stack에 데이터 넣기" + "\n");
        while (iter.hasNext()) {
            bw.write(iter.next().toString() + " ");
        }

        bw.flush();
        bw.newLine();

        // stack에서 데이터 빼기

        stack1.pop();
        stack1.pop();

        iter = stack1.iterator();

        bw.write("Stack에서 데이터 빼기" + "\n");
        while (iter.hasNext()) {
            bw.write(iter.next().toString() + " ");
        }
        bw.flush();
        bw.newLine();

        // isEmpty , peek, search
        bw.write("Stack 비어있는지 확인" + "\n");
        bw.write(String.valueOf(stack1.isEmpty()));
        bw.newLine();
        bw.write("Stack peek" + "\n");
        bw.write(String.valueOf(stack1.peek()));
        bw.newLine();
        bw.write("Stack 에서 '2' pop했을 때 순번 확인" + "\n");
        bw.write(String.valueOf(stack1.search(2)));
        bw.newLine();
        bw.flush();

        // 꽉 채워진 stack 예외처리
        stack1.push(99);
        stack1.push(99);
        iter = stack1.iterator();

        bw.write("Stack에 데이터 꽉 채우기" + "\n");
        while (iter.hasNext()) {
            bw.write(iter.next().toString() + " ");
        }
        bw.newLine();
        bw.write("꽉 찬 stack 예외처리" + "\n");

        try {
            // Stack 크기 고정이 안되는 듯함
            stack1.setSize(1);
            bw.write("사이즈 1 됌");
            stack1.push(1);
            bw.write("1 추가");
            stack1.push(1);
            bw.write("1 추가" + "\n");
            iter = stack1.iterator();
            while (iter.hasNext()) {
                bw.write(iter.next().toString() + " ");
            }
            bw.flush();
        } catch (Exception e) {
            bw.write("예외 처리 됌!" + "\n");
            bw.write(String.valueOf(e.getClass()));
        }

        bw.flush();

        bw.close();

    }

}
