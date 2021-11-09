package com.tool;

import java.util.Stack;

/**
 * 工具类,处理一些数据 并做计算
 * 用 等号= 作为结束符号
 *
 */
public class calculate {

    //数字栈：用于存储表达式中的各个数字
    private static Stack<Double> numberStack = null;

    //符号栈：用于存储运算符和括号
    private static Stack<String> symbolStack = null;



    /**
     * 解析并计算四则运算表达式(含括号)，返回计算结果
     * @param numStr 算术表达式(含括号)
     * @return
     */
    public static double calculator(String numStr){
        //去掉所有空格
        numStr = removeStrSpace(numStr);

        // 检查表达式是否合法

        if (!isStandard(numStr)) {
             System.err.println("错误：算术表达式有误！");
             return 0;
        }

        //初始化栈
        numberStack = new Stack();
        symbolStack = new Stack();

        //用于缓存数字，因为数字可能是多位的
        StringBuilder temp = new StringBuilder();

        //从表达式的第一个字符开始处理
        for(int i = 0; i < numStr.length(); i++){
            //获取一个字符
            char ch = numStr.charAt(i);
            //若当前字符是数字
            if(isNumber(ch)){
                //加到数字缓存
                temp.append(ch);
            }else {
                //不是数字,将数字缓存转为字符串
                String tempStr = temp.toString();
                if(!tempStr.isEmpty()){
                    //将tempStr转为double压栈
                    numberStack.add(Double.parseDouble(tempStr));
                    // 重置数字缓存
                    temp = new StringBuilder();
                }
                // 判断运算符的优先级，若当前优先级低于栈顶的优先级，则先把计算前面计算出来
                while(!comparePri(ch) && !symbolStack.empty()) {
                    //出栈，取出数字，后进先出
                    double num2 = numberStack.pop();
                    double num1 = numberStack.pop();
                    // 取出运算符进行相应运算，并把结果压栈进行下一次运算
                    switch (symbolStack.pop()) {
                        case "+":
                            numberStack.push(num1 + num2);
                            break;
                        case "-":
                            numberStack.push(num1 - num2);
                            break;
                        case "*":
                            numberStack.push(num1 * num2);
                            break;
                        case "/":
                            numberStack.push(num1 / num2);
                            break;
                        default:
                            break;
                    }
                }// while循环结束

                //判断有没有输完
                if(ch != '='){
                    // 符号入栈
                    String s = String.valueOf(new Character(ch));
                    symbolStack.push(s);
                    // 去括号
                    if(s.equals(")")){
                        symbolStack.pop();
                        symbolStack.pop();
                    }
                }
            }
        }// for循环结束

        // 返回计算结果
        return numberStack.pop();
    }

    /**
    * 去除字符串中的所有空格
    */
      private static String removeStrSpace(String str) {
          return str != null ? str.replaceAll(" ", "") : "";
      }

    /**
     * 检查算术表达式的基本合法性，符合返回true，否则false
     */
    private static boolean isStandard(String numStr){
        if(numStr == null || numStr.isEmpty()){
            //表达式不能为空
            System.out.println("表达式为空");
            return false;
        }
        // 用来保存括号，检查左右括号是否匹配
        Stack<String> stack = new Stack();


        for(int i = 0; i < numStr.length(); i++){
            char n = numStr.charAt(i);
            //判断字符是否合法 每个字符必须是 {数字、+、-、*、/、=、（、）} 其中之一
            if(!(isNumber(n) || "(".equals(n+"") || ")".equals(n+"") || "+".equals(n+"") ||
            "-".equals(n+"") || "*".equals(n) || "/".equals(n+"") || "=".equals(n+""))){
                System.out.println("输入了不是数字且不是符号的东西");
                return false;
            }
            // 将左括号压栈，用来给后面的右括号进行匹配
            if ("(".equals(n + "")) {
                 stack.push(n + "");
            }
            //匹配括号,当出现右括号时，判断，如果栈是空的，或者栈顶元素不是左括号，不匹配。
            if(")".equals(n + "")){
                if(stack.isEmpty() || !"(".equals(stack.pop())){
                    System.out.println("括号不匹配，少左边的");
                    return false;
                }
            }
        }
        // 可能会有缺少右括号的情况
        if(!stack.isEmpty()){
            System.out.println("缺少右括号");
            return false;
        }
        return true;
    }

    /**
     *
     * @param num char类型，判断字符是不是数字或者.
     * @return
     */
    private static boolean isNumber(char num){
        if(num >= '0' && num <= '9' || num == '.'){
            return true;
        }
        System.out.println("输了个：" + num);
        return false;
    }

    /**
     * 比较优先级：如果当前运算符比栈顶元素运算符优先级高则返回true，否则返回false
     * 符号优先级说明（从高到低）:
     * 第1级: (
     * 第2级: * /
     * 第3级: + -
     * 第4级: )
     * @param symbol
     * @return
     */
    private static boolean comparePri(char symbol){
        if(symbolStack.empty()){
            //空栈返回ture
            return true;
        }
        // 查看堆栈顶部的对象，不出栈
        char top = symbolStack.peek().charAt(0);

        if(top == '('){
            return true;
        }
        //比较优先级
        switch (symbol){
            //优先级最高
            case '(':
                return true;

                //优先级比+和-高
            case '*':
                if(top == '+' || top == '-'){
                    return true;
                }else {
                    return false;
                }

                //优先级比+和-高
            case '/':
                if(top == '-' || top == '+'){
                    return true;
                }else {
                    return false;
                }
            case '+':
                return false;
            case '-':
                return false;
            case ')':
                return false;
            case '=':
                return false;
            default:
                break;
        }
        return true;
    }


}
