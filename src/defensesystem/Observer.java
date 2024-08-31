/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;

import java.util.ArrayList;

/**
 *
 * @author BIHAN
 */
public class Observer {
     ArrayList<Observable>ObservableArrayList = new ArrayList<>();
   
    public void setHelicopterValues(int soldierCount , int ammoCount, int fuelCount, String massage){
        
        for(Observable observable :ObservableArrayList){
            observable.updateHelicopterMainController(soldierCount, ammoCount, fuelCount, massage);
        }
    }
    public void setSubmarineValues(int soldierCount , int ammoCount, int fuelCount, String massage){
       
        for(Observable observable :ObservableArrayList){
            observable.updateSubmarineMainController(soldierCount, ammoCount, fuelCount, massage);
        }
    }
    public void setTankValues(int soldierCount , int ammoCount, int fuelCount, String massage){
       
        for(Observable observable :ObservableArrayList){
            observable.updateTankMainController(soldierCount, ammoCount, fuelCount, massage);
        }
    }
    
    public void setAreaClear(String areaClear){
        for(Observable observable :ObservableArrayList){
            observable.update(areaClear);
        }
    }
    // set position
    public void setPosition(String position,String positionName){
        for(Observable observable :ObservableArrayList){
            observable.updatePosition(position,positionName);
        }
    }
    // set strength
    public void setStrngthHelicopter(String strength, String defenceName,String message){
         for(Observable observable :ObservableArrayList){
            observable.updateStrengthMassageHelicopter(strength,defenceName,message);
        }
    }
    public void setStrngthTank(String strength, String defenceName,String message){
         for(Observable observable :ObservableArrayList){
            observable.updateStrengthMassageTank(strength,defenceName,message);
        }
    }
    public void setStrngthSubmarine(String strength, String defenceName,String message){
         for(Observable observable :ObservableArrayList){
            observable.updateStrengthMassageSubmarine(strength,defenceName,message);
        }
    }
    public void setStrngthAll(String strength, String defenceName,String message){
         for(Observable observable :ObservableArrayList){
            observable.updateStrengthMassageAll(strength,defenceName,message);
        }
    }
    ////////send massage to main controller
    
    public void setMessageToMainController(String massage, String defenceName){
        for(Observable observable :ObservableArrayList){
            observable.updateMassageInMain(massage,defenceName);
        }
    }
    
    //////////////set strength on button
    public void setStrngthIntHelicopter(int strength){
         for(Observable observable :ObservableArrayList){
            observable.updateStrengthIntHelicopter(strength);
        }
    }
    public void setStrngthIntTank(int strength){
         for(Observable observable :ObservableArrayList){
            observable.updateStrengthIntTank(strength);
        }
    }
    public void setStrngthIntSubmarine(int strength){
         for(Observable observable :ObservableArrayList){
            observable.updateStrengthIntSubmarine(strength);
        }
    }
    public void setStrengthString(int stengthStr){
        for(Observable observable :ObservableArrayList){
            observable.updateButton(stengthStr);
        }
    }
    public void addObservers(Observable observable){
        ObservableArrayList.add(observable);
    }
    
    
    
    
}
