package Parcial;

public class alfil{
	private int posHorizontal;
	private int posVertical;
	
public void hacerMovimiento(int nuevaHor, int nuevaVer) {
	int prubebaH = posHorizontal - nuevaHor;
	int pruebaV = posVertical - nuevaVer;
	if (Math.abs(pruebaV) == Math.abs(prubebaH)) {
		posHorizontal = nuevaHor;
		posVertical = nuevaVer;
		System.out.print("Se puede hacer el movimiento");
	} else {
		System.out.print("No se puede hacer el movimiento");
	}
	}
		



public void imprimirPosActual() {
	System.out.print(posHorizontal);
	System.out.print(posVertical);
}
}

