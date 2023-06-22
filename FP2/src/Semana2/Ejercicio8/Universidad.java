package Semana2.Ejercicio8;

public class Universidad {
    public Universidad() {
        Alumno[] alumnos = new Alumno[3];
        alumnos[0] = new Alumno("u111", "James", "Huiza", 17,15,18,13,16);
        alumnos[1] = new Alumno("u222", "Pedro", "Ortiz", 15,14,10,17,19);
        alumnos[2] = new Alumno("u333", "Erik", "Aviles", 10,9,10,12,11);

        double[] promedios = new double[alumnos.length];
        //promedios[0] = alumnos[0].calcularPromedio();
        //promedios[1] = alumnos[1].calcularPromedio();
        //promedios[2] = alumnos[2].calcularPromedio();

        //Cargamos el arreglo con los promedios de todos los alumnos
        for(int i=0; i<alumnos.length; i++) {
            promedios[i] = alumnos[i].calcularPromedio();
        }

        //Imprime lo solicitado en el punto a:
        for(int i=0; i<promedios.length; i++){
            System.out.println("Alumno: " + alumnos[i].nombre + " " + alumnos[i].apellido + " tiene promedio " + promedios[i]);
        }
        System.out.println("El promedio de todos los alumnos es: " + this.calcularPromedioTotalAlumnos(promedios));

        //Imprime lo solicitado en el punto b:
        System.out.println("El mayor promedio es: " + this.obtenerPromedioMayor(promedios));

        //Imprime lo solicitado en el punto c:
        alumnos = this.validarNotaParcialxAlumno(alumnos);
        for(int i=0; i<alumnos.length; i++) {
            promedios[i] = alumnos[i].calcularPromedio();
        }
        System.out.println("Datos modificados....");
        for(int i=0; i<promedios.length; i++){
            System.out.println("Alumno: " + alumnos[i].nombre + " " + alumnos[i].apellido + " tiene promedio " + promedios[i]);
        }
        System.out.println("El promedio de todos los alumnos es: " + this.calcularPromedioTotalAlumnos(promedios));

        //Imprimir lo solicitado en el punto d:
        Alumno[] alumnosAprobados = this.obtenerAlumnosAprobados(alumnos, promedios);
        for(int i=0; i<alumnosAprobados.length; i++) {
            System.out.println("Alumno Aprobado: " + alumnosAprobados[i].nombre + " " + alumnosAprobados[i].apellido);
        }

        //Imprimir lo solicitado en el punto e:
        this.buscarAlumnoImprimir(alumnos, promedios, "u111");
    }

    public double calcularPromedioTotalAlumnos(double[] promedio) {
        double suma = 0;
        for(int i=0; i<promedio.length; i++) {
            suma += promedio[i];
        }

        return suma / promedio.length;
    }

    public double obtenerPromedioMayor(double[] promedio) {
        double mayor = 0.0;
        for (int i=0; i<promedio.length; i++) {
            if(promedio[i] > mayor) {
                mayor = promedio[i];
            }
        }

        return mayor;
    }

    public Alumno[] validarNotaParcialxAlumno(Alumno[] alumnos) {
        for(int i=0; i<alumnos.length; i++) {
            if(alumnos[i].notaParcial == 12) {
                alumnos[i].notaParcial += 1;
            }
        }

        return alumnos;
    }

    public Alumno[] obtenerAlumnosAprobados(Alumno[] alumnos, double[] promedios) {
        //Obtener el numero de alumnos aprobados.
        int contador = 0;
        for(int i=0; i<promedios.length; i++) {
            if(promedios[i] >= 13) {
                contador += 1;
            }
        }

        Alumno[] alumnosAprobados = new Alumno[contador];
        int contadorAprobados = 0;
        for(int i=0; i<promedios.length; i++) {
            if(promedios[i] >= 13) {
                alumnosAprobados[contadorAprobados] = alumnos[i];
                contadorAprobados += 1;
            }
        }

        return alumnosAprobados;
    }

    public void buscarAlumnoImprimir(Alumno[] alumnos, double[] promedios, String codigo) {
        for(int i=0; i<alumnos.length; i++) {
            if(alumnos[i].codigo.equals(codigo)) {
                System.out.println("Datos de Alumno Encontrado");
                System.out.println("--------------------------");
                System.out.println("Codigo: " + alumnos[i].codigo);
                System.out.println("Nombre: " + alumnos[i].nombre);
                System.out.println("Apellido: " + alumnos[i].apellido);
                System.out.println("Promedio: " + promedios[i]);
                break;
            }
        }
    }
}
