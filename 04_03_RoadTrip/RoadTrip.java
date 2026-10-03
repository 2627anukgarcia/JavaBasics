public class RoadTrip{
	public static void main(String[] args){
		
	double distancia = 347.8;
	double consum = 6.7; //per cada 100 km
	double preugas = 1.92; // per llitre
	int passatger = 4;
	double peatge = 12.65;
	int menjaranada = 30;
	int menjartornada = 30;
	double aparcament = 18.5;
	
	double totaldist = distancia*2;
	double combtotal = totaldist/100;
	double llitrestotal = combtotal*consum;
	double preutotgas = llitrestotal*preugas;
	double peatgestotal = peatge*2;
	double menjartotal = (double) menjaranada+menjartornada;
	double costtotal = preutotgas+peatgestotal+menjartotal+aparcament;
	double costpersona = costtotal/4;
	
	System.out.printf("=========== ROAD TRIP =========== %nRound trip distance: %9.2f km %n---------------------------------%nFuel needed: %17.2f L %nFuel cost: %19.2f € %n--------------------------------- %nTolls: %23.2f € %nParking price: %15.2f €%nFood: %24.2f € %n---------------------------------%nTotal trip cost:%14.2f €%nPassengers: %18d%nCost per passenger: %10.2f €%n=================================%n", totaldist, llitrestotal, preutotgas, peatgestotal,aparcament,menjartotal,costtotal,passatger,costpersona);
		
		
	}
	
	
}