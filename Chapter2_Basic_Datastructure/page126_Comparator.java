import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class page126_Comparator {

    static class PhyscData{

        private String name;
        private int height;
        private double vision;

        public PhyscData(String name,int height, double vision){
        
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;

        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{

            public int compare(PhyscData d1,PhyscData d2){
                
                return (d1.height>d2.height) ? 1: (d1.height<d2.height) ? -1 : 0;
                // 1 or -1 or 0 나옴
            }
        }

    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PhyscData [] x = {

            new PhyscData("강민하", 160, 1.0),
            new PhyscData("강민하1", 161, 1.1),
            new PhyscData("강민하2", 162, 1.2),
            new PhyscData("강민하3", 163, 1.3),
            new PhyscData("강민하4", 164, 1.4),
            new PhyscData("강민하5", 165, 1.5),
            new PhyscData("강민하6", 166, 1.6),
            new PhyscData("강민하7", 167, 1.7)
        };
        
        System.out.println("키가 몇cm인 사람을 찾고 있나요?:");

        int height = sc.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0),PhyscData.HEIGHT_ORDER);

        System.out.println(idx);

    }
}
