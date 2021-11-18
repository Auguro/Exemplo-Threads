package util;

public class MedidorTempo {
	private Long start, end, elapsedTime;
	
	public void inicia() {
		start = System.nanoTime();
	}
	
	public void termina() {
		end = System.nanoTime();
		elapsedTime = end - start;
	}
	
	public Double getTimeInMilisec() {
		return elapsedTime / 1000000.0;
	}
	
	public Long getTimeInNanosec() {
		return elapsedTime;
	}
	
}