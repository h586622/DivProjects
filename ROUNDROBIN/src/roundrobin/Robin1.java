package roundrobin;

public class Robin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] test = {"lag1", "lag2", "lag3", "lag4", "lag5", "lag6","lag7","lag8"};

		robinTabOdd(test);
	}

	public static void robinTall(int antall) {
	
		int n = 1 ;
		int k = 0;
		while(n<antall-k) {
		System.out.println(n + " - " + (antall-k));
		n++;
		k++;
		}	
	}
	
	public static void robinTab(String[] tab) {
		
		for (int i = 0; i< tab.length-1; i++) {
			int n = 0;
			int k = 0;
			while(n<tab.length-k) {
				System.out.println(tab[n] + " - " + tab[tab.length-k-1]);
				n++;
				k++;
			}
			String[] nytab = new String[tab.length];
			nytab[0] = tab[0];
			nytab[1] = tab[tab.length-1];
			for (int x = 1; x<tab.length-1; x++) {
				nytab[x+1] = tab[x];								
			}
			tab=nytab;
			System.out.println();
		}
		
	}
	public static void robinTabOdd(String[] tab) {
		
		if(tab.length%2 != 0) {
			String[] oddTab = new String[tab.length+1];
			for(int s = 0; s< tab.length; s++) {
				oddTab[s] = tab[s];
			}
			oddTab[oddTab.length-1] = null;
			tab = oddTab;
		}
		
		for (int i = 0; i< tab.length-1; i++) {

			int n = 0;
			int k = 0;
			while(n<tab.length-k) {
				System.out.println(tab[n] + " - " + tab[tab.length-k-1]);
				n++;
				k++;
			}
			String[] nytab = new String[tab.length];
			nytab[0] = tab[0];
			nytab[1] = tab[tab.length-1];
			for (int x = 1; x<tab.length-1; x++) {
				nytab[x+1] = tab[x];								
			}
			tab=nytab;
			System.out.println();
		}
		
	}
}
