package chainOfResponsibliltyHandson;

public interface ILeaveRequestHandler {
	void nextHandler(ILeaveRequestHandler next);

	void HandleRequest(LeaveRequest lr);
}