public class Test {
    public static void main(String[] args) {
        String hold = "";
        MyStack st = new MyStack(5);
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(1);
        st.push(8);
        System.out.println(st.elements());
        for(int i = 0; i < st.getCapacity(); i++){
            System.out.println(st.pop());
        }


    }
}
