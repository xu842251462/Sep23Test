package DataStructure.ProblemSet.ProblemSet5;

import java.util.NoSuchElementException;

public class ProblemSet5 {
    static class Stack<T> {
        private Object[] array;
        private int size = 0;

        public Stack() {

        }

        public void push(T item) {
            if (size == array.length) {
                throw new IllegalStateException("Cannot add to full stack");
            }
            array[size++] = item;
        }

        public T pop() throws NoSuchElementException {

            if (size == 0) {
                throw new NoSuchElementException("Cannot pop from empty stack");
            }
            Object result = array[size - 1];
            array[--size] = null;
            return (T) result;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public Object peek() {
            if (size == 0) {
                throw new NoSuchElementException("Cannot peek into empty stack");
            }
            return array[size - 1];
        }

        public static <T> int size(Stack<T> S) {

            Stack<T> temp = new Stack<>();
            int count = 0;
            while (!S.isEmpty()) {
                temp.push(S.pop());
                count++;
            }
            while (!temp.isEmpty()) {
                S.push(temp.pop());
            }
            return count;
        }

        public static float Stack(String expr) {

            Stack<Float> stk = new Stack<Float>();
            for (int i = 0; i < expr.length(); i++) {
                char ch = expr.charAt(i);
                if (ch == ' ') {
                    continue;
                }
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    float second = stk.pop();
                    float first = stk.pop();
                    switch (ch) {
                        case '+':
                            stk.push(first + second);
                        case '-':
                            stk.push(first - second);
                        case '*':
                            stk.push(first * second);
                        case '/':
                            stk.push(first / second);

                    }
                    continue;
                }
                stk.push((float) Character.digit(ch, 10));
            }
            return stk.pop();

        }

    }
}
