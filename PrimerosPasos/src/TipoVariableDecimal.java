
public class TipoVariableDecimal {
	public static void main(String[] args) {

		double salario = 1259;
		double salario2 = 1259.50;
		double salario3 = 1259.55;
		double cuarto_salario = salario / 4;

		//int tercio_salario = 1259.55 / 4; ERROR: Type mismatch: cannot convert from double to int
		int tercio_salario = 1259 / 3;
		double tercio_salario2 = 1259 / 3;

		System.out.println("Salario = " + salario);
		System.out.println("Salario 2 = " + salario2);
		System.out.println("Salario 3 = " + salario3);
		System.out.println("Cuarto del salario (salario/4) = " + cuarto_salario);
		System.out.println("tercio del salario con Int (1259/3) = " + tercio_salario);
		System.out.println("tercio del salario2 con double (1259.55/3) = " + tercio_salario2);


	}

}
