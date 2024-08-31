/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defensesystem;

/**
 *
 * @author BIHAN
 */
public interface Observable {
    
     
     void update(String arearClear);
     void updatePosition(String position,String positionName);
     
     void updateStrengthMassageHelicopter(String strengthMassage,String defenceName,String message);
     void updateStrengthMassageTank(String strengthMassage,String defenceName,String message);
     void updateStrengthMassageSubmarine(String strengthMassage,String defenceName,String message);
     
      void updateStrengthMassageAll(String strengthMassage,String defenceName,String message);
   
     //update main controller massage
     void updateMassageInMain(String strengthMassage,String defenceName);
     // set strength on button
     void updateButton(int stengthStr);
     
     void updateStrengthIntHelicopter(int strengthMassage);
     void updateStrengthIntTank(int strengthMassage);
     void updateStrengthIntSubmarine(int strengthMassage);
     
    
     
     void updateHelicopterMainController(int soldierCount,int ammoCount,int fuelCount,String massage);
     void updateTankMainController(int soldierCount,int ammoCount,int fuelCount,String massage);
     void updateSubmarineMainController(int soldierCount,int ammoCount,int fuelCount,String massage);
}
