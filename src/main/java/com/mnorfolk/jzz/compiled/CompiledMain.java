package com.mnorfolk.jzz.compiled;


import com.mnorfolk.jzz.compiled.*;
import com.mnorfolk.jzz.compiled.classes.*;
import com.mnorfolk.jzz.compiled.func.*;
import com.mnorfolk.jzz.compiled.func.postop.*;

import static com.mnorfolk.jzz.compiled.func.InitializeFunc.*;
import com.mnorfolk.jzz.ex.*;
import static com.mnorfolk.jzz.compiled.Value.VOID;

/**
 * The main file. This is compiled from a .jzz file.
 *
 * @author Maxwell Norfolk
 */
public class CompiledMain {

public static void main(String[] args) {
Array arr = (Array)(new Array(new $String("are"), new $String("you"), new $String("as"), new $String("hungry"), new $String("as"), new $String("I"), new $String("am")));// line: 2
Iter it = (Iter)((ParenCallable)arr.it).callParen();                                 // line: 3
((ParenCallable)$while).callParen(it.has, new Func(new FunctionCode() {
@Override
public void call(Value...params){
if (params.length < 0 || params.length > 0)
throw new InvalidParamCountException("Expected [" + 0 + ", "
+ 0 + "], but instead got '" + params.length + "'.",
new IndexOutOfBoundsException());
((ParenCallable)print).callParen(Operator.PLUS.call(new $String(" "),Operator.MULTI.call(it)));// line: 5
Operator.INCREMENT.call(it);                                                         // line: 6
$return.callParen(); // default return (incase they don't return)
}}));// line: 4
((ParenCallable)println).callParen(new $String("?"));                                // line: 8
Operator.DECREMENT.call(it);                                                         // line: 9
((ParenCallable)$while).callParen(it.has, new Func(new FunctionCode() {
@Override
public void call(Value...params){
if (params.length < 0 || params.length > 0)
throw new InvalidParamCountException("Expected [" + 0 + ", "
+ 0 + "], but instead got '" + params.length + "'.",
new IndexOutOfBoundsException());
((ParenCallable)print).callParen(Operator.PLUS.call(new $String(" "),Operator.MULTI.call(it)));// line: 11
Operator.DECREMENT.call(it);                                                         // line: 12
$return.callParen(); // default return (incase they don't return)
}}));// line: 10
((ParenCallable)println).callParen(new $String("?"));                                // line: 14
((ParenCallable)println).callParen(new $String("Enter an index!"));                  // line: 16
Int index = (Int)((ParenCallable)in.nextInt).callParen();                            // line: 17
((ParenCallable)$while).callParen(new Func(new FunctionCode() {
@Override
public void call(Value...params){
if (params.length < 0 || params.length > 0)
throw new InvalidParamCountException("Expected [" + 0 + ", "
+ 0 + "], but instead got '" + params.length + "'.",
new IndexOutOfBoundsException());
$return.callParen((Operator.LTEQ.call(new Int(0),index).equals(Bool.TRUE) && Operator.LT.call(index,Operator.BAR.call(arr)).equals(Bool.TRUE)) ? new Bool(true) : new Bool(false)); // return the inside of brackets
}}), new Func(new FunctionCode() {
@Override
public void call(Value...params){
if (params.length < 0 || params.length > 0)
throw new InvalidParamCountException("Expected [" + 0 + ", "
+ 0 + "], but instead got '" + params.length + "'.",
new IndexOutOfBoundsException());
((ParenCallable)println).callParen(((BracketCallable)arr).callBracket(index));       // line: 19
Operator.SHIFT_R.call(in,index);                                                     // line: 20
$return.callParen(); // default return (incase they don't return)
}}));// line: 18
((ParenCallable)print).callParen(new $String("Invalid index!"));                     // line: 22
}}