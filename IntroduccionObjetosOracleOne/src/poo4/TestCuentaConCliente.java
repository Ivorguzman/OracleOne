package poo4;

public class TestCuentaConCliente {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego Rojas";
        diego.documento = "33442211";
        diego.telefono = "987654321";

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.deposita(100);

        cuentaDeDiego.titular = diego;
        System.out.println(cuentaDeDiego.titular.nombre);
    }
    
}
