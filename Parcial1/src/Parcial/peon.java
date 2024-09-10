package Parcial;

public class peon{
	private int posHorizontal;
	private int posVertical;
	private int startPosH;
	private int startPosV;


public Boolean estaInicial () {
	if(posHorizontal == startPosH) {
		if (posVertical == startPosV) {
			return true;
		}
	}
	return false;
}	
public void hacerMovimiento(int nuevaHor, int nuevaVer) {
	Boolean inicial = estaInicial();
	if (inicial == true) {
		if(nuevaHor == posHorizontal) {
			int resta = nuevaVer - posVertical;
			if (resta == 1 || resta == 2) {
				posHorizontal = nuevaHor;
				posVertical = nuevaVer;
				System.out.print("Se puede hacer el movimiento");
			}
		}
	}else if(inicial == false) {
		if(nuevaHor == posHorizontal) {
			int resta2 = nuevaVer-posVertical;
			if(resta2 == 1) {
				posHorizontal = nuevaHor;
				posVertical = nuevaVer;
				System.out.print("Se puede hacer el movimiento");
			}
		}
	} else {
		System.out.print("No se puede hacer el movimiento");
	}
}

public void imprimirPosActual() {
	System.out.print(posHorizontal);
	System.out.print(posVertical);
}}



