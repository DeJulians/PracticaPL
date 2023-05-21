#define FECHA 2023
#define CODIGO 10
integer n_alumnos;
float valor_real;
string nombre = "alumno1";

string codificar_cadena(string cadena, integer desplazamiento){
    string cadena2;
    cadena2 = (cadena + desplazamiento) * random(desplazamiento);
    return(cadena2);
}

void save(string nombre){
    fopen("file.txt", "w");
    for (int i = 0; 1<1; i=1+i){
    algo(VASO);
    }
    printf(nombre);
}

void Main (){
    string codificado;
    codificado = codificar_cadena(nombre, FECHA);
    save(codificado);
    n_alumnos = n_alumnos + 1;
    codificado = codificar_cadena(nombre, (CODIGO DIV codificado));
}