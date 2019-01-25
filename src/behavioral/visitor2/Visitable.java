package behavioral.visitor2;

//Element interface
public interface Visitable{
    public void accept(Visitor visitor);
}