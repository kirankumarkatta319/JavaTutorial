package abstraction;

class SuperClassA {

        public void foo(){
            System.out.println("abstraction.SuperClassA");
        }

    }

    class SubClassB extends SuperClassA{

        public void bar(){
            System.out.println("abstraction.SubClassB");
        }

    }

    public class Test {
        public static void main(String args[]){
            SubClassB a = new SubClassB();

            a.foo();
            a.bar();
        }
    }

