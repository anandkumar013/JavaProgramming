//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.*;
//class Test {
//    public static void main(String args[] ) throws Exception {
//        //BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        char [] charArray = str.toCharArray();
//        StringBuffer sb = new StringBuffer();
//
//        Stack<String> stack = new Stack<String>();
//        String result = "";
//
//        for(int i=0 ; i <charArray.length ; i++ ){
//            if(charArray[i] == '/')
//            {
//                // push to stack .
//                if(sb.length() >0){
//                    stack.push(sb.toString());
//                    sb=new StringBuffer();
//                }
//
//            } else if(charArray[i] == '\\'){
//                // pop all from stack and print
//                while(!stack.isEmpty())
//                    System.out.println(stack.pop());
//            } else
//            {
//                // add to string
//                /bookShelf +=charArray[i];
//            }
//        }
//        // Reading input from STDIN
//    }
//}
