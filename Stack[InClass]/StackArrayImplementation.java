/*
    int top=-1; // index of current top
    int a[] // array which contain element of stack 
*/
// function to add element in the stack
//x=element to be added
//size=maximum size of array

    //a = [3,2,5], top = 2, size = 3
    //3 2 4 pop 5

void push(int x, int size)
{
    if(top == size - 1){
        System.out.println("Stack overflow");
        return;
    }
    top++;
    a[top] = x;
}

// Function to pop element from stack
void pop()
{
    if (top == -1){
        System.out.println("Stack underflow");
        
    }
    else{
        top--;
    }
}

void top()
{
    if(top == -1) {
        System.out.println("Empty stack");
    }
    else{
        System.out.println(a[top]);
    }
    
}