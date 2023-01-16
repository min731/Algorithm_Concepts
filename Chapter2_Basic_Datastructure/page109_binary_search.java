public class page109_binary_search {

    static int binSearch(int [] arr,int num){

        // 7
        // 15,27,39,77,92,108,121
        //  0  1  2  3  4  5   6
        //  p1       pc        pr

        int pl = 0;             // pl 0
        int pc = arr.length/2;  // pc 3
        int pr = arr.length-1;  // pr 6
        System.out.println("pl:" + pl + " pc:" + pc + " pr:" + pr);

        while(arr[pc]!=num){ // num == 121

            if(num<arr[pc]){ // 

                                    // pl = 
                pr = pc-1;          // pr = 
                pc -=(pc-pl+1)/2;   // pc = 
            }
            else{// arr[pc] < 108
                pl = pc+1;     // pl = 4 
                pc += (pr-pc+1)/2;   // pc = 4 
                              // pr = 6
            }
            System.out.println("pl:" + pl + " pc:" + pc + " pr:" + pr);

            if (pl>pc || pr<pc){
                return -1;
            }
        }
        
        return pc;
    }


    public static void main(String[] args) {
        
        // 이진 검색: 이미 정렬 되어있는 자료구조에 사용
        int [] arr = {15,27,39,77,92,108,121};

        System.out.println(binSearch(arr,121));

    }
    
}
