package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.func.Func;

import java.util.Scanner;

import static com.mnorfolk.jzz.compiled.func.InitializeFunc.$return;

/**
 * Represents a Scanner in java. This is used for files and user input (System.in)
 *
 * @author Maxwell Norfolk
 */
public class Scan implements Value {

    private Scanner scan;

    public Func has = new Func(p -> $return.callParen(new Bool(scan.hasNext())));
    public Func hasInt = new Func(p -> $return.callParen(new Bool(scan.hasNextInt())));
    public Func hasFloat = new Func(p -> $return.callParen(new Bool(scan.hasNextDouble())));
    public Func hasBool = new Func(p -> $return.callParen(new Bool(scan.hasNextBoolean())));


    public Func next = new Func(p -> $return.callParen(new $String(scan.next())));
    public Func nextInt = new Func(p -> $return.callParen(new Int(scan.nextInt())));
    public Func nextFloat = new Func(p -> $return.callParen(new Float(scan.nextDouble())));
    public Func nextBool = new Func(p -> $return.callParen(new Bool(scan.nextBoolean())));
    public Func nextLine = new Func(p -> $return.callParen(new $String(scan.nextLine())));

    public Scanner get() {
        return scan;
    }

    public Scan(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        this.scan = ((Scan) newVal).scan;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.Scan;
    }

    @Override
    public Value copy() {
        return new Scan(scan);
    }
}
