package res.algebratypes;

public abstract class MultigradedAlgebraComputation<T> extends MultigradedComputation<T> implements MultigradedAlgebra<T>
{
    public abstract ModSet<T> times(T a, T b);
}

