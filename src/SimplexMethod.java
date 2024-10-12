import java.util.Scanner;

public class SimplexMethod {
    private static final double EPS = 1e-9;
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of variables of objective function:");
        int nVars = sc.nextInt();
        System.out.println("Enter the number of constraints:");
        int nConstrs = sc.nextInt();

        double[] c = new double[nVars];
        System.out.println("Enter the coefficients of the objective function (a,b, ...): Z= ax1 + bx2+...");
        for (int i = 0; i < nVars; i++) {
            c[i] = sc.nextDouble();
        }

        double[][] a = new double[nConstrs][nVars];
        double[] b = new double[nConstrs];
        System.out.println("Enter the coefficients of the constraints (a, b, ... and vector B): ax1 + bx2 + ... <= vecB");
        for (int i = 0; i < nConstrs; i++) {
            for (int j = 0; j < nVars; j++) {
                a[i][j] = sc.nextDouble();
            }
            b[i] = sc.nextDouble();
        }


        printProblem(c, a, b, "max");

        double[] res = simplex(c, a, b);

        if (res == null) {
            System.out.println("The method is not applicable!");
        } else {
            System.out.println("Solution found:");
            for (int i = 0; i < res.length - 1; i++) {
                System.out.printf("x%d = %.5f%n", i + 1, res[i]);
            }
            System.out.printf("Objective function value: %.5f%n", res[res.length - 1]);
        }

    }



    private static void printProblem(double[] c, double[][] a, double[] b, String optimizationType) {
        System.out.println("Optimization problem:");
        System.out.printf("   - %s z = ", optimizationType.equalsIgnoreCase("max") ? "max" : "min");
        for (int i = 0; i < c.length; i++) {
            if (i > 0) System.out.print(" + ");
            System.out.printf("%.2f*x%d", c[i], i + 1);
        }
        System.out.println();
        System.out.println("   - subject to the constraints:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("      ");
            for (int j = 0; j < a[i].length; j++) {
                if (j > 0) System.out.print(" + ");
                System.out.printf("%.2f*x%d", a[i][j], j + 1);
            }
            System.out.printf(" <= %.2f%n", b[i]);
        }
        System.out.println();
    }

    private static double[] simplex(double[] c, double[][] a, double[] b) {
        int nVars = c.length;
        int nConstrs = a.length;

        double[][] tbl = new double[nConstrs + 1][nVars + nConstrs + 1];


        for (int i = 0; i < nConstrs; i++) {
            for (int j = 0; j < nVars; j++) {
                tbl[i][j] = a[i][j];
            }
            tbl[i][nVars + i] = 1.0;
            tbl[i][nVars + nConstrs] = b[i];


            if (b[i] < 0) {
                return null;
            }
        }

        for (int j = 0; j < nVars; j++) {
            tbl[nConstrs][j] = -c[j];
        }

        int iter = 0;

        while (true) {
            iter++;
            System.out.printf("Iteration %d:%n", iter);
            printConstr(tbl, nVars, nConstrs);


            int pCol = -1;
            double mostNeg = 0;
            for (int j = 0; j < nVars + nConstrs; j++) {
                if (tbl[nConstrs][j] < mostNeg - EPS) {
                    mostNeg = tbl[nConstrs][j];
                    pCol = j;
                }
            }


            if (pCol == -1) {
                double[] res = new double[nVars + 1];
                for (int i = 0; i < nConstrs; i++) {
                    for (int j = 0; j < nVars; j++) {
                        if (Math.abs(tbl[i][j] - 1.0) < EPS) {
                            res[j] = tbl[i][nVars + nConstrs];
                        }
                    }
                }
                res[nVars] = tbl[nConstrs][nVars + nConstrs];
                return res;
            }


            int pRow = -1;
            double minRatio = Double.MAX_VALUE;
            boolean hasValidPivot = false;

            for (int i = 0; i < nConstrs; i++) {
                if (tbl[i][pCol] > EPS) {
                    double ratio = tbl[i][nVars + nConstrs] / tbl[i][pCol];
                    hasValidPivot = true;
                    if (ratio < minRatio) {
                        minRatio = ratio;
                        pRow = i;
                    }
                }
            }

            if (!hasValidPivot) {
                System.out.println("The problem is unbounded: No valid pivot row found.");
                return null;
            }

            System.out.printf("Selected pivot element in row %d and column %d:%n", pRow + 1, pCol + 1);
            printConstrP(tbl, nVars, nConstrs, pRow, pCol);

            piv(tbl, pRow, pCol, nVars, nConstrs);
        }
    }


    private static void piv(double[][] tbl, int pRow, int pCol, int nVars, int nConstrs) {
        int nRows = tbl.length;
        int nCols = tbl[0].length;

        double pVal = tbl[pRow][pCol];

        for (int j = 0; j < nCols; j++) {
            tbl[pRow][j] /= pVal;
        }

        for (int i = 0; i < nRows; i++) {
            if (i != pRow) {
                double factor = tbl[i][pCol];
                for (int j = 0; j < nCols; j++) {
                    tbl[i][j] -= factor * tbl[pRow][j];
                }
            }
        }
    }

    private static void printConstr(double[][] tbl, int nVars, int nConstrs) {
        for (int i = 0; i < nConstrs; i++) {
            System.out.print("  ");
            for (int j = 0; j < nVars + nConstrs; j++) {
                if (j < nVars) {
                    System.out.printf("%.2f*x%d ", tbl[i][j], j + 1);
                } else {
                    System.out.printf("%.2f*s%d ", tbl[i][j], j - nVars + 1);
                }
                if (j < nVars + nConstrs - 1) {
                    System.out.print("+ ");
                }
            }
            System.out.printf("= %.2f%n", tbl[i][nVars + nConstrs]);
        }

        System.out.print("  ");
        for (int j = 0; j < nVars + nConstrs; j++) {
            if (j < nVars) {
                System.out.printf("%.2f*x%d ", tbl[nConstrs][j], j + 1);
            } else {
                System.out.printf("%.2f*s%d ", tbl[nConstrs][j], j - nVars + 1);
            }
            if (j < nVars + nConstrs - 1) {
                System.out.print("+ ");
            }
        }
        System.out.printf("= %.2f%n", tbl[nConstrs][nVars + nConstrs]);
    }

    private static void printConstrP(double[][] tbl, int nVars, int nConstrs, int pRow, int pCol) {
        System.out.println("Current simplex tableau with the selected pivot element:");

        for (int i = 0; i < nConstrs; i++) {
            System.out.print("  ");
            for (int j = 0; j < nVars + nConstrs; j++) {
                String format = "%.2f";
                if (i == pRow && j == pCol) {
                    format = ANSI_RED + "%.2f" + ANSI_RESET;
                }
                if (j < nVars) {
                    System.out.printf(format + "*x%d ", tbl[i][j], j + 1);
                } else {
                    System.out.printf(format + "*s%d ", tbl[i][j], j - nVars + 1);
                }
                if (j < nVars + nConstrs - 1) {
                    System.out.print("+ ");
                }
            }
            System.out.printf("= %.2f%n", tbl[i][nVars + nConstrs]);
        }

        System.out.print("  ");
        for (int j = 0; j < nVars + nConstrs; j++) {
            String format = "%.2f";
            if (nConstrs == pRow && j == pCol) {
                format = ANSI_RED + "%.2f" + ANSI_RESET;
            }
            if (j < nVars) {
                System.out.printf(format + "*x%d ", tbl[nConstrs][j], j + 1);
            } else {
                System.out.printf(format + "*s%d ", tbl[nConstrs][j], j - nVars + 1);
            }
            if (j < nVars + nConstrs - 1) {
                System.out.print("+ ");
            }
        }
        System.out.printf("= %.2f%n%n", tbl[nConstrs][nVars + nConstrs]);
    }
}
