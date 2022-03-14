public class Triangulo extends Figura implements Comparable<Triangulo>{
	private double base;
	private double altura;

	public Triangulo(double pBase, double pAltura){
		base = pBase;
		altura = pAltura;
	}
    public double calcularArea(){
		return base*altura/2;
	}
    public int numLados(){
        return 3;
    }
    public int compareTo(Triangulo triaPorComparar){
		double areaPorComparar = triaPorComparar.calcularArea();
		double miArea = this.calcularArea();
        int ladosPorComparar =triaPorComparar.numLados();
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