package com.kuang.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //
        char grade='A';
        switch(grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("很好");
                break;
            case 'C':
                System.out.println("良好");
                break;
            default:
                System.out.println("你今天真好看");
                break;

        }
    }
}
