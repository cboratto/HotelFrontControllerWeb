package hotelaria.controle.base;

public class ApplicationControllerFactory {
    public static final ApplicationController getControllerByClass(Class actionClass) {
        try {
            ApplicationController controller;
            controller = (ApplicationController) actionClass.newInstance();

            return (ApplicationController) actionClass.newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
            
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            
        } catch (ClassCastException e) {
            e.printStackTrace();
            
        }
        return null;
    }

    public static final ApplicationController getControllerByFullClassName(String className) {
        try {
            String name = "hotelaria.controle.appcontrollers." + className + "Controller";
            Class actionClass = Class.forName(name);
            return getControllerByClass(actionClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

