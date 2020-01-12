package OOP.call;

import java.util.ArrayList;
import java.util.HashMap;

public class CallCenterProcessor {

    public CallCenterProcessor(HashMap<Level, ArrayList<Employee>> employees) {
       //some init
    }

    public Employee getHandlerForCall(Call call){
        return null;
    }

    public void dispatchCall(Call call) {
        Employee employee = getHandlerForCall(call);
        employee.handleCall(call);
    }
}
