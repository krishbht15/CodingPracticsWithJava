package hackerankDS;

import java.util.Scanner;

public class MainDS {
    public static void main(String[] args) throws Exception {
        String aa = "{}";
        String b = "()";
        String c = "[]";

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {
            String temp = s.next();
            StackUsingA stackUsingA = new StackUsingA(temp.length());
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '{' || temp.charAt(j) == '[' || temp.charAt(j) == '(') {
                    stackUsingA.push(temp.charAt(j));
                } else if (j > 0) {
                    if (temp.charAt(j) == '}' || temp.charAt(j) == ']' || temp.charAt(j) == ')') {

                        if(stackUsingA.getTop()>=0) {
                            if ((aa.charAt(0) == stackUsingA.getData()[stackUsingA.getTop()] && aa.charAt(1) == temp.charAt(j))
                                    || (b.charAt(0) == stackUsingA.getData()[stackUsingA.getTop()] && b.charAt(1) == temp.charAt(j))
                                    || (c.charAt(0) == stackUsingA.getData()[stackUsingA.getTop()] && c.charAt(1) == temp.charAt(j))) {
                                stackUsingA.pop();
//                    System.out.println("popping");
                            } else {
                                break;
                            }
                        }
                    }
//

                }

            } if (stackUsingA.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

    static class StackUsingA {

        private char[] data;
        private int top;

        public char[] getData() {
            return this.data;
        }

        public StackUsingA(int capacity) {
            this.data = new char[capacity];
            this.top = -1;
        }

        public int getTop() {
            return this.top;
        }

        public int size() {
            return this.data.length;
        }

        public boolean isEmpty() {
            if (top >= 0) {
                return false;
            }
            return true;
        }

        public boolean isFull() {
            if (this.size() == this.data.length) {
                return true;
            }
            return false;
        }

        public void push(char value) throws Exception {
            if (top == data.length - 1) {
                throw new Exception("Stack is full");
            } else {
                this.top++;
                this.data[top] = value;
            }
        }

        public char pop() throws Exception {
            if (this.top < 0) {
                throw new Exception("Stack is  empty");
            }
            char temp = this.data[this.top];
            this.data[this.top] = ' ';
            this.top--;
            return temp;
        }

        public void display() {
            for (int i = top; i > -1; i--) {
                System.out.println(data[i]);
            }
            System.out.println("END");
        }
    }
}

