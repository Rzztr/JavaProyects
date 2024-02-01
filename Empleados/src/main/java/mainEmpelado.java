public class mainEmpelado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado("Emliliano", "Corona", 24, 30000);
        Empleado emp2=new Empleado("Jose", "Caralarga", 23, 20000);
        
        System.out.println("Salario del empelado 1 es: "+emp1.getSalario());
        System.out.println("Sueldo empleado 2: "+emp2.getSalario());
        emp2.setSalario(1000);
        emp2.setEdad(45);
        System.out.println("Salario antes de aumento: "+emp2.getSalario());
        emp2.Aumento();
        System.out.println(emp2.toString());
    }
}
