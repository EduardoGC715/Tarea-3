import java.lang.Math;
public class Circulo extends Figura implements Comparable<Circulo>{
	private double radio;

	public Circulo(double pRadio){
		radio = pRadio;
	}
    public double calcularArea(){
		return Math.PI*(radio*radio);
    }
    public int numLados(){
        return 0;
    }
    public int compareTo(Circulo circPorComparar){
		double areaPorComparar = circPorComparar.calcularArea();
		double miArea = this.calcularArea();

        int ladosPorComparar =circPorComparar.numLados();
        int miLados = this.numLados();
        if(miArea==areaPorComparar){
			if (miLados==ladosPorComparar){
				return 7;
			}
			return 0;
		}
		else if (miArea > areaPorComparar){
			return 1;
		}
		else{
			return -1;
		}
	}
}