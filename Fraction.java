class Fraction {
    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }

    private int numerateur;
    private int denominateur;


    Fraction(int numerateur, int denominateur) 
        { this.numerateur = numerateur ;
          this.denominateur = denominateur; 
        } 
    Fraction(int numerateur) 
        { this.numerateur = numerateur;
          denominateur =1;
        } 

    Fraction() 
        { this.numerateur = 0;
          this.denominateur = 1;
         }

    public static final Fraction ZERO = new Fraction(0,1);
    public static final Fraction UN = new Fraction(1,1);

    public int getNumerateur(){
        return numerateur;
    }
    public int getDenominateur(){
        return denominateur;
    }
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

}