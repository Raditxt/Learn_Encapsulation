package pbo_a;

    public class Segitiga {
        private double alas;
        private double tinggi;

        // Constructor
        public Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
        }

        // Method to calculate the area of the triangle
        public double getLuas() {
            return 0.5 * alas * tinggi;
        }

        // Method to calculate the perimeter (assume it's an equilateral triangle for simplicity)
        public double getKeliling() {
            return 3 * alas;
        }

        // Setters and getters
        public void setAlas(double alas) {
            this.alas = alas;
        }

        public double getAlas() {
            return alas;
        }

        public void setTinggi(double tinggi) {
            this.tinggi = tinggi;
        }

        public double getTinggi() {
            return tinggi;
        }
    }

