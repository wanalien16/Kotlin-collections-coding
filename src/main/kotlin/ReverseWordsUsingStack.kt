package org.example

import java.lang.StringBuilder
import java.util.Stack

class ReverseWordsUsingStack {
    fun reverseWords(str: String): String {
        val st = Stack<Char>()
        val result = StringBuilder()
        for (i in str.indices){
            if (str[i]!=' '){
                st.push(str[i])
            }else{
                while (!st.isEmpty()){
                    result.append(st.pop())
                }
                result.append(' ')
            }
        }
        while (!st.isEmpty()){
            result.append(st.pop())
        }
        return result.toString()


    }
}


    fun main() {
        val name = "Anil Sai"
        val instance = ReverseWordsUsingStack()
        val reversedName = instance.reverseWords(name)
        print(reversedName)
    }
