package learning.abstraction;

public
class TestClass {

    public static
    void main (String[] args) {
        ThreeSeries thr = new ThreeSeries ( );
        thr.accelerate ( );

        FiveSeries fv = new FiveSeries ( );
        fv.accelerate ( );

        BMW pop = new ThreeSeries ( );
        pop.commonFun ( );
        pop.accelerate ( );
    }
}
