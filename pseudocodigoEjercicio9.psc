Algoritmo pseudocodigoEjercicio9
	Repetir
		Escribir "Ingrese la temperatura 1: "
		Leer T1
		Escribir "Ingrese la temperatura 2: "
		Leer T2
		si T1>4 Y T1<16 Entonces
			contador=contador+1
			suma=suma+T1
		FinSi
		si T2>4 Y T2<16 Entonces
			contador=contador+1
			suma=suma+T2
		FinSi
	Hasta Que T1==0
	
	prom<-suma/(contador)
	Escribir "Cantidad de datos analizados :v: ",contador
	Escribir "El promedio es: ",prom
	
	
FinAlgoritmo
