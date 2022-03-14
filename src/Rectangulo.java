public class Rectangulo extends Figura implements Comparable<Rectangulo>{
	private double base;
	private double altura;

	public Rectangulo(double pBase, double pAltura){
		base = pBase;
		altura = pAltura;
	}
    public double calcularArea(){
		return base*altura;
	}
    public int numLados(){
        return 4;
    }
    public int compareTo(Rectangulo rectPorComparar){
		double areaPorComparar = rectPorComparar.calcularArea();
		double miArea = this.calcularArea();
        int ladosPorComparar =rectPorComparar.numLados();
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