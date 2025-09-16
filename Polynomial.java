public class Polynomial{
    double [] coeffs;

    public Polynomial(){
        coeffs = new double[1];
        coeffs[0]=0;
    }

    public Polynomial(double [] coeffs_new){
        coeffs=coeffs_new;
    }

    public Polynomial add(Polynomial other){
        int max_size= Math.max(this.coeffs.length,other.coeffs.length);
        double [] new_coeffs= new double[max_size];
        double current;
        for(int x=0;x<max_size;x++){
            current=0;
            if(x<this.coeffs.length)
                current+=this.coeffs[x];
            if(x<other.coeffs.length)
                current+=other.coeffs[x];
            new_coeffs[x]=current;
        }
        Polynomial p = new Polynomial(new_coeffs);
        return p;
    }

    public double evaluate(double num){
        double sum=0;
        for(int x=0;x<coeffs.length;x++)
            sum+=coeffs[x]*Math.pow(num,x);
        return sum;
    }

    public boolean hasRoot(double a){
        return this.evaluate(a)==0;
    }
}
