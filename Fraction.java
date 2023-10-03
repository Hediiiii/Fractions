class Fraction {
        int numerateur;
        int denominateur;
}

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