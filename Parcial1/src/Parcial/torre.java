package Parcial;

public class torre{
	private int posHorizontal;
	private int posVertical;
	
public void hacerMovimiento(int nuevaHor, int nuevaVer) {
	if (nuevaHor == posHorizontal && nuevaVer != posVertical) {
		posVertical = nuevaVer;
		System.out.print("Se puede hacer el movimiento");
	} else 	if (nuevaHor != posHorizontal && nuevaVer == posVertical) {
		posHorizontal = nuevaHor;
		System.out.print("Se puede hacer el movimiento");
	}else {
		System.out.print("No se puede hacer el movimiento");
	}
		
	}



public void imprimirPosActual() {
	System.out.print(posHorizontal);
	System.out.print(posVertical);
}
}

