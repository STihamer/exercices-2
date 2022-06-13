package second_part.ex8;

public class Add {

    public  void sumOfInputs(Integer... varargs) {

        for (int i = 0; i < varargs.length; i++) {
            int counter = varargs[0];
            for (int j = 1; j <= i; j++) {
                if (i == 3) {
                    break;
                } else {
                    counter = counter + varargs[j];
                    if (j == 1) {
                        System.out.print(varargs[0]);
                    }
                    if (j != i) {
                        System.out.print(" " + " + " + varargs[j]);
                    } else {
                        System.out.print(" " + " + " + varargs[j] + " = " + counter);
                        System.out.println();

                    }

                }

            }

        }
    }
}
