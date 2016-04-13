package data;

public interface StateDAO {
	public State getStateById(int id);
	public State getStateByName(String name);
	public State getStateByAbbreviation(String abbreviation);
	public void addState(State state);
}
