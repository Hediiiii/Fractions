public class Fractions{
        public int numerateur;
        public int denominateur;

        public void to_strinG() {
            System.out.println("Je suis une fraction");
        }
    
        public Fractions(int numerateur, int denominateur){
            this.numerateur = numerateur;
            this.denominateur = denominateur;
        }

        public Fractions(int numerateur) {
            this.numerateur = numerateur;
            this.denominateur = 1;
        }

        public Fractions(){
            this.numerateur = 0;
            this.denominateur = 1;
        }

        public int getDenominateur() {
            return denominateur;
        }
        public int getNumerateur() {
            return numerateur;
        }
        public void setNumerateur(int numerateur) {
            this.numerateur = numerateur;
        }
        public void setDenominateur(int denominateur) {
            this.denominateur = denominateur;
        }


        public double doublevalue(){
            double a = this.numerateur;
            double b = this.denominateur;
            return a /  b ;
        }

        public Fractions add(Fractions f) {
            if (f.denominateur != this.denominateur){
                f.denominateur = f.denominateur* this.denominateur;
                f.numerateur = f.numerateur * this.denominateur;
                this.denominateur = this.denominateur * f.denominateur ;
                this.numerateur = this.numerateur * f.denominateur;}

            Fractions f1 = new Fractions(f.numerateur * this.numerateur, f.denominateur * this.denominateur);
            return f1;
            }

            public void test_sup(Fractions f) {
                assert f.doublevalue() > this.doublevalue() : "la fraction" + f.doublevalue() + "est inférieur à" + this.doublevalue();}

             public void test_inf(Fractions f) {
                assert f.doublevalue() < this.doublevalue() : "la fraction" + f.doublevalue() + "est supérieur à" + this.doublevalue();
            }

             public void test_egal(Fractions f) {
                assert f.doublevalue() == this.doublevalue() : "la fraction" + f.doublevalue() + "n'est pas égal à " + this.doublevalue();}
            
    }

