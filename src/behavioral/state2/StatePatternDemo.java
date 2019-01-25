package behavioral.state2;

public class StatePatternDemo {
    Controller controller;

    public void setState(String state) {
        controller = new Controller();
        //the following trigger should be made by the user
        if (state.equalsIgnoreCase("management"))
            controller.setManagementConnection();
        if (state.equalsIgnoreCase("sales"))
            controller.setSalesConnection();
        if (state.equalsIgnoreCase("accounting"))
            controller.setAccountingConnection();
    }

    public void doActions() {
        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }


    public static void main(String args[]) {

        StatePatternDemo statePatternDemo = new StatePatternDemo();
        statePatternDemo.setState("management");
        statePatternDemo.doActions();
        System.out.println();
        statePatternDemo.setState("sales");
        statePatternDemo.doActions();
        System.out.println();
        statePatternDemo.setState("accounting");
        statePatternDemo.doActions();
    }
}
