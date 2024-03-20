public class ComplexTest {
    public static void main(String[] args)
    {
        Complex z1 = new Complex(27.5,2.5);
        Complex z2 = new Complex(5.75,6);
        Complex z3 = new Complex(0,99);
        Complex z4 = new Complex(21.1,0);

        System.out.println("Addition with Z1:" + z1.toString()  +" and Z2:" + z2.toString());
        Complex numberAdd = z1.add(z2);
        Complex addExpected = new Complex(33.25,8.5);
        equalCheck(numberAdd, addExpected);

        System.out.println("Subtraction with Z1:" + z1.toString()  +" and Z2:" + z2.toString());
        Complex numberSub = z2.sub(z4);
        Complex subExpected = new Complex(-15.35,6);
        equalCheck(numberSub, subExpected);

        System.out.println("Multiplication with Z1:" + z1.toString()  +" and Z2:" + z2.toString());
        Complex numberMul = z4.mul(z3);
        Complex mulExpected = new Complex(0,2088.9);
        equalCheck(numberMul, mulExpected);

        System.out.println("Division with Z1:" + z1.toString()  +" and Z2:" + z2.toString());
        Complex numberDiv = z2.div(z1);
        Complex divExpected = new Complex(0.22,0.23);
        equalCheck(numberDiv, divExpected);


        Complex i = new Complex(0,1);
        System.out.println("Multiplication with Z1:" + i.toString()  +" and Z2:" + i.toString());
        Complex numberMul2 = i.mul(i);
        Complex mulExpected2 = new Complex(-1,0);
        equalCheck(numberMul2, mulExpected2);
    }

    static private void equalCheck(Complex numberGot, Complex numberExpected) {
        if (numberGot.equals(numberExpected)) {
            System.out.println("Ok");
        } else {
            System.out.println("FAILED: expected " + numberExpected + " got " + numberGot);
        }
    }
}