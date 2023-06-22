package vk.test;

import java.util.HashMap;
import java.util.Stack;

public class ValidateParenthesis {
    public static void main(String args[]) {
        String test = "{(a11)}";
        System.out.println(validate(test));
    }
    private static boolean validate(String test) {
        HashMap<Character,Character> mapParam = new HashMap<>();
        mapParam.put('}','{');
        mapParam.put(']','[');
        mapParam.put(')','(');
        mapParam.put('1','a');
        Stack<Character> stackParenthesis = new Stack<>();
        char[] charArray = test.toCharArray();
        for (char ch : charArray) {
           // if ((ch == '{') || (ch == '(') || (ch == '['))
            if(mapParam.values().contains(ch))
            {
                stackParenthesis.push(ch);
            }
           // else if ((ch == '}') || (ch == ')') || (ch == ']'))
            else
            {
                if(stackParenthesis.isEmpty())
                    return false;
               char  ch1= stackParenthesis.peek();
              if(! mapParam.get(ch).equals(ch1))
                  return false;
              stackParenthesis.pop();
            }
            }
        return stackParenthesis.isEmpty();
        }
    }