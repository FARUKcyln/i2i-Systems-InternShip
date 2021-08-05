import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestNumber {

    @Test
    void isValid() {
        NumberValidator nv = new NumberValidator();
        assert nv.isValid(13) : "Pass";
        assert !nv.isValid(11) : "IsPrimeButNotFibonacci";
        assert !nv.isValid(34) : "IsFibonacciButNotPrime";
        assert !nv.isValid(35) : "IsNotPrimeAndNotFibonacci";
    }
}