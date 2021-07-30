package com.xworkz.streamtask.tester;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamTester {

	public static void main(String[] args) {
		

				Collection<String> watchBrand = Arrays.asList("ROLEX", "TITAN" , "SEIKO", "IWC", "Chumbak" , "Daniel Klein", "RADO" ,
						"DressBerry");
				Collection<String> watch = watchBrand.stream().filter((a) -> a.startsWith("T")).collect(Collectors.toSet());
				System.out.println(watch.size());
				System.out.println(watch);

				

				Collection<String> pan = Arrays.asList("KA2020PAN96", "AP2020PAN67", "AC2020PAN16", "GA2020PAN02", "GA2020PAN86");
				Collection<String> panmatch = pan.stream().filter((b) -> b.startsWith("A")).collect(Collectors.toSet());
				System.out.println(panmatch);

				
				Collection<String> usn = Arrays.asList("2AB14EC090", "2AB14CS86", "2AB14EC012", "2AB14EC001" ,"2AB14CS015" , "2AB14CS025" );
				Collection<String> usnmatch  = usn.stream().filter((a) -> a.contains("CS")).collect(Collectors.toSet());
				System.out.println(usnmatch);
		

	}

}
