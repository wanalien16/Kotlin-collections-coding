package org.example

import java.util.Stack

class BalancedParentheses {
    val st = Stack<Char>()

    fun isValidParentheses(str: String) : Boolean{
        for (i in str.indices){
            if (str[i] == '[' || str[i] == '{' || str[i] == '('){
                st.push(str[i])
            }else if (!st.empty() &&
                ((st.peek() == '(' && str[i] == ')') ||
                        (st.peek() == '{' && str[i] == '}') ||
                        (st.peek() == '[' && str[i] == ']'))) {
                st.pop()
            }
            else return false
        }
        return st.isEmpty()
    }
}
fun main(){
    val instance = BalancedParentheses()
    val input = "{[("
    val result = instance.isValidParentheses(input)
    print(result)
}