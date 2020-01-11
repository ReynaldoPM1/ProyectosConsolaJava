
public class ProyectoControlSalario{

 int num_emp;
 String nombre;
 int telefono;
 int edad;
 double bono;
 String hora;
  empleado (int num_emp, String nombre, int telefono,int edad, double bono , String hora)
  {
      this.num_emp=num_emp;
      this.nombre=nombre;
      this.telefono=telefono;
      this.edad=edad;
      this.bono=bono;
      this.hora=hora;
  }
  public void muestaEmp()
  {
        System.out.println("numero de emplead :"+num_emp);
        System.out.println("nombre            :"+nombre);
        System.out.println("telefono          :"+telefono);
        System.out.println("edad              :"+edad);
        System.out.println("bono              :"+bono);  
        System.out.println("hora              :"+hora);  
  }
  public void setNum_emp(int num_emp)
  {
      this.num_emp=num_emp;
  }
  public void setNombre(String nombre)
  {
      this.nombre=nombre;
  }
  public void setTelefono(int telefono)
  {
      this.telefono=telefono;
  }
  public void setEdad (int edad)
  {
      this.edad=edad;
  }
  public void setBono(double bono)
  {
      this.bono=bono;
  }
  public void setHora(String hora)
  {
      this.hora=hora;
  }
  public int getNum_emp()
  {
      return(num_emp);
  }
  public String getNombre()
  {
      return(nombre);
  }
  public int getTelefon()
  {
      return(telefono);
  }
  public int getEdad()
  {
      return(edad);
  }
  public double getBono()
  {
      return(bono);
  }
  public String getHora()
  {
      return(hora);
  }
}


 class Intendencia {

 int num_emp;
 String nombre;
 int telefono;
 int edad;
 String departamento;
 String dia;
  Intendencia (int num_emp, String nombre, int telefono,int edad, String departamento , String hora)
  {
      this.num_emp=num_emp;
      this.nombre=nombre;
      this.telefono=telefono;
      this.edad=edad;
      this.departamento=departamento;
      this.dia=dia;
  }
  public void muestaEmp()
  {
        System.out.println("numero de empleado :"+num_emp);
        System.out.println("nombre            :"+nombre);
        System.out.println("telefono          :"+telefono);
        System.out.println("edad              :"+edad);
        System.out.println("departamento      :"+departamento);  
        System.out.println("dia libre         :"+dia);  
  }
  public void setNum_emp(int num_emp)
  {
      this.num_emp=num_emp;
  }
  public void setNombre(String nombre)
  {
      this.nombre=nombre;
  }
  public void setTelefono(int telefono)
  {
      this.telefono=telefono;
  }
  public void setEdad (int edad)
  {
      this.edad=edad;
  }
  public void setDepartamento(String departamento)
  {
      this.departamento=departamento;
  }
  public void setDia(String dia)
  {
      this.dia=dia;
  }
  public int getNum_emp()
  {
      return(num_emp);
  }
  public String getNombre()
  {
      return(nombre);
  }
  public int getTelefon()
  {
      return(telefono);
  }
  public int getEdad()
  {
      return(edad);
  }
  public String getDepartamento()
  {
      return(departamento);
  }
  public String getDia()
  {
      return(dia);
  }
}