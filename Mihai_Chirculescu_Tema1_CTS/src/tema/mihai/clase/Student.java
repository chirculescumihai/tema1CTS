package tema.mihai.clase;

public class Student {
	
		private String nume;
		private int varsta;
		private double medieLiceu;
		private double medieBac;
		private double medieLicenta;
		private double medieAn1;
		private double medieAn2;
		private double medieAn3;
		
		public Student(String nume, int varsta, double medieBac, double medieLiceu, double medieLicenta,
				double medieAn1, double medieAn2, double medieAn3) {
			super();
			this.nume = nume;
			this.varsta = varsta;
			this.medieBac = medieBac;
			this.medieLicenta = medieLicenta;
			this.medieAn1 = medieAn1;
			this.medieAn2 = medieAn2;
			this.medieAn3 = medieAn3;
		}

		public String getNume() {
			return nume;
		}

		public void setNume(String nume) {
			this.nume = nume;
		}

		public int getVarsta() {
			return varsta;
		}

		public void setVarsta(int varsta) {
			this.varsta = varsta;
		}

		public double getMedieBac() {
			return medieBac;
		}

		public void setMedieBac(double medieBac) {
			this.medieBac = medieBac;
		}

		public double getMedieLicenta() {
			return medieLicenta;
		}

		public void setMedieLicenta(double medieLicenta) {
			this.medieLicenta = medieLicenta;
		}

		public double getMedieAn1() {
			return medieAn1;
		}

		public void setMedieAn1(double medieAn1) {
			this.medieAn1 = medieAn1;
		}

		public double getMedieAn2() {
			return medieAn2;
		}

		public void setMedieAn2(double medieAn2) {
			this.medieAn2 = medieAn2;
		}

		public double getMedieAn3() {
			return medieAn3;
		}

		public void setMedieAn3(double medieAn3) {
			this.medieAn3 = medieAn3;
		}
		
		public static double medieIntrare(Student s) {
			double medieIntrareC = 0.0;
			medieIntrareC = s.medieBac*0.7 + s.medieLiceu*0.3;
			return medieIntrareC;
		}
		
		public static double medieBursaAn1(Student s) {
			double bursa = 0.0;
			bursa = (s.medieBac + s.medieLiceu)/2;
			return bursa;
		}
		
		public static double medieBursaAn2(Student s)
		{
			double bursa = 0.0;
			bursa = (s.medieAn1 + s.medieBac)/2;
			return bursa;
		}
		
		public static double medieBursaAn3(Student s)
		{
			double bursa = 0.0;
			bursa = (s.medieAn1 + s.medieAn3)/2;
			return bursa;
		}
		
		public static double medieBursaPremiere(Student s)
		{
			double bursa = 0.0;
			bursa = (s.medieAn1 + s.medieAn3 + s.medieAn3)/3;
			return bursa;
		}
		
		public static double medieMasterAn1(Student s)
		{
			double bursa = 0.0;
			bursa = (s.medieAn1 + s.medieAn3 + s.medieAn3)*0.3 + s.medieLicenta*0.7;
			return bursa;
		}
		
		public static double medieMasterAn2(Student s)
		{
			double bursa = 0.0;
			bursa = (s.medieAn1 + s.medieAn3 + s.medieAn3)*0.3 + s.medieMasterAn1(s)*0.7;
			return bursa;
		}
		
		public static double medieDizertatie(Student s)
		{
			double bursa = 0.0;
			bursa = s.medieMasterAn1(s) + s.medieMasterAn2(s);
			return bursa;
		}
}
