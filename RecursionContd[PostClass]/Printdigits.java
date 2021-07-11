static void Print_Digits(int N){
    if(N==0){return;}
    Print_Digits(N/10);
    int x=N%10;
    if(x==1){System.out.print("one ");}
    else if(x==2){System.out.print("two ");}
    else if(x==3){System.out.print("three ");}
    else if(x==4){System.out.print("four ");}
    else if(x==5){System.out.print("five ");}
    else if(x==6){System.out.print("six ");}
    else if(x==7){System.out.print("seven ");}
    else if(x==8){System.out.print("eight ");}
    else if(x==9){System.out.print("nine ");}
    else if(x==0){System.out.print("zero ");}
    
}