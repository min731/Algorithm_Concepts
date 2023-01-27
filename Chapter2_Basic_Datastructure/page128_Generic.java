public class page128_Generic {

    // 다양한 클래스를 받을 수 있는 Generic
    static class GenericClass<T>{

        private T xyz;
        GenericClass(T t){
            this.xyz = t;
        }

        T getXyz(){
            return xyz;
        }
    }

    public static void main(String[] args) {
        
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());


    }
    
}
