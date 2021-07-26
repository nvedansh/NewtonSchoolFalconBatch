public static void push(Stack<Integer> st, int x)
{
    st.push(x);
}

// Function to pop element from stack
public static void pop(Stack<Integer> st)
{
    if(!st.empty())
        st.pop();
}

public static void top(Stack<Integer> st)
{
    if(!st.empty()){
        System.out.println(st.peek());
    }
    else{
        System.out.println(0);
    }
}